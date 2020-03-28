package com.hongkuncc.day09.demo08;

import java.io.*;

public class Demo02CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\hongk\\Desktop\\风采展示\\disco1.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\hongk\\Desktop\\disco1.jpg"));

//      使用数组缓冲读取多个字节，写入多个字节
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len =bis.read(bytes))!=-1){
            bos.write(bytes,0,len);

        }

        bos.close();
        bis.close();

        long e = System.currentTimeMillis();
        System.out.println("文件共耗时："+(e - s)+"毫秒");

    }
}
