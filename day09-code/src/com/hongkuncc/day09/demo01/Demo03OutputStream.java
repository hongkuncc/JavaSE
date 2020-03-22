package com.hongkuncc.day09.demo01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
*
* 一次写入多个字节的方法：
* public void write(byte[] b);
* public void write(byte[] b,int off,int len);
*
*
* */
public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
//        创建对象，构造方法中绑定要写入数据的目的地
        FileOutputStream fos = new FileOutputStream(new File("\\Users\\Administrator\\Desktop\\2.txt"));
//        调用FileOutputStream对象中的方法write，把数据写入到文件中
        fos.write(45);
        fos.write(48);
        fos.write(48);

        byte[] bytes = {65,66,67,68};
        fos.write(bytes);


//        public void write(byte[] b,int off,int len);

        fos.write(bytes,1,3);
//       写入字符串方法 ，把字符串转换为字节数组
        byte[] bytes2 = "你好呀".getBytes();
        System.out.println(Arrays.toString(bytes2));
        fos.write(bytes2);
        fos.close();

    }
}
