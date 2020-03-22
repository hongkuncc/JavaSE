package com.hongkuncc.day03.demo04;

public interface MyInterfaceDefault {
    //抽象方法
    //新增一个抽象方法
    public abstract void methodAbs();
//    public abstract void methodAbs2();

    public default void methodDefault(){
        System.out.println("这是新添加的方法");
    }
}
