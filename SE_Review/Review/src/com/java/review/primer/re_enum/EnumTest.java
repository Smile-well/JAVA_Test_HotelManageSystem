package com.java.review.primer.re_enum;

import instance.Seasons;

/**
 * 枚举类一般是用来比对的（与true、false的效果类似）
 * 枚举类有两个静态方法
 *  values() 返回包含所有枚举成员的枚举数组
 *  valueOf() 返回名称为str的枚举成员
 */
public class EnumTest {
    public static void main(String[] args) {

        //获取seasons数组
        Seasons[] seasons = Seasons.values();
        //遍历seasons数组
        for (Seasons season1:seasons) {
            System.out.println(season1);
        }

        Seasons season = Seasons.valueOf("SUMMER");
        System.out.println(season);
    }
}
