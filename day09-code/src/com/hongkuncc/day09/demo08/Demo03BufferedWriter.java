package com.hongkuncc.day09.demo08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
*
*java.io.BufferedWriter extends Writer
*BufferedWriter:字符缓冲输出流
*
* 继承自父类的共性成员方法：
*    --void write(int c) 写入单个字符
*    --void write(char[] chuf) 写入字符数组
*    --abstract void write(char[] chuf,int off,int len)
 *    写入字符数组的某一部分，off数组的开始索引，len写的字符个数
*    --void write(String,int off,int len ) 写入字符串的某一部分，
*    off字符串的开始索引，len写的字符个数
*    --void write(int c) 写入单个字符
*    --void flush() 刷新该流的缓冲
*    --void close() 关闭此流，但要去刷新它
*
* BufferedWriter(Writer out)
          创建一个使用默认大小输出缓冲区的缓冲字符输出流。
BufferedWriter(Writer out, int sz)
          创建一个使用给定大小输出缓冲区的新缓冲字符输出流。

Writer out：字符输出流
int sz：指定缓冲区的大小，不写默认大小

特有的成员方法：
void newLine() 写入一个行分隔符。会根据不同的系统获取不同的行分隔符
* */
public class Demo03BufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("day09-code\\c.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("陈宏坤");
//            bw.write("\r\n");
            bw.newLine();//同上
        }
        bw.flush();
        bw.close();

    }
}
