package com.hongkuncc.day09.Demo07;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
*
* java.io.BufferedInputStream extends FilterInputStream
* BufferedInputStream:字节缓冲输入流
*
*构造方法：
* BufferedInputStream(InputStream in)
          创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
BufferedInputStream(InputStream in, int size)
          创建具有指定缓冲区大小的 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。

*
* */
public class Demo01BufferedStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day09-code\\x.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        /*int len = 0;
        while((len=bis.read())!= -1){
            System.out.println(len);

        }*/

        //int read(byte[] b)从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
        byte[] bytes = new byte[1024];//存储每次读取的数据
        int len =0;//记录每次读取的有效字节个数
        while((len = bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));

        }
        bis.close();

    }
}
