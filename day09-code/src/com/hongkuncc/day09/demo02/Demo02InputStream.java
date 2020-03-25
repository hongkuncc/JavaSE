package com.hongkuncc.day09.demo02;


import com.sun.org.apache.xpath.internal.operations.String;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
* 字节输入流一次读取多个字节的方法：
*   int read(bvte[] b)从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
*   明确两件事情：
*       1、方法的参数byte[]的作用？
*           起到缓冲作用，存储每次读取到的多个字节
*           数组的长度一把定义为1024（1kb）或者1024的整数值
*       2、方法的返回值int是什么？
*           每次读取的有效字节个数
*
* */
public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day09-code\\a.txta.txt");
      /*  byte[] bytes = new byte[2];
        int len = fis.read(bytes);
        System.out.println(len);//2
//        System.out.println(Arrays.toString(bytes));//[65,66]
        System.out.println(new String(bytes));

        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));

        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));*/

//        以上可以使用循环优化，文件中有多少字节，所以使用while循环
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        //释放资源
        fis.close();
    }
}
