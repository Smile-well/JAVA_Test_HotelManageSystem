package com.jdbc.utils;

import java.sql.*;

public class JDBCUtilTest {
    public static void main(String[] args) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            Connection connection = DBUtils.getConnection();
			
			//编写SQL语句
            //String sql = "SQL语句";
			String sql = "insert into t_user(loginName,psw) values(?,?)";

			//预编译,防止SQL注入
            preparedStatement = connection.prepareStatement(sql);
			//给第一个?传值
            preparedStatement.setString(1,"lisi");
            //给第二个?传值
			preparedStatement.setString(2,"123456");

			//返回受影响的行数
            int flag = preparedStatement.executeUpdate();
            if (flag>0) {
                System.out.println("修改成功！");
            }

            DBUtils.close(connection,preparedStatement,resultSet);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
