package com.java.review.primer.re_overload;

/**
 * 方法重载(overload)
 * 调用方法时，自动判断实参类型，调用相应的方法
 */
public class OverloadTest {
    public static void main(String[] args){
        DoSum doSum = new DoSum();

        //计算int
        System.out.println(doSum.sum(1,2));

        //计算double
        System.out.println(doSum.sum(1.1,1));

    }
}

/**
 * 编写一个类，通过方法重载实现不同类型的数的加法
 * 方法重载：方法名相同，但是形参列表不一样
 *
 * 形参不同的判断：
 * 顺序不一样，类型不一样，参数数量不一样
 */
class DoSum{
    public int sum(int a,int b){
        return a+b;
    }
    public double sum(double a,double b){
        return a+b;
    }
    public long sum(long a,long  b){
        return a+b;
    }
    public String sum(String a,int b){
        return a+b;
    }
}
