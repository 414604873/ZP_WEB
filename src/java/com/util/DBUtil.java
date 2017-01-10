/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 数据库连接工具类
 */
package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hp-pc
 */
public class DBUtil {

    private Connection con;
    private PreparedStatement sql;

    public Connection getConnection() throws ClassNotFoundException, Exception {
        String username = "root";
        String password = "admin";
        String url = "jdbc:mysql://192.168.1.10:3306/zpdatabase";//192.168.1.10
        String driver = "com.mysql.jdbc.Driver";

        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet executQuery(String sqlString, String[] args) {
        try {
            con = getConnection();
            sql = con.prepareStatement(sqlString);
            if (args != null) {
                for (int i = 0; i < args.length; i++) {
                    sql.setString((i + 1), args[i]);
                }
            }
            ResultSet re = sql.executeQuery();
            return re;
        } catch (Exception e) {
            System.out.println("错误，SQLHelper的68~74行" + e);
            return null;
        }
    }
}
