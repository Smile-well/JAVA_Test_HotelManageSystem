package com.java.review.primer.re_extends.re_interface;

/**
 * Interface默认为抽象类，不能创建对象，且成员方法都是抽象方法（全抽象）
 * 类体中还可以定义静态方法和默认方法
 * 方法不能有方法体
 * 接口的数据成员都是静态的（默认加public static final），且必须初始化（即数据成员必须是静态常量）
 * 被final修饰的不能被继承和覆盖
 */
public interface MyInterface {
    //int i; 错误写法
    public static final int i=111;
    String x = "abc";

    /**
     * public void toDo(){};
     * 错误：不能有方法体
     */
    public abstract void toDo();

    public static void doSome() {
        System.out.println("interface do something");
    }
    public default void xx(){
        System.out.println("xxx");
    }
}