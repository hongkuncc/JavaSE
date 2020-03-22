package com.hongkuncc.day01.demo07;

public class demo01PhoneOne {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.price=8848.0;
        one.brand="MI";
        one.color="green";
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println("================");

        one.call("jOBS");
        one.sentMessage();

    }
}
