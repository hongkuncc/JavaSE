package com.hongkuncc.day09.Demo09;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
*java.io.InputStreamReader extends Reader
*
* 继承自父类的共性成员方法：
*
  int read()读取单个字符并返回
  int read(char[] cbuf)一次读取多个字符，并将字符读入数组
  void close()关闭该留并释放与之关联的所有资源
  构造方法：
*InputStreamReader(InputStream in)创建一个使用默认字符集的 InputStreamReader。
*InputStreamReader(InputStream in, String charsetName) 创建使用指定字符集的 InputStreamReader。
* InputStream in：字节输入流，用来读取文件中保存的字节
* String charsetName：指定的编码表名称，不区分大小写
*注意：
* 构造方法中的 编码表格式要与文件的编码相同
*
* */
public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        read_utf_8();

    }
    public static void read_utf_8() throws IOException {
       InputStreamReader isr = new InputStreamReader(new FileInputStream("day09-code\\z.txt"),"gbk");
       InputStreamReader isr2 = new InputStreamReader(new FileInputStream("day09-code\\f.txt"));//默认utf-8
        int len = 0;
        while((len = isr.read())!= -1){
            System.out.println(len);

        }
        isr.close();

    }
}
