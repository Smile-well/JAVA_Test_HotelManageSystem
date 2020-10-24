package com.java.review.advance.re_arraylist;

/**
 * 二分查找（折半查找）
 * 基于排序（没有排序用不了二分查找）
 * 原理：利用(right+left)/2=mid计算中间元素的下标，用中间元素arr[nid]和目标元素arr[index]比较
 *       如果大于目标元素，则将范围缩小成left~mid,此时new_mid=(mid+left)/2,right=mid
 *       如果小于，则为mid~right,new_mid=(mid+right)/2,left=mid
 *       如果等于，查找结束
 *
 *       多次这样查找，最后能查找到（如果数组中存在目标元素）我们的目标元素 （查找停止）
 */
public class MyBinarySearch {
    public static void main(String[] args) {
        int[] arr = {22, 33, 44, 55, 66, 77, 88};
        int index = myBinarySearch(arr, 22);
        System.out.println(index == -1 ? "该元素不存在" : "下标为" + index);
    }

    /**
     * 从数组中查找目标元素的下标
     *
     * @param arr 被查找的元素
     * @param num 目标元素
     * @return -1表示该元素不存在，其他表示返回该元素的下标
     */
    private static int myBinarySearch(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}
