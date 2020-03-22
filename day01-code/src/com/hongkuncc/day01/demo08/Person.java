package com.hongkuncc.day01.demo08;

public class Person {
    String name;
    private int age;
    public void show(){
        System.out.println("我的名字是："+name+"\n"+"我今年"+age+"岁");
    }
    public void setAge(int num ){
        if (num <100 && num>0) {
            age = num;
        }
        else {
            System.out.println("不合理的年龄");
        }

    }
    public int getAge(){
        return age;
    }

}
