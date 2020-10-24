package com.java.review.advance.re_io.re_buffer;

import java.io.*;

/**
 * BufferedStream 缓冲流
 * 将数据写入缓冲区，缓冲区满之后再将数据发送出去
 * 缓冲区为空时，会自动读取数据
 *
 * 字节流和字符流可以互相转换（调用构造方法将相应的对象作为参数传进去即可）
 */
public class BufferedTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader in;
        BufferedReader reader = null;
        try {
            FileInputStream fis=new FileInputStream("Review\\src\\com\\java\\instance\\Message.properties");
            //将字节流转换为字符流
            in = new InputStreamReader(fis);
            reader = new BufferedReader(in);

            String line=null;
            while ((line= reader.readLine())!=null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
