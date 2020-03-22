package com.hongkuncc.day09.demo01;

import java.io.FileOutputStream;

/*
* 追加写/续写，使用两个参数的构造方法
* fileOutputStream(String name,boolean append)
* fileOutputStream(File file,boolean append)
* 参数：写入数据的目的
 *       String name，File file :写入数据的目的地
 *       boolean append :追加写开关
 *           true：创建对象不会覆盖原件，继续在文件的末尾追加写数据
 *           false：创建一个新文件，覆盖源文件
* */
public class Demo04OutputStream {
    public static void main(String[] args) {
        FileOutputStream fos = new FileOutputStream();
        
    }
}
