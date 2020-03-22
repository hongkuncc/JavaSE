package com.hongkuncc.day08.demo03;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/*
* 过滤器
*listFiles(FileFilter filte)
* 过滤文件(File对象)
* boolean accept(File pathname)
*listFiles(FilenameFilter filte)
* 用来过滤文件名称
*
* */
public class Demo01Filter {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\Administrator\\Desktop\\basic-code");
        recursionFile(f1);

    }
    public static void recursionFile(File dir){
//       传递过滤器对象，使用匿名内部类

      /*  File[] files = dir.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".java");
                }
        });*/
        /*File[] files =dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".java");
            }
        });*/
//        使用lambda表达式优化匿名内部类（接口中只有一个抽象方法）
       /* File[] files =dir.listFiles((File d,String name)->{
            return new File(d,name).isDirectory()||name.toLowerCase().endsWith(".java");
        });*/
//        使用lambda表达式优化匿名内部类（接口中只有一个抽象方法）
       File[] files =dir.listFiles((File pathname)->{
           return pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".java");
        });


        for (File f : files) {
            if(f.isDirectory()) {//判断是否文件夹
                recursionFile(f);//本身是传递文件夹
            }else{//文件直接打印

                    System.out.println(f);

            }
        }
    }
}
