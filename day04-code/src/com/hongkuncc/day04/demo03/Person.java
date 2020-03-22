package com.hongkuncc.day04.demo03;
/*
* 1、由于成员变量具有默认值，所以用了final之后必须手动赋值，不会再给默认值了
* 2、对于final的成员变量，要么使用直接赋值，要么通过构造方法赋值.二选一
*3\必须保证类当中所有重载的
*
* */
public class Person {
    private final String name /*= "chk"*/;

    public Person() {
        name="chk";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

/*    public void setName(String name) {
        this.name = name;
    }*/
}
