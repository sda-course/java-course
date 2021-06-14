package java_course.jdbc;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;

/**
 * Metadane ResultSet zawierają informacje o danych, czyli:
 *  - ile kolumn znajduje się w zbiorze,
 *  - nazwy kolumn zbioru,
 *  - typ każdej kolumny,
 *  - klasy dla każdej z kolumn,
 *  - pozostałe informacje o kolumnach.
 */
public class _11_ResultSetMetaData {
    public static void main(String[] args) {
        try (
                Connection connection = _01_JdbcConnection.connection("jdbc:mysql://localhost/blog", "root", "1234");
                Statement statement = connection.createStatement();
        ) {
            ResultSet set = statement.executeQuery("select * from players");
            //Pobranie metadanych z ResultSet
            ResultSetMetaData meta = set.getMetaData();
            while(set.next()){
                //Dla każdego wiersza iterujemy po jego kolumnach.
                for(int i = 1; i <= meta.getColumnCount(); i++){
                    String columnClassName = meta.getColumnClassName(i);
                    String tableName = meta.getTableName(i);
                    //Metoda set.getObject(i) zwraca dane w kolumnie jako obiekt klasy Object, więc w tej postaci
                    //można jedynie je wyświetlić.
                    System.out.print(meta.getColumnName(i) + ": " + set.getObject(i) + ", ");
                }
                System.out.println();
            }
            set.close();
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
