package java_course.jdbc;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * W przypadku generowania klucza głównego przez bazę, można podczas wstawiania rekordów
 * pomijać podawanie pól typu id.
 * Wywołując metodę executeUpdate(String SQL, Statement.RETURN_GENERATED_KEYS)
 * dostępne będą klucze główne nadane przez bazę.
 * Wartości kluczy znajdują się w ResultSet zwracanym przez metodę:
 * statement.getGeneratedKeys();
 */
public class _06_UpdateStatement {
    public static void main(String[] args) {
        try (
                Connection connection = _01_JdbcConnection.connection("jdbc:mysql://localhost/blog", "root", "1234");
                Statement statement = connection.createStatement();
        ) {
            statement.execute("drop table if exists  games");
            statement.execute("create table games(id int primary key auto_increment, title varchar(30), rating int)");
            statement.executeUpdate("insert into games(title, rating) values ('Call of Duty', 10), ('Angdy Birds', 8), ('Pong', 4)", Statement.RETURN_GENERATED_KEYS);
            ResultSet generatedKeys = statement.getGeneratedKeys();
            int count = 1;
            while (generatedKeys.next()) {
                System.out.println("Rekord nr " + count++ + " ma id " + generatedKeys.getInt(1));
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
