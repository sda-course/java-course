package java_course.jdbc;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

/**
 * Interfejs Statement definiuje metody do tworzenia, wysyłania i wykonywania zapytań SQL
 * Tworzenie obiektu zapytania
 *  - connection.createStatement() - tworzenie uniwersalnego obiektu do wysyłania dowolnych zapytań typu Statement
 *  - connection.prepareStatement() - tworzenie zapytań parametrycznych typu PreparedStatement
 *  - connection.prepareCall() - tworzenie zapytań wywołujących procedury składowane typu CallableStatement
 *  Metody tworzące występują w kilku przeciążonych wersjach i niektóre zostaną wyjaśnione później.
 *  Obiekt interfejs Statement posiada metody do wykonywania zapytania, które są natychmiast wykonywane:
 *   - statement.execute(String SQL);           - wartość zwracana typu logicznego wskazuje, czy polecenie zwróciło wynik
 *   - statement.executeUpdate(String SQL);     - wartość zwracana typu int wskazuje, ile wierszy zostało zaktualizowanych
 *   - statement.executeQuery(String SQL);      - wartość zwraca to obiekt ResultSet z wynikami zapytania
 *   W sytuacji wykonywania dużej liczby zapytań np. wstawiających dane do tabeli można skorzystać z wykonywania wsadowego:
 *   - metodą statement.addBatch(String SQL) można dodawać kolejne polecenie, które nie są wykonywane
 *   - metodą statement.executeBatch() wykonuje się wszystkie metody dodane przez addBatch
 *   - metodą statement.executeLargeBatch() wykonuje się wszystkie metody, jeśli ich liczba przekracza liczby typu int
 *   Obie metody zwracają tablicę liczb int lub long, każdy z elementów tablicy odpowiada wykonaniu jednego polecenia, w wartość
 *   elementu tablicy informuje o liczbie zmodyfikowanych wierszy tym poleceniem
 */
public class _02_Statements {
    public static void main(String[] args) {
        try (
                Connection connection = _01_JdbcConnection.connection("jdbc:mysql://localhost/blog", "root", "1234");
        ) {
            Statement statement = connection.createStatement();
            connection.createStatement();
            statement.execute("drop table if exists players");
            boolean isResultSet = statement.execute("create table players(id int primary key, name varchar(20), points int, register timestamp not null)");
            System.out.println("Statement executed and table players created. Is ResultSet returned? " + isResultSet);
            int rowsCount = statement.executeUpdate(
                    "insert into players(id, name, points) values " +
                            " (1, 'alex', 125)," +
                            " (2, 'tom', 15)," +
                            " (3, 'kate', 155)"
            );
            System.out.println("Insert statement executed and " + rowsCount + " was inserted!");
            rowsCount = statement.executeUpdate("update players set points = 450 where id = 2");
            System.out.println("Update statement executed and " + rowsCount + " was updated!");
            rowsCount = statement.executeUpdate("delete from players where id = 3");
            System.out.println("Delete statement executed and " + rowsCount + " was deleted!");

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
