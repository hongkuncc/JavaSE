package com.hongkuncc.day08.demo01;

import java.io.File;
import java.io.IOException;

public class Demo05File {
    public static void main(String[] args) throws IOException {
        show01();
    }
    /*
    * public boolean createNewFile()
    * public boolean delete()
    * public boolean mkdir()
    * public boolean mkdirs()
    *
    *
    * */
    private static void show01() throws IOException {
        File f1 = new File("C:\\Users\\Administrator\\Desktop\\1.txt");
        boolean b1 = f1.createNewFile();
        System.out.println(b1);
        File f2 = new File("b.txt");
        System.out.println(f2.createNewFile());

    }
}
