package instance;

/**
 * Dog类也继承了Animal
 * super.run()表示调用父类的run方法
 * 一般可以省略（不建议，因为懒得去记哪些不可以省略）
 */
public class Dog extends Animal {

    public Dog() {
        /**
         * super()表示调用父类的构造方法，一般也不写
         * 默认先调用父类的构造方法再调用自己的构造方法
         * 如果父类有多个构造方法时，则利用super()来区分，super()内传参以区分
         * super()也只能放在第一行且只能有一个
         */
    }

    @Override
    /**
     * 重写继承的方法（覆盖父类的方法）
     * 只能改变方法体的内容和扩大父类的方法权限
     * private-->public是可以的，反之则不行
     */
    public void run() {
        //super.run();
        System.out.println("小狗在奔跑");
    }

    @Override
    public void eat() {
        //super.eat();
        System.out.println("小狗在吃骨头");
    }

    //子类特有的方法
    public void shoot() {
        System.out.println("汪汪汪~");
    }
}
