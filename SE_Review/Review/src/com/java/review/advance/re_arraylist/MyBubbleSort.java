package com.java.review.advance.re_arraylist;

/**
 * 冒泡排序
 * 左边和右边的进行比较，如果左边大于右边，则交换位置
 */
public class MyBubbleSort {
    public static void main(String[] args) {
        int[] arr={2,4,3,1,7};
        for (int i = arr.length-1; i > 0; i--) {
            for (int j=0;j< i;j++){
                if (arr[j]>arr[j+1]) {
                    int temp;
                    temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
//            倒序放里面，
            System.out.println(arr[i]);
        }
//        顺序放外面
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

