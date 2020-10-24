package com.java.review.advance.re_contain.re_collection.re_list;

import instance.Animal;
import instance.Cat;
import instance.Dog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Collection的子类都可以互相转化
 * 方法：直接在创建对象的时候调用Collection的构造方法
 *     List array = new LinkedList(arrayList);
 */

/**
 * List是Collection的子类，线性表
 * List特点：
 *      有下标，存进去什么顺序，拿出来什么顺序
 *      可重复，可为null
 * ArrayList底层是一个数组，是List接口的实现类，非线程安全
 * （List还有两个实现类，LinkedList（双向链表）和vector（数组，线程安全），用法大致）
 */
public class ArrayListTest {
    public static void main(String[] args) {
        //利用泛型和多态,arrayList中装载的是animal类型的对象
        List<Animal> arrayList = new ArrayList<Animal>();

        Animal cat = new Cat();
        Animal dog = new Dog();

        /**
         * 调用add方法，在ArrayList中添加元素
         * 泛型机制自动判断add的类型是否为预期的类型或其继承类
         * 编译期！！！
         * arrayList.add("xxx");
         * String非Animal的子类，编译器报错
         */
        arrayList.add(cat);
        arrayList.add(dog);

        //创建迭代器对象Iterator接收容器（集合）对象的元素
        Iterator<Animal> iterator = arrayList.iterator();

        //判断是否有下一个元素（hasNext()）
        while (iterator.hasNext()) {
            //返回迭代器内的元素（next()）
            //泛型机制：省去了向下转型（Animal --> subclass）
            Animal a = iterator.next();
        }
    }
}
