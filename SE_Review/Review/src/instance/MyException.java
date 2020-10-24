package instance;

/**
 * 自定义异常的一般是继承Exception或者RuntimeException
 * 再定义两个构造方法
 */
public class MyException extends Exception {
    public MyException() {
        super();
    }
    public MyException(String s) {
        super(s);
    }
}
