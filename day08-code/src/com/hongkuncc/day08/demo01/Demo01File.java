package com.hongkuncc.day08.demo01;

import java.io.File;

/*
* java.io.File类
* 文件和目录路径名的抽象表示形式
* Java把电脑的文件和文件夹（目录）封装为了一个File类
*创删除获取判断遍历文件获取文件大小
*
* */
public class Demo01File {
    public static void main(String[] args) {
        /*
        * 操作系统路径不能写死
        *
        * */

        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//路径分隔符，win是；linux是：

        String separator = File.separator;
        System.out.println(separator);//文件名称分隔符，win\,linux /


    }

}
