package com.hongkuncc.day09.demo03;

import java.io.FileReader;
import java.io.IOException;

/*
*
* java.io.Reader:字符输入流，是字符输入流的最顶层的父类，是一个抽象类
* 共性的成员方法：
*   int read()读取单个字符并返回
*   int read(char[] cbuf)一次读取多个字符，并将字符读入数组
*   void close()关闭该留并释放与之关联订的所有资源
*
* java.io.FileReader extends InputStreamReader extends Reader
* FileReader：文件字符输入流
* 作用：把硬盘中的文件以字符的方式读取到内存中
*
* 构造方法：
* FileReader(String fileName)
* FileReader(File file)
* 参数：读取文件的数据源
*   String fileName:文件的路径
*   File:file：一个文件
*  FileReader构造方法的作用：
*
*
* */
public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day09-code\\c.txt");
        /*int len = 0;
        while((len = fr.read()) != -1){
            System.out.println((char)len);
        }*/
        char[] cs = new char[1024];
        int len = 0;
        while((len = fr.read(cs)) != -1){
            /*
            String类构造方法：
            * String(char[] value)阿布字符数组转为字符串
            * String(char[] value，int offset,int count)把字符的一部分转化为字符串
            * */
            System.out.println(new String(cs ,0,len));
        }

        fr.close();

    }
}
