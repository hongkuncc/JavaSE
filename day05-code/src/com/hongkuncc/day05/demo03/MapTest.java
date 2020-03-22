package com.hongkuncc.day05.demo03;

import java.util.HashMap;
import java.util.Scanner;

public class MapTest {
    public static void main(String[] args) {
        //1使用Scanner获取用户输入的字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //2创建Map集合，key是字符串的字符，value是字符的个数
        HashMap<Character,Integer> map = new HashMap<>();
        //3.遍历字符串，获取每一个字符
        for(char c:str.toCharArray()){
            //4.用获取的字符，去Map集合判断key是否存在
            if (map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else{
                map.put(c,1);
            }
        }
        //遍历Map集合，输出结果
        for(Character key :map.keySet()){
            Integer value= map.get(key);
            System.out.println(key+"="+value);
        }
    }

}
