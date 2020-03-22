package com.hongkuncc.day04.demo01;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void catachMouse(){
        System.out.println("猫抓老鼠");
    }
}
