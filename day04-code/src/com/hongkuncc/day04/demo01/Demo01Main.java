package com.hongkuncc.day04.demo01;
/*
*对象的向上转型，其实就是多态写法
* */
public class Demo01Main {
    public static void main(String[] args) {
        //对象的向上转型，就是，父类引用指向之类对象
        Animal animal = new Cat();
        animal.eat();
        //向下转型，进行"还原"动作
        Cat cat = (Cat) animal;
        cat.catachMouse();



    }
}
