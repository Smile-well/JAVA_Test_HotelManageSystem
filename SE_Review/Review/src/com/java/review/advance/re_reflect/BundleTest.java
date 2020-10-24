package com.java.review.advance.re_reflect;

import java.util.ResourceBundle;

/**
 * 资源绑定器：Bundle
 * 只能绑定properties文件。且在写路径的时候，路径后面的properties也不能写
 */
public class BundleTest{
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("instance.info");

        String s = bundle.getString("className");
        System.out.println(s);
    }
}
