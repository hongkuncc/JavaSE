package com.hongkuncc.day05.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
*
* entrySet()
*
* */
public class Demo03EntrySet {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("ss1",23);
        map.put("ss2",24);
        map.put("ss3",25);
        Set<Map.Entry<String,Integer>> set= map.entrySet();

        Iterator<Map.Entry<String,Integer>> it =  set.iterator();
        while (it.hasNext()){
            Map.Entry<String,Integer> entry = it.next();

            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }

        System.out.println("====================");
        //增强for循环
        for (Map.Entry<String,Integer> entry :set){//简化 (String key :map.keySet())
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }

    }
}
