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
    }

}
