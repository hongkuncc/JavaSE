package com.hongkuncc.day09.Demo11;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
*
* 打印流
* java.io.PrintStream 打印流
*
*
* */
public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
//        System.out.println();
        PrintStream ps = new PrintStream("day09-code\\f.txt");
        ps.write(97);
        ps.println(97);
        ps.println(9.7);
        ps.println('a');
        ps.println("HelloWorld");
        ps.println(true);
        ps.println(97);


        ps.close();
    }
}
