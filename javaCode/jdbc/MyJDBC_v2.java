package com.jdbc;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;

public class MyJDBC_v2 {
    public static void main(String[] args) {
        //初始化界面
        Map<String,String> userInfo = initUI();
        //返回登录结果
        boolean loginSuccess = login(userInfo);
        System.out.println(loginSuccess ? "登录成功" : "登陆失败");
    }

    /**
     * 用户初始化界面
     * @return 用户输入的用户名和密码等登录信息
     */
    private static Map<String,String> initUI() {
        Scanner s = new Scanner(System.in);

        System.out.println("用户名：");
        String loginName = s.nextLine();

        System.out.println("密码：");
        String psw = s.nextLine();

        Map<String,String> userInfo = new HashMap<>();
        userInfo.put("loginName",loginName);
        userInfo.put("psw",psw);

        return userInfo;

    }

    /**
     * 用户登录
     * @param userInfo 用户信息
     * @return true成功，false失败
     */
    private static boolean login(Map<String, String> userInfo) {
        boolean loginSuccess = false;

        String loginName = userInfo.get("loginName");
        String psw = userInfo.get("psw");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        // 从属性配置文件获取信息
        ResourceBundle bundle=ResourceBundle.getBundle("jdbc");
        String diver=bundle.getString("driver");
        String url=bundle.getString("url");
        String user=bundle.getString("user");
        String password=bundle.getString("password");

        try {
            //1、注册驱动Class.forName
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2、获取数据库连接（获取三个参数URL、用户名、密码）
            connection= DriverManager.getConnection(url,user,password);
            //3、获取预编译的数据库操作对象PreparedStatement，预编译SQL语句，防止SQL注入
            //     其中一个?代表一个占位符，不能用单引号括起来
            String sql = "select * from t_user where loginName= ? and psw = ?";
            preparedStatement = connection.prepareStatement(sql);
            //给占位符传值（第一个问号下标是1，JDBC所有下标从1开始）
            preparedStatement.setString(1,loginName);
            preparedStatement.setString(2,psw);
            //4、执行SQL语句
            resultSet = preparedStatement.executeQuery();
            //5、处理查询结果集
            if (resultSet.next()) {
                loginSuccess = true;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            //在finally中释放资源,由内到外关闭
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
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
        return loginSuccess;
    }
}
