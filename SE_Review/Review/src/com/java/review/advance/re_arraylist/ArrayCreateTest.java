package com.java.review.advance.re_arraylist;

import java.lang.reflect.Array;

/**
 * 数组可以存放基本数据类型也可以存放引用数据类型
 * 两种初始化方法：
 *         动态：数据类型[] 数组名 = new 数据类型[元素个数];
 *         静态：数据类型[] 数组名 = {元素1,元素2,...};
 * 靠下标来循环遍历（二维数组就用双循环）
 */
public class ArrayCreateTest {
    public static void main(String[] args) {
        //数组创建
        String[] s = new String[5];
        int[] a = {1,3,4,6,2,4};
        int[][] b = {
                {1,2,3},
                {4,5,6}
        };

        //赋值
        s[0] = "abc";
        s[1] = "bcd";

        //数组遍历，i为数组下标，调用length()方法获取数组的长度
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print("第"+(i+1)+"行"+"第"+(j+1)+"列的元素是"+b[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
