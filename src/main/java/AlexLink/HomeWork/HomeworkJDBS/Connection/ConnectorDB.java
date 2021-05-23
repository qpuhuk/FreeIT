package AlexLink.HomeWork.HomeworkJDBS.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectorDB {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/videoteka";
        Properties prop = new Properties();
        prop.put("user","root");
        prop.put("password","Boybot007!");

        return DriverManager.getConnection(url, prop);
    }


}
