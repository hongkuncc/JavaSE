package com.hongkuncc.day05.demo03;

import java.util.HashMap;
import java.util.Hashtable;

/*
*Hastable也是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢
*HashMap：底层是一个哈希表，是一个线程不安全的集合，是多线程的集合，速度快
*HshMap集合：可以存储null值，null键
* Hashtable集合，不能存储null值，null键
*Hashtable集合和Vector被更先进的集合取代（HashMap,ArrayList）
* Hashtable集合子类properties与IO流相结合
* */
public class DemoHashTable {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,"北京");
        map.put("b",null);
        map.put(null,null);
        System.out.println(map);
        System.out.println("============");

        Hashtable<String,String> hashtable = new Hashtable<>();
        hashtable.put(null,"北京");
        hashtable.put("b",null);
        hashtable.put(null,null);
        System.out.println(hashtable);
        System.out.println("============");
    }
}
