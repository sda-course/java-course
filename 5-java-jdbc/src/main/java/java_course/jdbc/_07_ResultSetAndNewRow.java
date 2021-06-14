package java_course.jdbc;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

/**
 * ResultSet umożliwia dokonywanie trwałych zmian podczas jego przeglądania np. można wstawić nowy rekord do bazy
 * mając dostęp do przeglądanego wyniku zapytania.
 * Aby to mogło być możliwe, należy skonfigurować obiekt Statement, który będzie zdolny do zwracania
 * obiektów ResultSet z takimi możliwościami.
 */
public class _07_ResultSetAndNewRow {
    public static void main(String[] args) {
        try (
                Connection connection = _01_JdbcConnection.connection("jdbc:mysql://localhost/blog", "root", "1234");
                //Tak zbudowany obiekt Statement będzie zdolny do zwracania obiektów ResultSet, które  modyfikują dane w bazie.
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
        ) {
            ResultSet set = statement.executeQuery("select * from games");
            while (set.next()) {
                System.out.println("id: " + set.getInt("id") + ", title: " + set.getString("title") + ", rating: " + set.getInt("rating"));
                //chcemy dodać jedną nową grę, aby nie dodawana była kilka razy, to dodamy ją gdy przeglądamy ostatni rekord
                if (set.isLast()){
                    //Ta metoda przenosi aktualny kursor do nowego, pustego wiersza
                    set.moveToInsertRow();
                    //Te metody aktualizują nowy wiersz, który nie zawiera
                    //Metody udpdateXXX można wywoływać gdy kursor wskazuje na istniejący wiersz. W ten sposób można modyfikować dane w wierszach
                    set.updateInt("rating", new Random().nextInt(100));
                    set.updateString("title", "Hula Hop");
                    //nie musimy podawać pola id, bo generowanie jego wartości jest po stronie bazy
                    set.insertRow();
                    System.out.println("New game inserted to ResultSet and database!");
                    //Uwaga nowa gra jest teraz na końcu ResultSet, więc musimy wyjść z pętli,
                    //inaczej będziemy ją dodawać w nieskończoność!!!
                    break;
                }
            }
            Scanner scanner = new Scanner(System.in);
            scanner.next();
            //ResultSet ma też możliwość przewijania w obie strony
            set.beforeFirst();
            //Można teraz przejrzeć zaktualizowany ResultSet od początku.
            //Należy tylko pamiętać, że przeglądanie od nowa ResultSet dotyczy tylko danych po stronie aplikacji.
            //Jeśli w tym czasie dane tabeli w bazie zostały zmodyfikowane, to w naszym ResultSet tych zmian nie zobaczymy,
            //musimy na nowo wykonać zapytanie!!!
            while(set.next()){
                System.out.println("id: " + set.getInt("id") + ", title: " + set.getString("title") + ", rating: " + set.getInt("rating"));
            }
            set.close();
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
