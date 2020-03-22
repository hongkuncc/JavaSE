package com.hongkuncc.day07.demo01;

import java.util.ArrayList;

/*
* 增强for循环
* for(集合/数组的数据类型 变量名：集合名/数组名){
* sout(变量名);
* }
*
* */
public class Demo01Foreach {
    public static void main(String[] args) {
        demo01();
        demo02();
    }
    //for循环遍历集合
    private static void demo02(){
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for(String s:list){
            System.out.println(s);
        }
    }

    //for循环遍历数组
    private static void demo01(){
        int[] arr  = {1,2,3,4,5};
        for (int i:arr) {
            System.out.println();
        }
    }
}
