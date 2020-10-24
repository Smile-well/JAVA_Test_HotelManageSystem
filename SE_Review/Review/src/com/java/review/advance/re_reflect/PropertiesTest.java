package com.java.review.advance.re_reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 从配置文件中读取属性值，再实例化对象
 */
public class PropertiesTest {
    public static void main(String[] args) {

        FileReader fileReader = null;
        try {
            fileReader = new FileReader("Review/src/instance/info.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties properties = new Properties();

/*        //获取当前绝对路径
        String path = Thread.currentThread().getContextClassLoader().getResource("info.properties").getPath();
        System.out.println(path);*/

        //文件中的数据顺着管道加载到Map集合中了，其中"="左边为key,右边为value
        try {
            properties.load(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //获取
        String name = properties.getProperty("className");
//        System.out.println(name);
        try {
            Class c = Class.forName(name);
            Object o = c.newInstance();
            System.out.println(o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
