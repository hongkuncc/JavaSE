package com.hongkuncc.day09.Demo09;

import java.io.FileReader;
import java.io.IOException;

/*
* FileReader 可以读取IDE默认文件编码（utf-8）
* FileReader 可以读取系统默认文件编码（中文GBK）会产生乱码
*
*
*
* */
public class demo01ReverseStream {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day09-code\\z.txt");
        int len = 0;

        while((len = fr.read())!= -1){
            System.out.println((char) len);
        }
        fr.close();
    }
}
