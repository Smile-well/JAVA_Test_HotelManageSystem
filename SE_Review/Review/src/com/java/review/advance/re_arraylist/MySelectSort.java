package com.java.review.advance.re_arraylist;

/**
 * 选择排序
 * 循环一次，找出最小的，和最前面的交换位置
 *
 */
public class MySelectSort {
    public static void main(String[] args) {
        int[] arr={2,3,42,5,9};
/**
/* 设置min存储最小值下标，遍历比较之后，每出现一个更小的，实时更新min作为最小值下标
/*     方便后面把最小的数和最左边(未排序的)的数交换位置
/*     双重循环中
/*          外层循环的i:0,1,2,3... 正好是每次循环中最左边元素的下标！！！
/*          内层循环的j可设为i+1,j++的时候正好就是第i个元素和第i+1个元素比较
/*          i=0
/*          arr[0]=2  arr[j]=arr[i+1]=arr[1]=3 arr[j+1]=42... 循环比较之后，把最小的数和最左边(未排序的)的数交换位置
/*          得到：(2,)3,42,5,9        括号里的数已经排好了
/*          i=1
/*          arr[1]=3  arr[j]=arr[i+1]=arr[2]=42 ... 循环比较之后，把最小的数和最左边(未排序的)的数交换位置
/*          得到：(2,3,)42,5,9
/*          i=2
/*          arr[2]=42 arr[j]=arr[i+1]=arr[3]=5 ...  循环比较之后，把最小的数和最左边(未排序的)的数交换位置
/*          得到：(2,3,5,)42,9
/*          i=4
/*          arr[3]=42 arr[j]=arr[i+1]=arr[4]=9 比较之后，把最小的数和最左边(未排序的)的数交换位置
/*          得到：(2,3,5,9,42)
/*          排序完成
/*/


        for (int i = 0; i < arr.length; i++) {
            for (int j=i+1;j< arr.length;j++){
//              因为只会循环一次，所以这里设置min存储最小值的下标，遍历比较时，每出现一个更小的，实时更新记录在min
                int min = i;
                if (arr[min]>arr[j]){
                    min=j;
                }
//                这里看看最小值的下标有没有更新，把最小的数和最左边(未排序的)的数交换位置
                if(min!=i){
                    int temp=arr[i];
                    arr[i]=arr[min];
                    arr[min]=temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
