package com.hongkuncc.day01.demo05;

public class demo05Method {
    public static void main(String[] args) {
        method1(4,7);
        method2();
    }

    //有参数
    public static void method1(int a,int b) {
        int result = a*b;
        System.out.println("乘积是："+result);
    }
    //无参数,打印输出固定次数

    public static void method2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello ,World"+i);
        }

    }
}
