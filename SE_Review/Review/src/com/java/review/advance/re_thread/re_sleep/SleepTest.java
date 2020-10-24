package com.java.review.advance.re_thread.re_sleep;

/**
 * sleep()方法可以让当前对象上的线程进入阻塞状态（sleep()为静态方法，还有）
 * sleep()传入一个int参数（单位是毫秒），作为阻塞的时间，阻塞结束后回到就绪状态
 * 也可以用interrupt()方法唤醒线程，结束阻塞（这里用到了异常机制，即抛出异常结束阻塞）
 */

/**
 * Object中的wait()和notify()方法可以操作线程
 * wait()让在当前对象上活动的线程进入等待状态，并释放占有的锁
 * notify()则是唤醒等待的线程，只通知，不会释放当前对象上占有的锁
 */
public class SleepTest {
    public static void main(String[] args) {
        MySleepThread mySleepThread = new MySleepThread();
        Thread myThread = new Thread(mySleepThread);
        myThread.start();

        /*
         * 用sleep模拟5秒
         * Thread.sleep(1000 * 5)
         * 然后再用interrupt唤醒
         */
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            //e.printStackTrace();
        }

        //static interrupt()
        myThread.interrupt();

        System.out.println("main over");

        //设置标志位，合理终止线程
        mySleepThread.flag = false;
    }
}

class MySleepThread implements Runnable {
    boolean flag = true;

    @Override
    public void run() {
        if (flag) {
            System.out.println(Thread.currentThread().getName() + "---> START");
            try {
                /**
                 * sleep()为静态方法（还有两个是currentThread()和yield()）
                 */
                Thread.sleep(100000000);
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "---> END");
        }
    }
}

