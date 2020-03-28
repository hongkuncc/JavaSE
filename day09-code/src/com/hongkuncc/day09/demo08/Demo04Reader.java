package com.hongkuncc.day09.demo08;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
*
* java.io.BufferedReader extends Reader
* 共性的成员方法：
  int read()读取单个字符并返回
  int read(char[] cbuf)一次读取多个字符，并将字符读入数组
  void close()关闭该留并释放与之关联订的所有资源
*
* 构造方法：
* BufferedReader(Reader in)  创建一个使用默认大小输入缓冲区的缓冲字符输入流。
  BufferedReader(Reader in, int sz)  创建一个使用指定大小输入缓冲区的缓冲字符输入流。
  参数：
      Reader in :字符输入流
            我们可以传递FileReader,缓冲流会给FileReader增加一个缓冲区，
            提高FileReader的读取效率。
   特有的成员方法：
    String readLine() 读取一个文本行。读取一行数据
    读取一个文本行。通过下列字符之一即可认为某行已终止：换行 ('\n')、回车 ('\r') 或回车后直接跟着换行
返回：
包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null
抛出：
IOException - 如果发生 I/O 错误
* */
public class Demo04Reader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day09-code\\c.txt"));

        /*line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);*/
//while循环
        String line ;
        while((line = br.readLine())!=null){
            System.out.println(line);

        }
        br.close();

    }
}
