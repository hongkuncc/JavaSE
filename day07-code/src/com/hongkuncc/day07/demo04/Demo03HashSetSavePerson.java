package com.hongkuncc.day07.demo04;

import java.util.HashSet;
/*
* HashSet存储自定义元素
* set集合报错元素唯一：
*   存储的元素（String,Integer,...Student,Person）
*   必须重写hashCode方法和equal方法
* 要求：
*       同名同年龄的人，视为同一个人，只能存储一次
*
*
*
*
* */
public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>() ;
        Person p1 = new Person("h1",12);
        Person p2 = new Person("h1",12);
        Person p3 = new Person("h3",14);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
