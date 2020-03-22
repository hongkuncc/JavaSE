package com.hongkuncc.day01.demo04;

public class demo04Method {
    public static void main(String[] args) {
//        直接调用
        sum(5,10);
        System.out.println("=============");
//        打印调用
        System.out.println(sum(2,10));
        System.out.println("==============");
//        赋值调用
        int number=sum(100,30);

        System.out.println("最后结果："+number);

    }

    public static int sum(int a,int b) {
        int sum = a+b;
        return sum;

    }
}
