/**
 * 标准六步
 *      1、注册驱动Class.forName
 *      2、获取数据库连接（获取三个参数URL、用户名、密码）
 *      3、获取数据库操作对象PreparedStatement
 *      4、调用executeUpdate()执行DML语句，返回影响的行数
 *      5、调用executeQuery()执行DQL语句，返回查询结果集
 *      6、在finally中释放资源
 */
package com.jdbc;

import java.sql.*;
import java.util.*;

/**
 * 存在SQL注入问题
 * 用户名：asdfd
 * 密码：asdfd' or '1'='1
 * 登入成功！
 */
public class MyJDBC_v1 {
    public static void main(String[] args) {
        //初始化界面
        Map<String,String> userInfo = initUI();
        //返回登录结果
        boolean loginSuccess = login(userInfo);
        System.out.println(loginSuccess ? "登录成功" : "登陆失败");
    }

    private static Map<String, String> initUI() {
        Scanner s = new Scanner(System.in);

        System.out.println("请输入用户名：");
        String loginName = s.nextLine();

        System.out.println("请输入密码：");
        String password = s.nextLine();

        Map<String,String> user = new HashMap<>();
        user.put("loginName", loginName);
        user.put("loginPsw",password);

        return user;
    }

    private static boolean login(Map<String, String> userInfo) {
        boolean flag = false;

        String loginName = userInfo.get("loginName");
        String loginPsw = userInfo.get("loginPsw");

		//从属性文件读取配置信息（创建.properties文件）
        Connection connection = null;
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");

        Statement statement = null;
        ResultSet resultSet = null;
//        int x=0;

        try {
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //获取连接
            connection = DriverManager.getConnection(url,user,password);

            //获取数据库操作对象
            statement = connection.createStatement();

            //执行SQL语句
            String sql = "select * from t_user where loginName= '"+ loginName +"' and psw = '"+ loginPsw+"'";
//            String sql = "insert into t_user (loginName,psw) values('xm','123')";
            //获取处理结果集
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                flag = true;
            }
/*            x = statement.executeUpdate(sql);
            if (x==1) {
                flag = true;
            }*/
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
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
        return flag;
    }
}

