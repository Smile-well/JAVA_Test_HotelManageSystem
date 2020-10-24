package com.java.review.primer.re_constructor;

import instance.User;

public class ConstructorTest {
    public static void main(String[] args) {
        /**
         * 如果不写构造方法，创建对象时自动调用无参的构造方法
         * 验证方法：在构造方法中输出信息
         * 无参构造器为user对象赋默认值
         * 实际是调用了this()方法为实例变量赋默认值，默认的this()是不写的
         * 如果写this()，必须在第一行，且只能有一个
         * 作用是调用本类中的其他构造方法
         */

        /**
         *     public User() {
         *         this(1,"小红");
         *         System.out.println("调用了无参构造方法");
         *     }
         *  输出结果：
         * 调用了含参的构造方法
         * 调用了无参构造方法
         * no:1
         * name:小红
         */
        User user1 = new User();
        System.out.println("no:"+user1.getNo());
        System.out.println("name:"+user1.getName());

        /**
         * 调用有参数的构造方法
         * 并在创建对象的时候传值
         * User user2 = new User(1,"小明");
         */
        User user2 = new User(1,"小明");
        System.out.println("no:"+user2.getNo());
        System.out.println("name:"+user2.getName());
    }
}
