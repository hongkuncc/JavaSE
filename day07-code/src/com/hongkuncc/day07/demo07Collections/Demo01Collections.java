package com.hongkuncc.day07.demo07Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
*
* java.util.Collections
* static <T> boolean addAll(Collection<? super T> c, T... elements) 将所有指定元素添加到指定 collection 中。
 static void shuffle(List<?> list, Random rnd) 使用指定的随机源对指定列表进行置换。
*
* */
public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //往集合中添加多个元素
        /*list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");*/


        Collections.addAll(list,"a","b","c","d","e");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
