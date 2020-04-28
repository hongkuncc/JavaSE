package com.hongkuncc.day06.demo06StringBuilder;

public class Demo03StringBulider {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("str"+str);
        StringBuilder bu = new StringBuilder(str);
        //往StringBuilder中添加数据
        bu.append("world");
        System.out.println("bu:"+bu);

        String s = bu.toString();
        System.out.println("s:"+s);

    }
}
