package com.java.review.advance.re_io.re_object_serialize;

import instance.User;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializable {
    public static void main(String[] args) {
        User user = new User();
        ObjectOutputStream oos = null;
        try {
            //将序列化信息存储在user文件中
            oos = new ObjectOutputStream(new FileOutputStream("Review/src/instance/user"));
            oos.writeObject(user);

            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
