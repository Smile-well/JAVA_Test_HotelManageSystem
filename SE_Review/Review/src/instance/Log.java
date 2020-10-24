package instance;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义日志输出
 */
public class Log {
    public static void PrintLog(String message) {
        FileOutputStream fos = null;
        PrintStream printStream = null;
        try {
            //输出重定向到log文件中（原来默认是输出到控制台）
            fos = new FileOutputStream("Review\\src\\instance\\Log",true);
            printStream = new PrintStream(fos);
            System.setOut(printStream);

            //获取时间
            Date now = new Date();
            //设置化时间输出格式
            SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String nowTime= time.format(now);

            System.out.println(nowTime+":"+message);

            printStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (printStream != null) {
                printStream.close();
            }
        }
    }
}
