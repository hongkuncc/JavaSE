package com.hongkuncc.day08.demo01;

import java.io.File;

public class Demo02File {
    public static void main(String[] args) {
        /*
        * File 类的构造方法
        * */
        /**/show02("C:\\Users\\Administrator\\","1.txt");
        show03();
    }
    /*
     * File（File parent,String child）根据parent路径名字符串和
     * child路径名字符串创建一个新File实例
     *  参数：把路径分成了两部分
     * File parent:父路径
     * String child:子路径
     * */
    public static void show03(){
        File parent = new File("C:\\Users\\Administrator\\Desktop\\");
        File file = new File(parent,"hello.java");
        System.out.println(file);//最常用

    }

    /*
    * File（String parent,String child）根据parent路径名字符串和
     * child路径名字符串创建一个新File实例
    *  参数：把路径分成了两部分
    * String parent:父路径
    * String child:子路径
    * */
    public static void show02(String parent,String child){
        File file = new File(parent,child);
        System.out.println(file);
    }
    /*
    * File(String pathname)
    * 通过将给定路径名字符串转换为抽象路径名来创建一个新的File实例
    * 参数：
    *     String pathname:字符串的路径名称
    *
    * */

    private static void show01(){
        File f1 = new File("C:\\Users\\Administrator\\Desktop");
        System.out.println(f1);//重写Object类的toStrign方法

        File f2 = new File("C:\\Users\\Administrator\\Desktop");
        System.out.println(f2);//重写Object类的toStrign方法

        File f3 = new File("C:\\Users\\Administrator\\Desktop");
        System.out.println(f3);//重写Object类的toStrign方法

    }
}
