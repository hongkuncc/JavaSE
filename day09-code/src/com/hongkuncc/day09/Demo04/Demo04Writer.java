package com.hongkuncc.day09.Demo04;

import java.io.FileWriter;
import java.io.IOException;

/*
*
* 续写和换行
* 续写，追加写，使用两个参数的构造方法
*   FileWriter(String fileName,boolean append)
*   FileWriter(file,boolean append)
*   参数：
*       String fileName，File file :写入数据的目的地
*       boolean append:续写开关 true不会创建新的文件覆盖原文件，可续写
 *       false建新的文件覆盖原文件，不可续写
*   换行符号：
*   win:\r\n
*   linux:/n
*
* */
public class Demo04Writer {
    public static void main(String[] args)throws IOException {
        FileWriter fw = new FileWriter("day09-code\\g.txt");
        for (int i = 0; i <10 ; i++) {
            fw.write("Hello World!"+i+"\r\n");
        }

        fw.close();
    }
}
