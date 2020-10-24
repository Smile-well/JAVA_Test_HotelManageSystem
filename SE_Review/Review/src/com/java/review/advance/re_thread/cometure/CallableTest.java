package com.java.review.advance.re_thread.cometure;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 实现线程的第三种方式
 * 实现Callable接口
 */
public class CallableTest {
    public static void main(String[] args) {
        //创建一个未来任务类对象,参数需要给一个Callable接口实现类对象
        FutureTask futureTask = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception { //call相当于run
                return null;
            }
        });

        //创建一个线程，将futureTask作为参数传进去
        Thread thread = new Thread(futureTask);
    }

}
