package com.hongkuncc.day07.demo04;
/*
* HashSet存储数据结构（哈希表）
* 哈希表=数组+链表
* 哈希表=数组+红黑树（提高查询的速度）
*
* */
public class Demo01HashSet {
    public static void main(String[] args) {
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);
        System.out.println("===============");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1=p2);
        System.out.println("============");

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }

}
