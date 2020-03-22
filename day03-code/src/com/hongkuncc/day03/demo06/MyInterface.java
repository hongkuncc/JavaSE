package com.hongkuncc.day03.demo06;

public interface MyInterface extends MyInterfaceA,MyInterfaceB {
    public abstract void method();

    @Override
    public default void methodDefault() {

    }
}
