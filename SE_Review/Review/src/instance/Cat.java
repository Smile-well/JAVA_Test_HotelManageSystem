package instance;

/**
 * 关键字：extends
 * 子类Cat继承父类Animal，可以访问父类的成员变量和方法（只能访问非私有的）
 * 也可以重写父类的方法
 * Java不支持多重继承
 *
 * java.lang.Object是所有类的父类
 */
public class Cat extends Animal {
    /**
     * 这里的Cat没有写任何方法
     * 但是Cat创建出来的对象可以调用父类Animal的方法
     */
    public Cat() {
        System.out.println("小猫的构造方法");
    }
}
