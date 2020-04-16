package com.hongkuncc.day06.demo04Calender;

import java.util.Calendar;

/*
* int get(int field)
          返回给定日历字段的值。
*
*public void set(int field,
                int value)将给定的日历字段设置为给定值。不管处于何种宽松性模式下，该值都不由此方法进行解释。

参数：
field - 给定的日历字段。
value - 给定日历字段所要设置的值。

*abstract  void add(int field, int amount)
          根据日历的规则，为给定的日历字段添加或减去指定的时间量
*
*  Date getTime()
          返回一个表示此 Calendar 时间值（从历元至现在的毫秒偏移量）的 Date 对象。
*
* */
public class Demo02Calendar {
    public static void main(String[] args) {
        demo03();
    }

    private static  void demo03(){
        Calendar c = Calendar.getInstance();

        c.add(Calendar.YEAR,2);
        c.add(Calendar.MONTH,-1);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);//西方0-11月，东方：1-12


        int month = c.get(Calendar.MONTH);
        System.out.println(month);//西方0-11月，东方：1-12

        int date =c.get(Calendar.DATE);
        System.out.println(date);

    }




    private static  void demo02(){
        Calendar c = Calendar.getInstance();

        c.set(Calendar.YEAR,9999);
        c.set(Calendar.MONTH,9);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);//西方0-11月，东方：1-12


        int month = c.get(Calendar.MONTH);
        System.out.println(month);//西方0-11月，东方：1-12

        int date =c.get(Calendar.DATE);
        System.out.println(date);
    }

    private static  void demo01() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month);//西方0-11月

        int date =c.get(Calendar.DATE);
        System.out.println(date);
    }
}