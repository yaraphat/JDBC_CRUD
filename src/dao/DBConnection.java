package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {

    private static DBConnection DBC = null;
    private Connection con = null;

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        if (DBC == null) {
            DBC = new DBConnection();
        }
        return DBC;
    }

    public synchronized Connection getConnection(String databaseName) {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // For mysql database
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/"+databaseName, "root", "");
        } catch (ClassNotFoundException | SQLException e) {
        }
        return con;
    }

    public synchronized void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
        }
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException e) {
        }
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
        }
    }

}
