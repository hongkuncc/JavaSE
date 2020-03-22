package com.hongkuncc.day02.demo02;

public class demo01Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "hhh";
        one.showName();
        System.out.println("============");

        //匿名对象，只使用一次
        new Person().name = "作者";
        new Person().showName();
    }
}
