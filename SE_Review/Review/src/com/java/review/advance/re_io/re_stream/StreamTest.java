package com.java.review.advance.re_io.re_stream;

import java.io.*;

/**
 * 字节流：一次传输一个byte（八个二进制位），可以传输任何文件
 * 字符流：一次读取一个字符或一个中文，只能读txt文件
 * FileInputStream文件字节输入流：读取文件数据
 * FileOutputStream文件字节输出流：可以创建和修改文件的内容
 * 其他的字节流也类似
 */
public class StreamTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //以文件Message.properties为接收端创建输出流（如果没有这个文件则会自动创建一个同名文件）
            // 设置为允许拼接（true），将接收的字节拼接在文件的末尾，否则会自动把文件的内容覆盖
            fos = new FileOutputStream("Review/src/Message.properties",true);

            /**
             * 在Message.properties中插入str字符串
             * 将str转化为字符数组，再写到文件中
             */
            String str = "";
            byte[] fosBytes = str.getBytes();
            fos.write(fosBytes);
            //输入流要记得刷新，清空管道
            fos.flush();

            //创建输入流，读取文件中的字节，再放到JVM的内存中
            fis = new FileInputStream("Review/src/instance/Message.properties");
            int readCount = 0;
            byte[] bytes = new byte[4];
            while ((readCount = fis.read(bytes))!=-1) {
                System.out.print(new String(bytes,0,readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
