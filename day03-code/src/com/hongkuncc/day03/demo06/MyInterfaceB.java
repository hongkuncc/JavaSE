package com.hongkuncc.day03.demo06;

public interface MyInterfaceB {
    public abstract void methodB();
    public abstract void methodCommon();
    public default void methodDefault(){
        System.out.println("bbb");
    }
}
