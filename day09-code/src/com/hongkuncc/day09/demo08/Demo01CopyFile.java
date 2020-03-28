package com.hongkuncc.day09.demo08;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\Users\\hongk\\Pictures\\1.tif");

        FileOutputStream fos = new FileOutputStream("C:\\Users\\hongk\\Desktop\\1.tif");
        //读取
        /*int len = 0;
        while ((len = fis.read())!= -1){
            //写入
            fos.write(len);
        }*/

        //优化，使用数组缓冲读取多个字节，写入多个字节
        byte[] bytes = new byte[1024];

        int len = 0;
        while ((len = fis.read(bytes))!= -1) {
            fos.write(bytes, 0, len);
        }

        //释放资源
        fos.close();
        fis.close();

        long e = System.currentTimeMillis();
        System.out.println("文件共耗时："+(e - s)+"毫秒");

    }
}
