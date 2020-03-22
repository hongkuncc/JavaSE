package com.hongkuncc.day04.demo09;
/*
* 接口作为方法的参数和返回值都可以
* */
import java.util.ArrayList;
import java.util.List;

public class DemoInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println();
        }
    }
        public static List<String> addNames(List<String> list){
            list.add("aa");
            list.add("bb");
            list.add("cc");
            list.add("dd");
            return list;
        }


}
