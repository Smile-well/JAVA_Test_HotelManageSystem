package com.java.review.advance.re_contain.re_map.re_treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * TreeMap底层是自平衡二叉树（左小右大）
 * 自动排序（取出来的时候是按中序遍历）
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();

        treeMap.put(1,"one");
        treeMap.put(3,"abc");
        treeMap.put(2,"xxx");

        System.out.println(treeMap.get(1));

        //Map的遍历
        Set<Map.Entry<Integer,String>> mapEntry = treeMap.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = mapEntry.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer,String> map = iterator.next();
            System.out.println("key-->"+map.getKey()+" "+"value-->"+map.getValue());
        }
    }
}
