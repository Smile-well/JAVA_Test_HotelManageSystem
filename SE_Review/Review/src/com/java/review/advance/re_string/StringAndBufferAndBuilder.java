package com.java.review.advance.re_string;

/**
 * String这个类已经重写了toString方法
 * string是引用数据类型
 * 		第一：字符串一旦创建不可变。
 * 	        （源代码中，String类中有一个byte[]数组，数组一旦创建，长度无法更改。
 * 	        这个数组用final修饰，而被final修饰的引用一旦指向一个对象，就不能再指向其他对象了，所以String无法更改
 *          而StringBuffer/StringBuilder类中，虽然byte[]数组初始化容量只有16，但是没有用fianl修饰，
 *          数组满了之后会进行扩容，底层调用了System.arraycopy()方法进行扩容。所以他们可变，也更适合频繁的字符串拼接操作）
 * 		第二：双引号括起来的字符串存储在字符串常量池中（方法区）
 * 		第三：字符串的比较必须使用equals方法。
 * 		第四：String已经重写了toString()和equals()方法。
 */
public class StringAndBufferAndBuilder {
    public static void main(String[] args) {
/*      String s = new String("abc");
        String s = new String(byte数组);
        String s = new String(byte数组, 起始下标, 长度);
        String s = new String(char数组);
        String s = new String(char数组, 起始下标, 长度);*/

        String s = "abc";

        /**
         * StringBuffer/StringBuilder可以看做可变长度字符串。
         * StringBuffer/StringBuilder初始化容量16.
         * StringBuffer/StringBuilder是完成字符串拼接操作的，方法名：append
         * StringBuffer是线程安全的。StringBuilder是非线程安全的。
         * 频繁进行字符串拼接不建议使用“+”
         */
    }
}

//Integer范围 -128~127存放在整形常量池，方法区
//超出范围之后，就会在堆上开辟内存空间来存放Integer对象