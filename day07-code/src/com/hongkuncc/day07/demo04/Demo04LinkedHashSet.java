package com.hongkuncc.day07.demo04;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
* LinkedHashSet extends HashSet
*  LinkedHashSet底层是一个
* 哈希表(数组+链表/红黑树)+链表)：多了一条链表（记录元素的存储顺序），保证元素有序
*
* */
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("chk");
        System.out.println(set);//不可重复，无序
        System.out.println("=================");
        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("chk");
        linked.add("abc");
        linked.add("www");
        System.out.println(linked);//不可重复，有序

    }
}
