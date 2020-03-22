package com.hongkuncc.day03.demo04;
/*
*1、接口的默认方法，可以通过接口实现类对象，直接使用
*2、接口的默认方法，也可以被接口实现类进行覆盖重写
*
*
*
*  */
public class Demo02Interface {
    public static void main(String[] args) {
        //创建了实现类对象
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();
        //调用默认方法，如果实现类中没有，会向上寻找
        a.methodDefault();

//实现类B 覆盖重写了默认方法
        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();
    }
}
