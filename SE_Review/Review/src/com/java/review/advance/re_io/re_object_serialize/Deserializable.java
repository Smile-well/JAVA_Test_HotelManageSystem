package com.java.review.advance.re_io.re_object_serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserializable {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            //反序列化
            ois = new ObjectInputStream(new FileInputStream("Review/src/instance/user"));
            Object user = ois.readObject();

            System.out.println(user);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
