package jdbc;

import java.sql.*;

public class StatementDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sys", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet set = stmt.executeQuery("Select * from sys.sys_config");
        while(set.next()){
            System.out.println(set.getString(1));
        }
        conn.close();
    }
}
