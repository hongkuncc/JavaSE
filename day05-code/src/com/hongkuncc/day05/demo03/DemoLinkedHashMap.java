package com.hongkuncc.day05.demo03;

import com.hongkuncc.day05.demo02.Person;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
* LinkedhashMap
* Map接口的哈希表和链接列表,有序集合
* 底层原理：
* 哈希表+链表（记录元素的顺序）
* */
public class DemoLinkedHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a","北京");
        map.put("b","上海");
        map.put("c","广州");
        map.put("a","深圳");
        map.put("e","深圳");
        System.out.println(map);
        System.out.println("============");

        LinkedHashMap<String,String> map2 = new LinkedHashMap<>();
        map2.put("a","北京");
        map2.put("b","上海");
        map2.put("e","上海");
        map2.put("c","广州");
        map2.put("a","深圳");
        System.out.println(map2);

    }

}
