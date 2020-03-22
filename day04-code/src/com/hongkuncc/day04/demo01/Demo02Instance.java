package com.hongkuncc.day04.demo01;
/*
* 如何才能纸雕一个父类引用的对象，本来是什么子类
* 格式：
* 对象 instanceof 类名称
* 将会得到一个boolean值结果，也就是判断前面的对象能不能当作后面类型的实例
* */

public class Demo02Instance {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.protectHouse();
        }
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catachMouse();
        }
        method(new Cat());
    }
    public static void method(Animal animal){
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.protectHouse();
        }
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catachMouse();
        }
    }
}

