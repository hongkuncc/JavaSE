package com.hongkuncc.day09.Demo04;

import java.io.FileWriter;
import java.io.IOException;

/*
* flush方法和close方法的区别
*       flush：刷新缓冲区，流对象可以继续使用
*       close：先刷新缓冲区，然后通知系统释放资源。流对象不可以再被使用了
*
*
* */
public class Demo02CloseAndFlush {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day09-code\\a.txt");

        fw.write(97);

        fw.flush();
        //刷新之后可以继续使用
        fw.write(98);

        fw.close();
        //close方法之后流已经关闭了不能继续使用
//        fw.write(99); 报错
    }
}
