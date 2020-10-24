package com.java.review.advance.re_contain.re_collection.re_set;

import java.util.HashSet;
import java.util.Set;

/**
 * Set是不含重复元素的接口，方法都是继承Collection接口的
 * Set下有HashSet实现类和SortedSet接口
 * HashSet集合中的元素可以不排序,但是元素不能重复，重复的只会存一个
 */
public class HashSetTest {
    public static void main(String[] args) {
        Set<String> myHashSet = new HashSet<>();
        myHashSet.add("a");
        myHashSet.add("a");
        myHashSet.add("c");
        myHashSet.add("xx");
        myHashSet.add("b");
        myHashSet.add("aaa");

        //强化for循环，遍历
        for (String values:myHashSet) {
            System.out.println(values);
        }

    }
}
