package com.hongkuncc.day03.demo04;
/*
* 接口当中也可以也可以定义”成员变量“，但是必须使用public static final 一个关键字进行修饰
*
* public static final 数据类型 常量名称 = 数据值
* */
public interface MyInterfaceConstant {
    //这其实就是一个常量，一旦赋值，不可改变
    public static final int num =12;

}
