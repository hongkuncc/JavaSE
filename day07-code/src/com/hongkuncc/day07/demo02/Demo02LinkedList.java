package com.hongkuncc.day07.demo02;

import java.util.LinkedList;

/*
* linkedlist集合的特点
* 1、底层是一个链表结构：查询慢，增删快
* 2、里面包含了大量操作首尾元素的方法
* linkedlist集合特有的特点：不能使用多态
* */
public class Demo02LinkedList {
    public static void main(String[] args) {
      show02();

    }
    public static void show02(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("c");
        linkedList.add("b");
        linkedList.add("Z");
        System.out.println(linkedList);

        String str =linkedList.pop();
//        String str =linkedList.removeFirst();同上
        System.out.println("被移除的第一个元素："+str);
        String last =linkedList.removeLast();
        System.out.println("被移除的最后一个元素："+last);

    }
    public static void show01(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("c");
        linkedList.add("b");
        linkedList.add("a");
        System.out.println(linkedList);

        linkedList.addFirst("e");
        System.out.println(linkedList);
        System.out.println("================");
        linkedList.addLast("zz");
        System.out.println(linkedList);
        System.out.println("=============");

        linkedList.push("a");
//        linkedList.addFirst("a");同上
        System.out.println(linkedList);
        System.out.println("=============");

        String str = linkedList.getFirst();
        System.out.println(str);

//        linkedList.clear();


    }

}
