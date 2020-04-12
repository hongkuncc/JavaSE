package com.hongkuncc.day07.demo07Collections;

import java.util.ArrayList;

/*
*
*
static <T> void sort(List<T> list, Comparator<? super T> c)
 根据指定比较器产生的顺序对指定列表进行排序。

*
* */
public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //往集合中添加多个元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
    }

}
