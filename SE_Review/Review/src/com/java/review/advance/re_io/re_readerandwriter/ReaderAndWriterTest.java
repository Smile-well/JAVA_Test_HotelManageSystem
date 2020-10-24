package com.java.review.advance.re_io.re_readerandwriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringJoiner;

/**
 * 文件字符输入流：只能读取普通文本
 * 和字节流类似，用char[]来接收，速度比字节流快
 */
public class ReaderAndWriterTest {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("Review/src/Message.properties");
            char[] chars = new char[4];

            int readCount = 0;
            while ((readCount = fileReader.read(chars))!=-1) {
                System.out.println(new String(chars,0,readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
