package com.hongkuncc.day03.demo01;
/*
* 抽象方法
* 加上abstract,去掉大括号，直接分号结束
* 1、不能直接创建new抽象类对象
* 2、必须用一个子类来继承抽象父类
* 3、子类必须覆盖重写抽象父类当中所有的抽象方法
* 覆盖重写(实现)：子类去掉抽象方法的abstract关键字，然后补上方法体大括号
* 4、创建子类进行使用
* */
public abstract class Animal {
    public abstract void eat();
    /*public void normalMethod(){

    }*/
}
