package com.hongkuncc.day08.demo01;

import java.io.File;
/*
 * File类的遍历（文件夹）目录功能
 * public String[] List():返回一个String数组，表示该File目录
 * public File[] ListFiles()：返回一个File数组，表示该File目录的所有子文件或目录
 * 目录不对或者路径不是一个文件夹会抛出空指针异常
 *
 * */
public class Demo06File {
    public static void main(String[] args) {
        show02();
    }
    public static void show02(){
        File f1 = new File("C:\\Users\\Administrator\\Desktop\\basic-code\\day08-code\\src\\com\\hongkuncc\\day08\\demo01");
        File[] files = f1.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }
    public static void show01(){
        File f1 = new File("C:\\Users\\Administrator\\Desktop\\basic-code\\day08-code\\src\\com\\hongkuncc\\day08\\demo01");
        String[] arr = f1.list();
        for (String fileName : arr) {
            System.out.println(fileName);

        }
    }
}
