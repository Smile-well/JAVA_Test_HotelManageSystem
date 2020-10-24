package com.java.review.advance.re_thread.lock;

import instance.AccountThread_Lock;
import instance.AccountThread_Unlock;
import instance.Account_Lock;
import instance.Account_Unlock;

/**
 * Java中线程分为用户线程和守护线程
 * 用户线程可以理解为前台运行的线程
 * 守护线程则在后台运行（如GC）
 * 主线程结束，守护线程自动结束（调用setDaemon()方法，传参为true可将线程设为守护线程）
 */


/**
 * 模拟并发的情况，只创建一个账户对象
 * 但是让两个人在同一个账户对象上取钱
 * 不加锁的情况和加锁的情况的对比
 */
public class ThreadTest {
    public static void main(String[] args) {
        //在未加锁的账户上创建两个线程
        Account_Unlock accountThread_unlock = new Account_Unlock(10000,66);
        Thread thread1 = new Thread(new AccountThread_Unlock(accountThread_unlock));
        Thread thread2 = new Thread(new AccountThread_Unlock(accountThread_unlock));

        thread1.setName("thread_unlock_1");
        thread2.setName("thread_unlock_2");

        thread1.start();
        thread2.start();

/******************************************************************************/

        //在加锁的账户上创建两个线程
        Account_Lock account_lock = new Account_Lock(10000,77);
        Thread thread3 = new Thread(new AccountThread_Lock(account_lock));
        Thread thread4 = new Thread(new AccountThread_Lock(account_lock));

        thread3.setName("thread_lock_1");
        thread4.setName("thread_lock_2");

        thread3.start();
        thread4.start();
    }
}
