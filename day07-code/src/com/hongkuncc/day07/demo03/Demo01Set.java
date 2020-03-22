package com.hongkuncc.day07.demo03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
* Set 接口的特点
* 1、不允许存储重复的元素
* 2、没有索引，没有带索引的方法，也不能使用普通的for循环遍历
*
*HashSet:无序集合，存储元素和取出的顺序有可能不一样，
* 底层是一个哈希表结构（查询速度非常快）
* */
public class Demo01Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(4);
        System.out.println(set);
        //迭代器遍历遍历
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            Integer integer = it.next();
            System.out.println(integer);

        }
        System.out.println("=========");
        //增强for循环
        for(Integer inte:set){
            System.out.println(inte);
        }

    }
}
