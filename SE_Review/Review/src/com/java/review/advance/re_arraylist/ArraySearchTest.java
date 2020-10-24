package com.java.review.advance.re_arraylist;

import java.util.Arrays;

/**
 * 利用数组工具类来实现查找
 * java.util.Arrays
 */
public class ArraySearchTest {
    public static void main(String[] args) {
        //返回下标
        int index = Arrays.binarySearch(new int[10],5);

        Arrays.sort(new int[9]);    //全排
        Arrays.sort(new int[9],5,9);    //部分排序
    }
}
