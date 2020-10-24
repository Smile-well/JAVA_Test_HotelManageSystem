package com.java.review.advance.re_object;

import instance.User;

/**
 * Object是类的老祖宗，所有类都直接或间接的继承Object
 * 有一些常用的方法会在子类中重写
 * public boolean equals(Object obj) {
 *         return (this == obj);
 *     }
 * public String toString() {
 *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *     }
 */
public class Re_toSrting {
    public static void main(String[] args) {
        /**
         * 结果：instance.User@1b6d3586
         * 自动调用了父类Object的toString方法
         * 返回内存地址和hashcode
         */
         /*User user = new User(1,"张三");
         System.out.println(user);   */

        /**
         * 重写toString方法后,
         * 输出：   no:1
         *         name:张三
         */
        User user = new User(1,"张三");
        System.out.println(user);
    }
}
