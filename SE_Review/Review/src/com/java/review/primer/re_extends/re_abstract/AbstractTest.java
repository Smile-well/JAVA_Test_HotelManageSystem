package com.java.review.primer.re_extends.re_abstract;

/**
 * abstract不能和final、private、static、native同时修饰一个方法
 * 抽象类可以没有抽象方法（半抽象），但是包含抽象方法一定是抽象类
 * 抽象类不能创建对象，只能靠子类继承然后覆盖父类的抽象方法
 */
public class AbstractTest extends MyAbstract{
    public static void main(String[] args) {

    }

    /**
     * 需要实现父类的抽象方法
     */
    @Override
    public void doSome() {

    }
}

/**
 * doSome()抽象方法
 * doOther()非抽象方法
 */
abstract  class MyAbstract{
    public abstract void doSome();
    public void doOther(){
        System.out.println("可以定义非抽象方法，但是不可被调用，只能子类重写");

    }
}