package com.hongkuncc.day09.demo01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 构造方法:
* FileOutputStream(String name)创建一个具有指定名称的文件中写入数据的输出文件流
* FileOutputStream(File file)创建一个向指定File对象表示的文件中写入数据的文件输出流
* 参数：写入数据的目的
*       String name :目的地是一个文件的路径
*       File file :目的地是一个文件
* 构造方法的作用
*       1、创建一个FileOutputStream对象
*       2、会根据构造方法中传递的文件/文件路径，创建一个空的文件
*       3、会把FileOutputStream对象指向创建好的文件
* 写入数据的原理（内存->硬盘）
*   java程序-->JVM(java虚拟机)-->OS(操作系统)-->OS调用写数据的方法-->把数据写入到文件中
* 字节输出流的使用步骤（重点）：
*   1、创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
*   2、调用FileOutputStream对象中的方法write，把数据写入到文件中
*   3、释放资源
*
*
* */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        //1\创建对象
        FileOutputStream fos = new FileOutputStream("\\Users\\Administrator\\Desktop\\2.txt");
        //2、调用方法write，把数据写入到文件中
        fos.write(65);
        //3、释放资源
        fos.close();


    }

}


