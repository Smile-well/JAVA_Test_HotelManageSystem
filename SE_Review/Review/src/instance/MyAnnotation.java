package instance;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解也是一种特殊的类，可以用在类上、属性上、方法上、变量上等....
 * 定义用@interface关键字
 * 调用时在要注解的上方用@AnnotationName，即@加上注解名
 * 大多的注解是没有内容的，只是作为一种标志
 * 也可在注解中设置默认值（default）
 */

/**
 * 还有一种注解用来“注解”注解
 * 注解的注解称为元注解
 */
@Target({ElementType.ANNOTATION_TYPE,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "a";
}


