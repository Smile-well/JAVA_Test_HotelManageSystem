package com.java.review.advance.re_thread.lock;

/**
 * 死锁的发生（这里用到的是排它锁）
 * 每个对象都有一把锁，但是不管类创建了多少个对象，这个类的类锁只有一把
 * 排它锁可以锁：
 *      1、需要同步的代码块
 *          synchronized(共享的对象){}
 *      2、实例方法(只能是当前对象)
 *          synchronized (this) {}
 *      3、类锁（静态方法和静态变量）
 *          public synchronized static void xxx() {}
 */
public class DeathLock {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        Thread1 thread1 = new Thread1(o1,o2);
        Thread2 thread2 = new Thread2(o1,o2);

        thread1.start();
        thread2.start();
    }
}

class Thread1 extends Thread {
    Object o1;
    Object o2;

    public Thread1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2) {

            }
        }
    }
}

class Thread2 extends Thread {
    Object o1;
    Object o2;

    public Thread2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }
    @Override
    public void run() {
        synchronized (o2) {
            synchronized (o1) {

            }
        }
    }
}