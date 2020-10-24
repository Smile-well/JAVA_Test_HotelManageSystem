package com.java.review.advance.re_contain.re_collection.re_set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet是SortedSet的实现类，SortedSet实现了自动排序
 * 其他的特性继承自Set接口
 */
public class TreeSetTest {
    public static void main(String[] args) {
        Set treeSet = new TreeSet();

        treeSet.add("aaa");
        treeSet.add("zzz");
        treeSet.add("xx");
        treeSet.add("ccc");

        //强化for循环，遍历
        for (Object values:treeSet) {
            System.out.println(values);
        }

        System.out.println("=================");
        //迭代器遍历
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
