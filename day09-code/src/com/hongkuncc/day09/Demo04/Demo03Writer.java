package com.hongkuncc.day09.Demo04;

import java.io.FileWriter;
import java.io.IOException;

public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day09-code\\f.txt");
        char[] cs = {'a','b','c','d','e'};
        fw.write(cs);

        fw.write(cs,1,3);

        fw.write("我是");
        fw.write("哈哈哈");

        fw.close();
    }
}
