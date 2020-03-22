package com.hongkuncc.day04.demo07;
/*
* 匿名对象类
 * new 接口名称（）{...}
 *1、new代表创建对象的动作
 *2、接口名称就是匿名内部类需要实现哪个接口
 *3、{...}这才是匿名内部类的内容
 *注意：
 * 1、匿名创建对象时只能使用一次，
 *2、匿名对象，在调用方法时，只能使用一次
 *
 * */
public class DemoMain {
    public static void main(String[] args) {
//使用匿名内部类
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类方法");
            }
        };
        obj.method();
    }
}
