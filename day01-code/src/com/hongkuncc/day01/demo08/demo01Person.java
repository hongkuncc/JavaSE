package com.hongkuncc.day01.demo08;

public class demo01Person {
    public static void main(String[] args) {
        Person person=new Person();
        person.show();
        System.out.println("============我是分割线=======");
        person.name="HANHAN";
        person.setAge(-20);
        person.show();
    }

}
