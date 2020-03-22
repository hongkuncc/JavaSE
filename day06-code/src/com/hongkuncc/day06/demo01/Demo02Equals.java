package com.hongkuncc.day06.demo01;

public class Demo02Equals {
    public static void main(String[] args) {
        /*
         * equals方法源码：
         *  public boolean equals(Object obj) {
                return (this == obj);
            }
         *
         * */

        Person p1 = new Person("aaa", 12);
        Person p2 = new Person("bbb", 13);
        System.out.println("p1:"+p1);
        System.out.println("p2:"+p2);
        p1=p2;
        boolean b = p1.equals(p2);
        System.out.println(b);
        /*
        * Object类的equals方法，默认比较的是两个对象的地址值，没有意义
        * 所以需要重写equals方法，比较两个对象的属性（name,age）
        * 问题：
        *     隐含一个多态
        *     多态的弊端：无法使用子类特有的内容(属性和方法)
        *
        * */

    }
}
