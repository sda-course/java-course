package java_course.jdbc;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.Scanner;

public class _03_ResultSet {
    public static void main(String[] args) {
        try (
                Connection connection = _01_JdbcConnection.connection("jdbc:mysql://localhost/blog", "root", "1234");
        ) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from players");
            while(resultSet.next()){
                String name = resultSet.getString("name");
                int id = resultSet.getInt("id");
                Timestamp timestamp = resultSet.getTimestamp("register");
                //Jeśli w bazie w kolumnie points wystąpi NULL, to
                //metoda getInt() zwróci 0, co nie jest poprawną daną
                int points = resultSet.getInt("points");
                //po każdym odczycie metodą getXXX, można sprawdzić, czy dana w bazie była równa NULL
                if(resultSet.wasNull()){
                    System.out.println("Record: " + id + " " + name + " null " + timestamp);
                } else {
                    System.out.println("Record: " + id + " " + name + " " + points + " " + timestamp);
                }
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
