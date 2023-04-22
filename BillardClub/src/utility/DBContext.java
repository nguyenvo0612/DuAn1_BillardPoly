/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Acer
 */
public class DBContext {
    private static Connection conn;
    
    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String dburl = "jdbc:sqlserver://localhost:1433;databaseName=QuanBida";//kết nối db
    static String user = "sa";//tài khoản 
    static String pass = "123456";//mật khẩu
    public static Connection getConnection() {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String dbUser = "sa", dbPass = "123456", dbUrl = "jdbc:sqlserver://localhost:1433"
                    + ";databaseName=QuanBida;encrypt=true;trustServerCertificate=true;";

            conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return conn;
    }
    public static Connection ketnoi(String database) {
        try {
            String user = "sa";
            String pass = "123456";

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=" + database+";trustServerCertificate=true";
            Connection cn = DriverManager.getConnection(url, user, pass);
            return cn;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
      public static PreparedStatement getStmt(String sql, Object... args) throws Exception {
        Connection con = DriverManager.getConnection(dburl, user, pass);//kết nối
        PreparedStatement stmt;
        if (sql.trim().startsWith("{")) {
            stmt = con.prepareCall(sql);//câu lệnh SQl là thủ tục
        } else {
            stmt = con.prepareStatement(sql);//câu lệnh sql select
        }

        for (int i = 0; i < args.length; i++) {//i = 0 suy ra câu truy vấn không có ?
            stmt.setObject(i + 1, args[i]);//đẩy dữ liệu vào dấu ?
        }
        return stmt;
    }

    public static ResultSet query(String sql, Object... args) throws Exception {
        PreparedStatement stmt = DBContext.getStmt(sql, args);
        return stmt.executeQuery();//trả về rs "preparestatement có thể chạy executeQuery"
    }

}
