package com.hongkuncc.day07.demo02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
*
* List接口的特点：
*   1、有序的集合，存储元素和去除元素的顺序是一致的（）
*   2、有索引，包含了一些带索引的方法
*   3、允许存储重复的元素
*
* List带索引的方法（特有）:
* add、get、remove、set
* public String get(int index)
  public String set(int index, String element)
  public void add(int index, String element)
  public String remove(int index)
*防止索引越界
*
*
* Array增删慢，查询快，日常常用为查询数据、遍历数据
* */
public class Demo01List {
    public static void main(String[] args) {
        //创建一个List集合对象，多态
        List<String> list = new ArrayList<>();
        //使用add方法往集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);

        list.add(3,"s");
        System.out.println(list);

        System.out.println(list.get(3));

        list.remove("s");
        System.out.println(list);

        list.set(3,"R");
        System.out.println(list);
        System.out.println("============");
        
        //list遍历循环
        for (int i = 0; i <list.size() ; i++) {
            String str = list.get(i);
            System.out.println("list遍历："+str);
        }
        System.out.println("=============");
        //迭代器
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str= it.next();
            System.out.println(str);
        }
        System.out.println("============");
        //增强for循环
        for(String i:list){
            System.out.println(i);
        }

    }
}
