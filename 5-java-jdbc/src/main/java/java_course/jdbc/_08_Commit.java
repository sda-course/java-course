package java_course.jdbc;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.Scanner;

/**
 * Domyślnie wszystkie polecenia są wykonywane w trybie tzw. auto commit.
 * Oznacza to, że każde execute powoduje nie tylko wykonanie polecenia po
 * stronie bazy, ale i trwałe zapisanie zmian w tabelach.
 * Sa jedna sytuacje, gdy należy wykonać kilka zależnych od siebie poleceń i gdy
 * jedno z poleceń nie zostanie wykonane lub jego zwrócona wartość nie spełnia jakiegoś warunku,
 * to należy wszystkie wcześniejsze polecenia odwołać, aby stan bazy był, jakby nic się nie zmieniło.
 * Aby można było odwołać taki ciąg instrukcji, to należy wyłączyć auto commit,
 * a ciąg zależnych instrukcji umieścić w transakcji.
 */
public class _08_Commit {
    public static void main(String[] args) {
        try (
                Connection connection = _01_JdbcConnection.connection("jdbc:mysql://localhost/blog", "root", "1234");
                Statement statement = connection.createStatement();
        ) {
            //wyłączenie auto commit
            connection.setAutoCommit(false);
            //zapisujemy początek ciągu instrukcji stanowiących transakcję.
            Savepoint startTransaction = connection.setSavepoint("start");
            //Chcemy dokonać transferu punktów 50 punktów miedzy dwoma graczami od id 1 i 2, ale
            //tylko wtedy, gdy gracz ma wystarczająca liczbę punktów
            //Nie możemy tego zrobić jednym poleceniem
            statement.executeUpdate("update players set points = points - 50 where id = 1");
            statement.executeUpdate("update players set points = points + 50 where id = 2");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Look to table players using workbench and check update.");
            System.out.println("Press any key to continue ...");
            scanner.next();
            ResultSet resultSet = statement.executeQuery("select points from players where id = 1");
            if (resultSet.next()){
                int donorPoints = resultSet.getInt("points");
                if (donorPoints >= 0) {
                    connection.commit();
                } else {
                    connection.rollback(startTransaction);
                }
            } else {
                connection.rollback(startTransaction);
            }
            } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
