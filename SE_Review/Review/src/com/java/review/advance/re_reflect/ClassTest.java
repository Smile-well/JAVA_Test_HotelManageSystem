package com.java.review.advance.re_reflect;


import instance.Animal;
import instance.User;

/**
 * 三种方法：
 * 1、反射获取User类，再调用NewInstance()创建对象
 * 2、getClass()获取类名再创建
 * 3、直接用Class获取类名.class
 */
public class ClassTest {
    public static void main(String[] args) {
        try {
            //forName方法里传的是包名加完整类名
            Class c1 = Class.forName("instance.User");
            Object obj1 = c1.newInstance();

            //方法二，调用Object的getClass()方法
            String str = "abc";
            Class c2 = str.getClass();
            //System.out.println(c2);
            Object obj2 = c2.newInstance();

            //方法三Class
            Class c3 = User.class;
            Object obj3 = c3.newInstance();

            System.out.println(obj1);
            System.out.println(obj2);
            System.out.println(obj3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
