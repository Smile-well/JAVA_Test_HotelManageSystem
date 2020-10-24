package com.java.review.advance.re_thread.cometure;

public class ExtendsThread {
    public static void main(String[] args) {
        MyThread1 thread = new MyThread1();
//        单线程
//        thread.run();

//        多线程，start方法立即结束，开辟一个分支栈，自动调用run方法
//        run和main方法同级，同时执行
        thread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程--->"+i);
        }
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程--->"+i);
        }
    }
}

