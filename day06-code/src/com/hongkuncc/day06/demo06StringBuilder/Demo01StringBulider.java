package com.hongkuncc.day06.demo06StringBuilder;
/*
* java.lang.StringBuffer
*StringBuilder(String str)
  构造一个字符串生成器，并初始化为指定的字符串内容。
* */
public class Demo01StringBulider {
    public static void main(String[] args) {
        //空参数构造方法
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);
        //使用带参构造
        StringBuilder sb2 = new StringBuilder("hongkuncc");
        System.out.println(sb2);
    }
}
