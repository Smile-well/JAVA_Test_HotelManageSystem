package com.java.review.advance.re_exception;

import instance.MyException;

/**
 * Exception和Error都是继承Throwable
 * Error是程序无法捕捉到的异常，通常交给系统去处理（内存溢出等）
 * 一般说的异常都是Exception
 * Exception分为运行时异常和非运行时异常
 * RuntimeException是Exception的一个子类，专门处理运行时异常，这一类的异常通常不需要事先处理（除数为0、空指针异常等）
 */
public class ExceptionTest {
    public static void main(String[] args) {
        /**
         * 异常处理方法有两种：
         *      第一种：try catch捕捉并返回异常信息
         *          try {
         *
         *         } catch (Exception e) {
         *             e.printStackTrace();
         *         }
         *      第二种：throws抛出异常，抛给上层调用者去处理
         */

        try {
            /**
             * 当执行到Login.LoginIn();时，如果用户名和设定的不一样，则会抛出自定义异常
             * 当自定义异常被捕获，程序自动跳转到catch语句块执行
             * 且Login.LoginIn("");之后的语句都不再执行
             */
            Login.LoginIn("admin");
            System.out.println("用户名正确");
        } catch (MyException e) {
            //打印完整异常信息
            e.printStackTrace();
            //打印简短异常信息
            System.out.println(e.getMessage());
        }
    }
}
class Login{
    static String name="admin";

    public static void LoginIn(String userName) throws MyException {
        if ("".equals(userName)) {
            throw new MyException("用户名为空，请输入用户名！");
        } else if (!name.equals(userName)) {
        throw new MyException("用户名错误，请重新输入！");
        }
    }

}