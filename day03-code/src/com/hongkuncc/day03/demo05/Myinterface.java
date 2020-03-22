package com.hongkuncc.day03.demo05;

public interface Myinterface {
    public default void method(){
        System.out.println("接口默认方法");
    }
}
