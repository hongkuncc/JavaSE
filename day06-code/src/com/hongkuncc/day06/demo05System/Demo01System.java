package com.hongkuncc.day06.demo05System;

public class Demo01System {
    public static void main(String[] args) {
        demo01();
    }
    private static void demo01(){
        //程序运行前获取一次毫秒值
        long s = System.currentTimeMillis();
        for (int i = 0; i <=9999 ; i++) {
            System.out.println(i);
        }
        //程序运行后获取一次毫秒值
        long e = System.currentTimeMillis();
        System.out.println("程序共耗时："+(e-s)+"毫秒");
    }
}
