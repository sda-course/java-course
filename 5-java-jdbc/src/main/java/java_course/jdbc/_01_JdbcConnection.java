package java_course.jdbc;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class _01_JdbcConnection {
    private static final String DRIVER_URL = "com.mysql.cj.jdbc.Driver";

    //Metoda statyczna, która będziemy używać do tworzenia połączenia z bazą
    public static Connection connection(String databaseUrl, String user, String password) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
        try {
            DriverManager.getDriver(DRIVER_URL);
        } catch (SQLException throwables) {
            Class.forName(DRIVER_URL).getConstructor().newInstance();
        }
        return DriverManager.getConnection(databaseUrl, user, password);
    }

    public static void createPlayersTableAndInsert(Connection connection){
        try(Statement statement = connection.createStatement()){
            statement.execute("drop table if exists players");
            boolean isResultSet = statement.execute("create table players(id int primary key auto_increment, name varchar(20), points int, register timestamp not null)");
            int rowsCount = statement.executeUpdate(
                    "insert into players(name, points) values " +
                            " ('alex', 125)," +
                            " ('tom', 15)," +
                            " ('kate', 155)"
            );
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void printResultSet(ResultSet set) throws SQLException {
        ResultSetMetaData meta = set.getMetaData();
        while(set.next()){
            for(int i = 1; i <= meta.getColumnCount(); i++){
                System.out.print(meta.getColumnName(i) + ": " + set.getObject(i) + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
            System.out.println("Database driver loaded successfully!");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/blog??allowMultiQueries=true", "root", "1234");
            System.out.println("Connection do database created!");
            Statement statement = connection.createStatement();
            boolean execute = statement.execute("select * from user");
            System.out.println("Query for statement executed successfully!");
            if (execute) {
                System.out.println("Query returned data as ResultSet");
                System.out.println("ResultSet object: " + statement.getResultSet());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Nie ma takie klasy sterownika!");
            //e.printStackTrace();
        } catch (InvocationTargetException e) {
            //e.printStackTrace();
        } catch (InstantiationException e) {
            System.out.println("Nie można utworzyć klasy sterownika. Brak takiego konstruktora!");
            //e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("Konstruktor niedostępny!");
            //e.printStackTrace();
        } catch (NoSuchMethodException e) {
            //e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Błąd w trakcie tworzenia połączenia lub wykonywania polecenia SQL!");
            //e.printStackTrace();
        }
    }
}
