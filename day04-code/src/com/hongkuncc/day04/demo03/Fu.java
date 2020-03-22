package com.hongkuncc.day04.demo03;
/*
* 对于类、方法来说，abstract关键字和final关键字不能同时使用，因为矛盾
*
* */
public abstract class Fu {
    public final void method(){
        System.out.println("父类方法执行");
    }
    public abstract void methodAbs();
}
