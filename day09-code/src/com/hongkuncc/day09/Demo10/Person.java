package com.hongkuncc.day09.Demo10;

import java.io.Serializable;

/*
* 序列化与反序列化时，会抛出异常NotSerializableException
*NotSerializableException - 某个要序列化的对象不能实现 java.io.Serializable 接口
* 当进行* 序列化与反序列化时，会检测是否有标记
* 有：可以序列化与反序列化
* 没有：抛出异常
*
 *static关键字：静态关键字
 *  静态优先于非静态加载到内存中(静态优先于对象进入到内存中)
 *  被static修饰的成员变量不能被序列化的，序列化的都是对象
 * * transient关键字：瞬态关键字

 * */
public class Person implements Serializable {
    private static final long serialVersionUID = 42L;
    private String name;
//    private transient int age;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
