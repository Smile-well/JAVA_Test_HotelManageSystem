package com.java.review.advance.re_innerclass;

/**
 * 内部类，匿名内部类
 * 看的不是很清楚，感觉用得少，后面用到了就会再介绍
 */
public class InnerTest {
    public static void main(String[] args) {
        //创建匿名内部类对象
        (
           new Inner(){
           void setName(String name){
           this.name = name;
           System.out.println("名字："+name);
           }
        }
        ).setName("小明");
    }

    //内部类
    static class Inner{
        String name;
    }
}
