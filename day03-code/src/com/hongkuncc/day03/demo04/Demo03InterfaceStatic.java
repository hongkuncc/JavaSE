package com.hongkuncc.day03.demo04;
/*
* 不能通过接口类的对象来调用接口当中的静态方法
*
* */
public class Demo03InterfaceStatic {
    public static void main(String[] args) {
    MyInterfaceStaticiImpl a = new MyInterfaceStaticiImpl();

//    错误写法
//    a.methodStatic();
    //直接通过接口名称调用静态方法
    MyInterfaceStatic.methodStatic();
    }
}
