package com.hongkuncc.day08.demo02;

import java.io.File;
/*
* 递归打印多级目录
*
*
* */
public class Demo03Recursion {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\Administrator\\Desktop\\basic-code");
        recursionFile(f1);

    }
    public static void recursionFile(File dir){
//        System.out.println("被遍历的文件夹:"+dir);
       File[] files = dir.listFiles();
        for (File f : files) {
            if(f.isDirectory()) {//判断是否文件夹
                recursionFile(f);//本身是传递文件夹
            }else{//文件直接打印
                //只要Java文件
                /*String name = f.getName();
//                String path = f.getPath();
                String s = f.toString();
                boolean b =s.endsWith(".java");
                //判断是否以java结尾
                if(b) {
                    System.out.println(f);
                }*/
//                更高效的方法
                if(f.getName().endsWith(".java")){
                    System.out.println(f);
                }
            }
        }
    }
}
