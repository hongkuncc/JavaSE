package com.hongkuncc.day07.demo00.Demo02Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* java.util
接口 Iterator<E>
*
* 常用方法：
* boolean hasNext()
          如果仍有元素可以迭代，则返回 true。
* E next()
          返回迭代的下一个元素。
*Iterator 迭代器，是一个接口，无法直接使用，需要使用Iterator接口的实现类对象，
* 获取实现类的方法比较特殊
* Collection有一个方法：iterator()该方法返回的就是迭代器的实现类对象
* Iterator<E> iterator()
          返回在此 collection 的元素上进行迭代的迭代器。
*
* */
public class Demo01 {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll = new ArrayList<>();
        coll.add("123");
        coll.add("1234");
        coll.add("12345");
        coll.add("123456");

        Iterator<String> it = coll.iterator();

        /*boolean b = it.hasNext();
        System.out.println(b);

        String s = it.next();
        System.out.println(s);

        b = it.hasNext();
        System.out.println(b);
        s = it.next();
        System.out.println(s);

        b = it.hasNext();
        System.out.println(b);
        s = it.next();
        System.out.println(s);

        b = it.hasNext();
        System.out.println(b);
        s = it.next();
        System.out.println(s);

        b = it.hasNext();
        System.out.println(b);
        s = it.next();
        System.out.println(s);
*/

        //优化后
        while(it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }
        System.out.println("====================");

        for ( Iterator<String> it2 = coll.iterator(); it2.hasNext(); ) {
            String e = it2.next();
            System.out.println(e);

        }






    }

}
