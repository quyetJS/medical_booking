package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBContext {

    protected Connection connection;

    public DBContext() {
        try {
            String serverName = "database.cvuua3k5atka.ap-southeast-1.rds.amazonaws.com";//đang kết nối với database cloud aws database.cvuua3k5atka.ap-southeast-1.rds.amazonaws.com
            String dbName = "medical_booking";
            String portNumber = "3306";
            String user = "admin";
            String pass = "12345678";
            String url = "jdbc:mysql://"+serverName+":"+portNumber+"/"+dbName;
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
