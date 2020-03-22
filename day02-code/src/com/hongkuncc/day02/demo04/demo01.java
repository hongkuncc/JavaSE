package com.hongkuncc.day02.demo04;

public class demo01 {
    public static void main(String[] args) {
        Person[] arrary = new Person[3];
        System.out.println(arrary[0]);

        Person one = new Person();
        Person two = new Person();
        Person three = new Person();
        one.name = "h1";
        two.name = "h2";
        three.name = "h3";
        one.age=23;
        two.age=24;
        three.age=25;
        arrary[0]=one;
        arrary[1]=two;
        arrary[2]=three;

        System.out.println("你的名字是："+one.getName());
        System.out.println("你的年龄是："+one.getAge());

    }
}
