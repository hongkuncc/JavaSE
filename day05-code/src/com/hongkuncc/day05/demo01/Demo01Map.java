package com.hongkuncc.day05.demo01;

import java.util.HashMap;
import java.util.Map;

/*
* Map集合中key不能相同，value可以相同，一一对应
*常用类：HashMap和LinkedHashMap
* HashMap集合特点：
* 1、查询速度特别快，JDK1.8以后：数组+单项链表/红黑树提高查询速度
* 2、hashmap是一个无序集合，存储元素和取出元素的顺序可能不一样
*LinkedHashMap特点
* 1、LinkedHashMap底层是哈希表+链表（保证迭代的顺序）
* 2、LinkedHashMap是有序集合，存储元素和取出元素的顺序一样
* */
public class Demo01Map {
    public static void main(String[] args) {
        show04();
    }
    /*
    * 返回值：v
    * 存储键值对的时候，key不重复，返回值v是null
    * 存储键值对的时候，key重复，会使用新的value替换map中重复的value
    *
    * */
    public static void show04(){
        Map<String,Integer> map = new HashMap<>();
        map.put("ss1",23);
        map.put("ss2",24);
        map.put("ss3",25);
        boolean v1 = map.containsKey("ss1");
        boolean v2 = map.containsKey("ss");

        System.out.println("v1:"+v1);
        System.out.println("======");
        System.out.println("v2:"+v2);
    }
    public static void show03(){
        Map<String,Integer> map = new HashMap<>();
        map.put("ss1",23);
        map.put("ss2",24);
        map.put("ss3",25);
        Integer v1 = map.get("ss1");
        Integer v2 = map.get("ss");

        System.out.println("v1:"+v1);
        System.out.println("======");
        System.out.println("v2:"+v2);
    }
    public static void show02(){
        Map<String,Integer> map = new HashMap<>();
        map.put("ss1",23);
        map.put("ss2",24);
        map.put("ss3",25);
        System.out.println(map);
        System.out.println("======");

        Integer v1 = map.remove("ss1");
        System.out.println("v1:"+v1);
        System.out.println(map);
    }
    public static void show01(){
        Map<String,String> map = new HashMap<>();
        String v1 = map.put("aa","BB1");
        System.out.println("v1:"+v1);
        System.out.println("========");
        String v2 = map.put("aa","BB2");
        System.out.println("v2:"+v2);

        map.put("cc1","dd1");
        map.put("cc2","dd2");
        System.out.println(map);

    }

}
