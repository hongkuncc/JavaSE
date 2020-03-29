package com.hongkuncc.day09.Demo09;

import java.io.*;

/*
*
* 练习：
* 将gbk编码的文本文件，转换为utf-8编码的文本文件
* */
public class Demo04Test {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr =new InputStreamReader(new FileInputStream("day09-code\\z.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day09-code\\f.txt"),"utf-8");
        int len =0;
        while((len = isr.read())!= -1){
            osw.write(len);

        }
        osw.close();
        isr.close();


    }
}
