package com.java.review.advance.re_object;

import instance.User;

/**
 * 父类中的equals方法比较的是对象的内存地址
 * 有时候并不能判断两个值时候相等
 * public boolean equals(Object obj) {
 *         return (this == obj);
 *     }
 */
public class Re_equals {
    public static void main(String[] args) {
        /**
         * user1和user2都是用无参的构造方法
         * 他们的no和name都是0和null这两个默认值
         * 但是user2和user2却不相等，因为内存地址不一样
         * 为了实现no和name一样就是用一个人，我们需要重写equals方法
         */
        User user1 = new User();
        User user2 = new User();

        /**
         * 重写之前，user1和user2不相等
         * user1.equals(user2) false
         * 重写之后，只要名字和no相同就是同一个人
         * 返回true
         */
        System.out.println(user1.equals(user2));
    }
}
