package com.java.review.primer.re_extends.re_interface;

/**
 * 关键字：implement
 * 接口的实现类必须重写（实现）接口中的方法
 * 因为接口类中的方法都是抽象方法，如果子类不是抽象类则要实现父类的抽象方法
 * */
public class InterfaceTest implements MyInterface {
    @Override
    public void toDo() {
        // TODO Auto-generated method stub
        System.out.println("after interface do something");
    }

    public static void main(String[] args) {
        InterfaceTest myInter = new InterfaceTest();
        myInter.toDo();
        MyInterface.doSome();
    }
}