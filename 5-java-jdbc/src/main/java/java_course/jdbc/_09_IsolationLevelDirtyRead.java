package java_course.jdbc;

import java.lang.reflect.InvocationTargetException;
import java.net.ConnectException;
import java.sql.*;
import java.util.Scanner;

/**
 * Nasz program nie musi być jedynym, który łączy się z daną bazą, i co
 * gorsza, inni klienci mogą w tym samym czasie modyfikować dane, które
 * w naszym programie odczytujemy.
 * W takiej sytuacji silnik bazodanowy może włączać mechanizmy izolowania
 * sesji jednocześnie połączonych klientów. W zależności od poziomu izolacji
 * zmiany, których dokonujemy, mogą być od razu widoczne lub publikowanie tych zmian
 * może zostać odłożone w czasie.
 */
public class _09_IsolationLevelDirtyRead {
    public static void main(String[] args) {
        try (
                Connection connection = _01_JdbcConnection.connection("jdbc:mysql://localhost/blog", "root", "1234");
                Connection connectionSecond = _01_JdbcConnection.connection("jdbc:mysql://localhost/blog", "root", "1234");
                Statement statement = connection.createStatement();
                Statement statementSecond = connectionSecond.createStatement();
        ) {
            connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            connectionSecond.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            connection.setAutoCommit(false);
            connectionSecond.setAutoCommit(false);
            Savepoint savepoint1 = connection.setSavepoint();
            Savepoint savepoint2 = connectionSecond.setSavepoint();
            System.out.println("Transaction 1 - begin.");
            System.out.println("Transaction 1 - new player inserted!");
            statement.executeUpdate("insert into players(id, name, points) values(10, 'adam', 100)");
            System.out.println("Transaction 2 - begin.");
            System.out.println("Transaction 2 - select table players.");
            ResultSet set = statementSecond.executeQuery("select * from players");
            while(set.next()){
                String name = set.getString("name");
                System.out.println( name + (name.equals("adam") ? " - new player!" :""));
            }
            set.close();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input any char to rollback transaction 1.");
            scanner.next();
            System.out.println("Transaction 1 - rollback!");
            connection.rollback(savepoint1);
            System.out.println("Transaction 2 - trying select player with name 'adam'.");
            set = statementSecond.executeQuery("select * from players where name = 'adam'");
            while(set.next()){
                System.out.println(set.getString("name"));
            }
            System.out.println("Where is player 'adam'?");
            System.out.println("First select in transaction 2 returned DIRTY READ!");
            set.close();
            System.out.println("Transaction 2 - commits.");
            connectionSecond.commit();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        } catch (InvocationTargetException invocationTargetException) {
            invocationTargetException.printStackTrace();
        } catch (NoSuchMethodException noSuchMethodException) {
            noSuchMethodException.printStackTrace();
        } catch (InstantiationException instantiationException) {
            instantiationException.printStackTrace();
        } catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.printStackTrace();
        }
    }
}
