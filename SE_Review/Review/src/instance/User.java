package instance;

import java.io.Serializable;
import java.util.Objects;
/**
 * NotSerializableException：要想实现序列化，要实现Serializable接口
 * Serializable是一个标志接口，标志接口是给JVM看的
 * 如果没有手动生成序列号，JVM会默认提供一个序列化版本号
 * public interface Serializable {}
 */
public class User implements Serializable {
    //    建议将序列化版本号手动写出来,以便JVM区分类
    private static final long serialVersionUID = 6523806639951305168L;

    private int no;
    //    transient表示游离的，不参与序列化，反序列化后name为空
//    private transient String name
    private String name;

    //constructor
    public User() {
        this(1,"小红");
        System.out.println("调用了无参构造方法");
    }

    public User(int no, String name) {
        this.no = no;
        this.name = name;
        System.out.println("调用了含参的构造方法");
    }

    //getter and setter
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doSome() {
        System.out.println(this.getName()+"do something");
    }

    //重写toString
    @Override
    public String toString() {
        System.out.println("调用了重写的toString");
        return "no:"+no+"\n"+"name:"+name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getNo() == user.getNo() &&
                getName() == user.getName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNo(), getName());
    }
}
