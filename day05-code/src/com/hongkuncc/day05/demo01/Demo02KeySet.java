package com.hongkuncc.day05.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
* Map集合第一种遍历方式，通过键找值的方式
* Map集合中的方法：
*   Set<K> keySet() 返回此映射中包含的键的set视图
* 实现步骤：
* 1、使用keySet()，把Map集合所以有的Key取出来，存储到一个Set集合中
* 2、遍历Set集合，获取Map集合中的每一个key
* 3、通过Map集合中的get(key),找到value
*
* */
public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("ss1",23);
        map.put("ss2",24);
        map.put("ss3",25);

        Set<String> set = map.keySet();

        Iterator<String> it =  set.iterator();
        while (it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println("key:"+value);
        }

        System.out.println("====================");
        //增强for循环
        for (String key :set){//简化 (String key :map.keySet())
            Integer value = map.get(key);
            System.out.println("key:"+value);
        }

    }

}
