package com.hongkuncc.day02.demo05;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class demo01ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        System.out.println(list);

        list.add("h1");
        list.add("h2");
        list.add("h3");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("遍历"+list.get(i));
        }
    }

}
