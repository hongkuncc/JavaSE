package com.hongkuncc.day07.demo05;

import java.util.HashSet;

public class Demo01HashSetSaveString {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("hahah");
        System.out.println(set);
    }
}
