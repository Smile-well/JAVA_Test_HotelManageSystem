package com.jdbc.utils;

import java.sql.*;

/**
 * JDBC工具类
 */
public class DBUtils {
    private DBUtils() {

    }

    //静态代码块在类加载时执行，只执行一次
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接对象
     *
     * @return 返回数据库连接对象
     * @throws SQLException 无法连接数据库时抛出异常
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("yourselfUrl", "yourselfName", "youselfPsw");
    }

    /**
     * 关闭资源
     *
     * @param connection 连接对象
     * @param statement  数据库操作对象
     * @param resultSet  查询结果集
     */
    public static void close(Connection connection, Statement statement, ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
