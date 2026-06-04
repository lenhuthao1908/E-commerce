package context;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {
    /*USE BELOW METHOD FOR YOUR DATABASE CONNECTION*/
    /*DO NOT EDIT THE BELOW METHOD, YOU MUST USE ONLY THIS ONE FOR YOUR DATABASE CONNECTION*/
    public Connection getConnection() throws Exception {
        String url = "";
        if (dbType.equalsIgnoreCase("postgresql")) {
            url = "jdbc:postgresql://" + serverName + "/" + dbName + "?sslmode=require";
            Class.forName("org.postgresql.Driver");
        } else if (dbType.equalsIgnoreCase("mysql")) {
            url = "jdbc:mysql://" + serverName + "/" + dbName + "?useSSL=true";
            Class.forName("com.mysql.cj.jdbc.Driver");
        } else if (dbType.equalsIgnoreCase("sqlserver")) {
            url = "jdbc:sqlserver://" + serverName + ";databaseName=" + dbName;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } else {
            throw new Exception("Unsupported database type: " + dbType);
        }
        return DriverManager.getConnection(url, userID, password);
    }

    /*Insert your other code right after this comment*/
    /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
    private final String dbType = "postgresql"; // Change this to "mysql" or "sqlserver" as needed
    private final String serverName = "ep-plain-bar-a18ptdwy-pooler.ap-southeast-1.aws.neon.tech";
    private final String dbName = "DEV022025";
    private final String userID = "postgre_db_owner";
    private final String password = "iv31fQxcuPyV";

    public static void main(String[] args) {
        try {
            Connection conn = new DBContext().getConnection();
            if (conn != null) {
                System.out.println("Successfully connected to " + new DBContext().dbType + " database");
            }
        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}
