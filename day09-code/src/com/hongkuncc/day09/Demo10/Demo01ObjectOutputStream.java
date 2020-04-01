package com.hongkuncc.day09.Demo10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
* 序列化，用一个字节序列可以表示一个对象，该字节序列包含该对象的数据、
* 对象的类型和对象中存储的属性等信息。字节序列写出到文件之后，相当于文件中持久保存一个对象的信息
* 该字节序列还可以从文件中读取出来，重构对象，反序列化，对象的数据、对象的类型、对象中存储的属性等信息。
* 字节<<<<<<<<<<<---------------------对象
* ObjectOutputStream:序列化--字节重构为对象
* 字节--------------------->>>>>>>>>>>对象
* ObjectInputStream:反序列化--字节重构为对象
*
*
*java.io.ObjectOutputStream extends OutputStream
*
*ObjectOutputStream:对象的序列化流
* 作用：把对象以流的方式写入到文件中保存
*
* 构造方法：
* ObjectOutputStream(OutputStream out) 创建写入指定 OutputStream 的 ObjectOutputStream。
* 参数：
*       OutputStream out：字节输出流
* 特有的成员方法：
*       void writeObject(Object obj) 将指定的对象写入 ObjectOutputStream
* 使用步骤：
*       1、创建ObjectOutputStream对象，构造方法中传递字节输出流
*       2、使用ObjectOutputStream对象中的方法writeObject,把对象写入到文件中
*       3、释放资源
*
* */
public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day09-code\\d.txt"));
        oos.writeObject(new Person("chk",19));
        oos.close();
    }
}
