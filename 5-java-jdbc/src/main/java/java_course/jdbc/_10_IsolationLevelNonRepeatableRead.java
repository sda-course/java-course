package java_course.jdbc;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.Scanner;

public class _10_IsolationLevelNonRepeatableRead {
    public static void main(String[] args) {
        try (
                Connection connection = _01_JdbcConnection.connection("jdbc:mysql://localhost/blog", "root", "1234");
                Connection connectionSecond = _01_JdbcConnection.connection("jdbc:mysql://localhost/blog", "root", "1234");
                Statement statement = connection.createStatement();
                Statement statementSecond = connectionSecond.createStatement();
        ) {
            connection.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
            connectionSecond.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
            connection.setAutoCommit(false);
            connectionSecond.setAutoCommit(false);
            Savepoint savepoint1 = connection.setSavepoint();
            Savepoint savepoint2 = connectionSecond.setSavepoint();
            System.out.println("Transaction 1 - begin.");
            System.out.println("Transaction 2 - begin.");
            System.out.println("Transaction 1 - calculates sum of points for all players.");
            ResultSet sum = statement.executeQuery("select sum(points) from players");
            int firstSum = 0;
            if(sum.next()){
                firstSum = sum.getInt(1);
                System.out.println("Sum of players points = " + firstSum);
            }
            System.out.println("Transaction 2 - modify points for player with id =1.");
            statementSecond.executeUpdate("update players set points = 200 where id = 1");
            System.out.println("Transaction 2 - select all players");
            ResultSet set = statementSecond.executeQuery("select * from players");
            while(set.next()){
                System.out.println(set.getString("name") + " " + set.getInt("points"));
            }
            set.close();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input any char to commit transaction 2.");
            scanner.next();
            System.out.println("Transaction 2 - commit!");
            connection.rollback(savepoint1);
            System.out.println("Transaction 1 - calculating again.");
            sum = statement.executeQuery("select sum(points) from players");
            int secondSum = 0;
            if(sum.next()){
                secondSum = sum.getInt(1);
                System.out.println("Sum of players points = " + secondSum);
            }
            if (firstSum != secondSum) {
                System.out.println("We have different sums " + firstSum + " != " + secondSum +" !");
            } else {
                System.out.println("Both sums are equals!");
            }
            System.out.println("Transaction 1 - commits.");
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
