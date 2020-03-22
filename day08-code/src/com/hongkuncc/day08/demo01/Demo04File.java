package com.hongkuncc.day08.demo01;

import java.io.File;

public class Demo04File {
    public static void main(String[] args) {
        show01();
    }
/*
* public boolean exists()
* public boolean isDirectory()
* public boolean isFile()
*
*
* */


    public static void show01(){
        File f1 = new File("C:\\Users\\Administrator\\Desktop\\1.txt");
        System.out.println(f1.exists());
        File f2 = new File("b.txt");
        System.out.println(f2.exists());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());

    }
}
