package com.hongkuncc.day07.demo00.Demo01Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
* java.util
接口 Collection<E>
*
*
* 共性的方法：
*  boolean add(E e)  确保此 collection 包含指定的元素（可选操作）。
*  void clear() 移除此 collection 中的所有元素（可选操作）。
*  boolean isEmpty() 如果此 collection 不包含元素，则返回 true。
*  boolean contains(Object o) 如果此 collection 包含指定的元素，则返回 true。
*  boolean remove(Object o) 从此 collection 中移除指定元素的单个实例，如果存在的话（可选操作）。
*  int size() 返回此 collection 中的元素数。
*  Object[] toArray() 返回包含此 collection 中所有元素的数组。
*
*
* */
public class Demo01 {
    public static void main(String[] args) {
//        创建集合对象可以使用多态
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);//重写toString方法

        boolean b1 = coll.add("张三");
        System.out.println("b1:"+b1);
        System.out.println(coll);
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");
        System.out.println(coll);

        // boolean remove(Object o)
        boolean b2 = coll.remove("赵六");
        System.out.println("b2:"+b2);

        boolean b3 = coll.remove("赵四");
        System.out.println("b3:"+b3);
        System.out.println(coll);

        //boolean contains(Object o)

        boolean b4 = coll.contains("李四");
        System.out.println("b4:"+b4);

        boolean b5 = coll.contains("赵四");
        System.out.println("b5:"+b5);

        //boolean isEmpty()
        boolean b6 = coll.isEmpty();
        System.out.println("b6:"+b6);

       // int size() 返回此 collection 中的元素数
        int size = coll.size();
        System.out.println("size:"+size);

        //Object[] toArray()
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

        //void clear()
        coll.clear();
        System.out.println(coll);
        System.out.println(coll.isEmpty());

    }

}
