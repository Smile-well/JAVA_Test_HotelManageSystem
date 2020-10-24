package com.java.review.advance.re_annotation;

import instance.MyAnnotation;

/**
 * 常用的注解：@Deprecated、@Override
 * 常用的元注解：@Target
 *
 * @Retention：注解保存的位置
 * 参数是枚举类，有三个值：public enum RetentionPolicy { SOURCE,CLASS,RUNTIME }
 * 分别表示在源文件中，字节码文件中，字节码文件中且可以被反射机制读取到
 *
 * @Target：注解可以出现的位置
 * 参数也是枚举类，有很多值就不一一列举
 */

@MyAnnotation("Review")
public class AnnotationTest {

}
