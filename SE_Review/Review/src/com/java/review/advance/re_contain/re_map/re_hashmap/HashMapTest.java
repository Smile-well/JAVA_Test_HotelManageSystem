package com.java.review.advance.re_contain.re_map.re_hashmap;

/**
 * Map接口，提供了映射关系（key-->value）,key无序不可重复
 * Map有两个实现类（HashMap和Hashtable）和一个继承接口（SortedMap）
 * HashMap底层是哈希表（散列表），允许null值和null键（Hashtable不允许）
 * 默认容量是16，加载因子0.75
 * 当元素数量到达最大容量的0.75自动扩容为原来的两倍
 */


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 哈希表结构是一维数组加链表（链表是数组中的元素）
 * 如果设计不好会影响效率（散列分布不均匀）
 * hash值全相等的时候，变成了单链表；hash值全不等的时候变成了一维数组
 * Node[] node;
 * static class Node<K,V>{
 *     int hashcode;
 *     final<K> key;
 *     final<V> value;
 *     Node<V,K> next;
 * }
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap();

        /**
         * 自动装箱（int-->Integer）,且Integer和String都重写了
         * put方法调用：
         *      1、先将键值对封装到Node对象中
         *      2、然后求出hashcode,保存在Node对象中
         *      3、key调用equals方法
         *          如果有相同的key，则将相同的key对应的value替换
         *          如果无，则将value添加到链表的末尾
         * get方法调用：
         *      1、先调用hashcode(),用哈希算法计算出数组下标
         *      2、定位到数组中的位置，如果对应位置没有元素，返回null
         *      3、如果有元素，再调用equals()
         *      4、找到了则返回value，没找到返回null
         *
         *      如果是自定义的类，一定要重写hashcode()和equals()
         *
         *      JDK8之后，链表的长度大于8会自动变成红黑树，树节点小于6时，自动转换为链表
         */
        hashMap.put(1,"第是一");
        hashMap.put(4,"第是四");
        hashMap.put(3,"我是三");

        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(2));


        /**
         * Collection<K,V> collectionName = new Collection();
         *
         * Set<Map.Entry<K,V>> mapEntry = collectName.entrySet();
         *         Iterator<Map.Entry<Integer,String>> iterator = mapEntry.iterator();
         *
         *         while (iterator.hasNext()) {
         *             Map.Entry<Integer,String> map = iterator.next();
         *             System.out.println("key-->"+map.getKey()+" "+"value-->"+map.getValue());
         *         }
         *     }
         */
        Set<Map.Entry<Integer,String>> mapEntry = hashMap.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = mapEntry.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer,String> map = iterator.next();
            System.out.println("key-->"+map.getKey()+" "+"value-->"+map.getValue());
        }
    }

}
