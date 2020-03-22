package com.hongkuncc.day03.demo08;

public class Zi extends Fu {
    int num = 20;
    int age = 16;

    @Override
    public void showNumber() {
        System.out.println(num);
    }

    @Override
    public void method() {
        System.out.println("子类方法");
    }

    @Override
    public void methodFu() {
        System.out.println("子类特有方法");

    }
}
