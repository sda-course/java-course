package java_course.jdbc;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.Scanner;

public class _04_SQLInjection {
    public static void main(String[] args) {
        try (
                Connection connection = _01_JdbcConnection.connection("jdbc:mysql://localhost/blog?allowMultiQueries=true", "root", "1234");
                Scanner scanner = new Scanner(System.in);
                Statement statement = connection.createStatement();
        ) {
            _01_JdbcConnection.createPlayersTableAndInsert(connection);
            System.out.println("Aktualne wiersze tabeli players");
            _01_JdbcConnection.printResultSet(statement.executeQuery("select * from players"));
            System.out.println("Wpisz nazwę wyszukiwanego gracza:");
            //Jeśli wpiszesz: 'tom', to zostanie znaleziony gracz zgodnie z intencją programisty
            //Jeśli wpiszesz: 'tom' or 1=1, to zapytanie zwróci listę wszystkich graczy
            //Jeśli wpiszesz: 'tom'; drop table players, to usuniesz tabelę z danymi (jeśli możliwe jest wykonywanie wielu poleceń w jednym wywołaniu execute())_
            //Praktycznie możesz wpisać każde polecenie, które będzie wykonane, a uzyskany efekt
            //odbiega od tego jakiego oczekiwał tworzący je programista
            //Możliwość przekazywania nowych poleceń SQL w miejscach, w których ich nie planowo
            //nazywane jest SQLInjection
            String nameParam = scanner.nextLine();
            statement.executeQuery("select * from players where `name` = " + nameParam);
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int id = resultSet.getInt("id");
                Timestamp timestamp = resultSet.getTimestamp("register");
                Integer points = resultSet.getInt("points");
                System.out.println("Record: " + id + " " + name + " " + points + " " + timestamp);
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
