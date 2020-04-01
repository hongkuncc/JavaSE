package com.hongkuncc.day09.Demo10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
*
* java.io.ObjectInputStream extends InputStream
* ObjectInputStream:对象的反序列化流
* 作用：把文件中保存的对象，以流的方式读取出来使用
*
* 构造方法：
*       ObjectInputStream(InputStream in) 创建从指定 InputStream 读取的 ObjectInputStream。
*       InputStream in  字节输入流
* 特有的成员方法：
*       readObject() 从 ObjectInputStream 读取对象。
*
*       readObject方法抛出异常：ClassNotFoundException
*       反序列化的前提：
*       1、类必须实现Serializable
*       2、必须存在类对应的class文件
*
*
* */
public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day09-code\\d.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
        Person p =(Person)o;
        System.out.println(p.getName()+p.getAge());
    }

}
