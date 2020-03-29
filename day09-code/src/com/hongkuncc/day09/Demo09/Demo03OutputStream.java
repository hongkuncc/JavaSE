package com.hongkuncc.day09.Demo09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
* java.io.OutputStreamWriter extends Writer
*继承自父类的共性成员方法：
   --void write(int c) 写入单个字符
   --void write(char[] chuf) 写入字符数组
   --abstract void write(char[] chuf,int off,int len)
    写入字符数组的某一部分，off数组的开始索引，len写的字符个数
   --void write(String,int off,int len ) 写入字符串的某一部分，
   off字符串的开始索引，len写的字符个数
   --void write(int c) 写入单个字符
   --void flush() 刷新该流的缓冲
   --void close() 关闭此流，但要去刷新它
*
 *
  * 构造方法：
  * OutputStreamWriter(OutputStream out) 创建使用默认字符编码的 OutputStreamWriter。
  * OutputStreamWriter(OutputStream out, String charsetName) 创建使用指定字符集的 OutputStreamWriter。
  *参数：
  * OutputStream out：字节输出流，可以用来写转换之后的细节到文件中
  * String charsetName：指定的编码表名称，不区分大小写，可以是utf-8等等等
  *
  * */
public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day09-code\\z.txt"),"gbk");
        osw.write("你好");
        osw.flush();
        osw.close();


    }
}
