package com.hongkuncc.day07.demo07Collections;


import java.util.ArrayList;

import java.util.Collections;

/*
*
* static <T extends Comparable<? super T>>
void sort(List<T> list)
          根据元素的自然顺序 对指定列表按升序进行排序。


static <T> void
 sort(List<T> list, Comparator<? super T> c)
          根据指定比较器产生的顺序对指定列表进行排序。

*
* */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<String> list01 = new ArrayList<>();
        //往集合中添加多个元素
        list01.add("1");
        list01.add("6");
        list01.add("5");
        list01.add("9");
        list01.add("2");

        System.out.println(list01);

        Collections.sort(list01);
        System.out.println(list01);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("awe");
        list02.add("qew");
        list02.add("ggfthy");
        list02.add("hhj");
        list02.add("3hj");
        list02.add("!hj");
        Collections.sort(list02);
        System.out.println(list02);

        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("张三",12));
        list03.add(new Person("李四",23));
        list03.add(new Person("王五",45));
        list03.add(new Person("赵六",34));

        System.out.println(list03);
        Collections.sort(list03);
    }

}
