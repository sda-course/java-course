package java_course.jdbc;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.Scanner;

/**
 * PreparedStatement zabezpiecza przed SQLInjection.
 * Nigdy nie tworzymy zapytań metodą konkatenacji łańcuchów, a szczególnie
 * jeśli łańcuch pochodzi z zewnętrznego źródła: użytkownika, strumienia wejściowego, sieci itd.
 */
public class _05_PreparedStatement {
    public static void main(String[] args) {
        try (
                Connection connection = _01_JdbcConnection.connection("jdbc:mysql://localhost/blog", "root", "1234");
                Scanner scanner = new Scanner(System.in);
        ) {
            System.out.println("Podaj id gracza?");
            int id = scanner.nextInt();
            //Znak ? oznacza miejsce, w którym zostanie umieszczony parametr
            PreparedStatement statement = connection.prepareStatement("select * from players where id = ?");
            //Umieszczenie wartości parametru w miejscy 1 znaku zapytania
            //Metody o nazwie setXXX określają typ parametru
            statement.setInt(1, id);
            //Wykonanie polecenia
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                System.out.println("Gracz o id " + id + " : " + resultSet.getString("name"));
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
