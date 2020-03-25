package com.hongkuncc.day09.demo02;

import java.io.FileInputStream;
import java.io.IOException;

/*
*
* java.io.InputStream字节输入流
*java.io.FileInputStream extends InputStream
* 作用：把硬盘文件中的数据，读取到内存中使用
* 构造方法：
*      FileInputStream(String name)
*      FileInputStream(File file)
*      参数：读取文件的数据源
*           String name:文件路径
            File file：文件
       构造方法的作用：
            1、创建一个 FileInputStream对象
            1、会把 FileInputStream对象指定构造方法中药读取的文件
*   读取数据的原理（硬盘-->内存）
*       Java程序-->JVM-->OS-->os读取数据的方法-->读取文件
*    字节输入流的过程：
*    1、创建一个 FileInputStream对象，构造方法中绑定要读取的数据流
 *   2、使用FileInputStream对象中的方法read，读取文件
 *   3、释放资源
*
* */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day09-code\\a.txta.txt");
// int read() 读取一个字节并返回，读取到文件的末尾返回-1
       /* int len = fis.read();
        System.out.println(len);//97,a

        int len = fis.read();
        System.out.println(len);//98,b
        int len = fis.read();
        System.out.println(len);//99,a
        int len = fis.read();
        System.out.println(len);//-1结束
        int len = fis.read();
        System.out.println(len);//-1结束*/
       /*
       * 以上是重复过程，可以使用循环优化
       * 不知道文件中有多少个字节，使用while循环，-1结束
       *
       *布尔表达式 len = fis.read()!=-1
       *
       *
       * */
       while(fis.read()!= -1){
           System.out.println(fis.read());

       }




//        释放资源
        fis.close();

    }
}
