package com.java.review.advance.re_thread.cometure;

/**
 * 调用Thread的构造方法将MyThread2的实例转为Thread类
 */
public class ImplementsRunnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyTread2());
        thread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程--->" + i);
        }
    }
}

class MyTread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程--->" + i);
        }
    }
}