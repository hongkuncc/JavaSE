package com.hongkuncc.day04.demo03;
/*
* final 关键字，不可更改的
* 常用：
* 1、修饰一个类
* 2、修饰一个方法
* 3、修饰一个局部变量
* 4、修饰一个成员变量
*
* */
public class DemoFinal {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);

        //一旦使用final用来修饰局部变量，那么这个变量就不能进行更改
        //一次复制，终生不变
        final int num2 = 200;
        System.out.println(num2);
        //num2 = 250;错误写法

        //正确写法！只要保证有唯一一次赋值即可
        final int num3;
        num3 = 30;


    }
}
