package com.hongkuncc.day03.demo07;
/*
* 多态
*
* */
public class Demo01Multi {
    public static void main(String[] args) {
        //多态写法
        //左侧父类引用指向右侧子类对象
        Fu obj =new Zi();
        obj.method();
        obj.methodFu();
}
}
