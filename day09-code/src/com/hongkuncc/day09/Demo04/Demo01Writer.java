package com.hongkuncc.day09.Demo04;

import java.io.FileWriter;
import java.io.IOException;

/*
* java.io.writer：字符输出流，是所有字符输出流的最顶层的弗雷，是一个抽象类
* 共性的成员方法：
*   void write(int c)写入单个字符
*   void write(char[] cbuf)写入字符数组
*   abstract void write(char[] cbuf，int off ,int len)写入字符数组的一部分
*   void write(String[] str)写入字符串
*   void write(String str,int off,int len)写入字符串
*   void flush()刷新该流的缓冲
*   void close()关闭此流，但是要先刷新它
*   java.io.Filewriter extends OutputStreamWriter extends Writer
*Filewriter:文件字符输出流
* 作用：把内存中字符数据写入到文件中
* 构造方法：
 * FileWrite(File file)
 * FileWriter(String fileName)
 * 参数：读取文件的数据源
 *   String fileName:文件的路径
 *   File:file：一个文件
 *  FileWriter构造方法的作用：
 *  1、创建一个FileWriter对象
 *  2、根据构造方法中传递的文件/文件的路径，创建文件
 *  3、会把FileWriter对象指向创建好的文件
* */
public class Demo01Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day09-code\\a.txt");
        fw.write(97);
//        fw.flush();//把内存缓冲区中的数据，刷新到文件夹中
        fw.close();//释放资源（会先把内存缓冲区的数据刷新到文件中）

    }

}
