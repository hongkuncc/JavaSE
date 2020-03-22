package com.hongkuncc.day03.demo08;
/*
* 访问成员变量
* 1、直接访问，左边是谁，优先选择谁，找不到，向上找
* 2、间接通过成员方法访问成员变量，该方法属于谁就用谁，没有向上找
*
* 口诀：编译看左边，运行看右边
*
* 成员变量：编译看左边，运行看左边
* 成员方法：编译看左边，运行看右边
* */
public class Demo01MultiField {
    public static void main(String[] args) {
        Fu obj = new Zi();//多态
        System.out.println(obj.num);
        System.out.println("======");
        obj.showNumber();

        System.out.println("======");
        obj.method();//优先用子
        obj.methodFu();//子类没有，向上找

    }
}
