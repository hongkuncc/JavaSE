package com.hongkuncc.day06.demo01;
/*
* 类object是类层次结构的根（父）类
* 每个类（Person。。。）都使用Object作为超（父）类
*
* */
public class Demo01ToString {
    public static void main(String[] args) {
        Person p = new Person("aaa",23);
        // String toString()返回该对象的字符串表示
        String s = p.toString();
        System.out.println(s);
        //直接打印对象的名字，其实就是调用对象的 toString p=p.toString();
        System.out.println(p);

        //看一个类是否重写了toString，直接打印这个类的对象即可

    }
}
