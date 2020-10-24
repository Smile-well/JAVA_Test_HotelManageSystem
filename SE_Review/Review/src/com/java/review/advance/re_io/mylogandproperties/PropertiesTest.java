package com.java.review.advance.re_io.mylogandproperties;

/**
 * 经常变化的数据放在properties文件（属性配置文件）中
 * 只需要修改这个文件的内容，java代码不需要改动，也不需要重新编译
 * 服务器也不用重启
 */

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("Review\\src\\instance\\Message.properties");
        Properties properties = new Properties();

        //文件中的数据顺着管道加载到Map集合中了，其中"="左边做key,右边做value
        properties.load(fileInputStream);

        String username = properties.getProperty("name");
        System.out.println("username:"+username);

        String id = properties.getProperty("id");
        System.out.println("password:"+id);

        fileInputStream.close();
    }
}

