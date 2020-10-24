package com.java.review.advance.re_contain.re_iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 迭代器主要作用是用来迭代（遍历集合内容）
 * 方法步骤比较固定：
 *          创建迭代器对象Iterator接收容器（集合）对象的元素
 *          Iterator iterator = myLink.iterator();
 *          判断是否有下一个元素（hasNext()）
 *          while (iterator.hasNext()) {
 *              //返回迭代器内的元素（next()）
 *              System.out.println(iterator.next());
 *          }
 */
public class IteratorTest {
    public static void main(String[] args) {
        List myLink = new LinkedList();

        myLink.add("one");
        myLink.add("two");
        myLink.add("three");
        myLink.add("four");


        //创建迭代器对象Iterator接收容器（集合）对象的元素
        Iterator iterator = myLink.iterator();

        //判断是否有下一个元素（hasNext()）
        while (iterator.hasNext()) {
            //返回迭代器内的元素（next()）
            System.out.println(iterator.next());
        }
    }
}
