package com.java.review.primer.re_extends;

import instance.Animal;
import instance.Bird;
import instance.Cat;
import instance.Dog;

/**
 * 子类
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        //调用父类的方法
        cat.eat();
        cat.run();

        System.out.println("========================");

        Dog dog = new Dog();
        //重写父类的方法
        dog.eat();
        dog.run();
        //子类特有的方法
        dog.shoot();

        System.out.println("========================");

        /**
         * 多态
         * 父类引用指向子类对象
         * Animal --> Cat
         * */

        Animal bird = new Bird();
        bird.eat();
        bird.run();

    }
}
