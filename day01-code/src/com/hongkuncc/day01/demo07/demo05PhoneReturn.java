package com.hongkuncc.day01.demo07;

public class demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = new getPhone();
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);

    }
    public static Phone getPhone(){
        Phone one=new Phone();
        one.color="red";
        one.brand="MI";
        one.price=4873.9;
        return one;
    }

}
