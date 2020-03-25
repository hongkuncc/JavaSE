package com.hongkuncc.day09.demo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 文件复制练习：一读一写
* 明确：
*   数据源：
*   数据的目的地：
*
* 文件复制的步骤：
*   1、创建一个字节输入流对象，构造方法中绑定要读取的数据源
*   2、创建一个字节输出流对象，构造方法中绑定要写入的目的地
*   3、使用字节输入流对象中的方法read读取文件
*   4、使用字节输出流中的方法write，把读取到的字节写入到目的地文件中
*   5、释放资源
*
*
* */
public class Demo03CopyFile {
    public static void main(String[] args)throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\hongk\\AppData\\Roaming\\Microsoft\\Windows\\Network Shortcuts");

        FileOutputStream fos = new FileOutputStream("C:\\Users\\hongk\\Desktop");

        /*int len = 0;
        while ((len = fis.read())!= -1){
            fos.write(len);
        }*/

        //使用数组缓冲读取多个字节，写入多个字节
        byte[] bytes = new byte[1024];

        int len = 0;
        while ((len = fis.read())!= -1) {
            fos.write(bytes, 0, len);
        }

        //释放资源
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("文件共耗时："+(e - s)+"毫秒");

    }
}
