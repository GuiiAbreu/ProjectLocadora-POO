package Locadora.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConFactory {
//    private Connection connection;

/*    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:3456/Locadora";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "senhaSQL");
        connection = DriverManager.getConnection(url, props);
        return connection;
    }*/

    public Connection getConnection() throws SQLException, ClassNotFoundException{
        Connection conn = null;

                try {
                        Class.forName("org.postgresql.Driver");
                        Properties props = new Properties();
                        String url = props.getProperty("url");
		        String user = props.getProperty("user");
		        String password = props.getProperty("password");
                        conn = DriverManager.getConnection(url,user,password);
                } catch (IOException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
        return conn;
    }
}
