package com.hongkuncc.day08.demo01;

import java.io.File;

public class Demo03File {
    public static void main(String[] args) {
        show04();
    }
/*
* public long length
*
* */
    public static void show04(){
        File f1 = new File("C:\\Users\\Administrator\\Desktop\\1.txt");
        long name1 = f1.length();
        File f2 = new File("b.txt");
        long name2 = f2.length();
        System.out.println(name1);
        System.out.println(name2);

    }




/*
* getName()
*
* */
public static void show03(){
    File f1 = new File("C:\\Users\\Administrator\\Desktop\\1.txt");
    String name1 = f1.getName();
    File f2 = new File("b.txt");
    String name2 = f2.getName();

    System.out.println(f1);
    System.out.println(name1);
    System.out.println(name2);
}
/*
* getPath
* */
    public static void show02(){
       File f1 = new File("C:\\Users\\Administrator\\Desktop\\1.txt");
       File f2 = new File("b.txt");
       String path1 = f1.getPath();
       String path2 = f1.getPath();
        System.out.println(path1);
        System.out.println(path2);
        System.out.println(f1);
        System.out.println(f1.toString());
    }



    /*
    * public String getAbsolutePath():返回此File的绝对路径
    *
    * */
    private static void show01(){
        File f1 = new File("C:\\Users\\Administrator\\Desktop\\1.txt");
        String absolute1 = f1.getAbsolutePath();
        System.out.println(absolute1);

        File f2 = new File("2.txt");
        String absolute2 = f2.getAbsolutePath();
        System.out.println(absolute2);

    }
}
