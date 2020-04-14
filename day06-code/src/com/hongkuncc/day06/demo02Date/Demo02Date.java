package com.hongkuncc.day06.demo02Date;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo03();
    }
    /*
    * long getTime()
          返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
    *
    * */
    private static void demo03(){
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);

    }

    /*
    * Date(long date)
          分配 Date 对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，
          即 1970 年 1 月 1 日 00:00:00 GMT）以来的指定毫秒数。
    *
    * */
    private static void demo02(){
        Date date = new Date(0L);
        System.out.println(date);//Thu Jan 01 08:00:00 CST 1970

        date =new Date(3742767540068L);
        System.out.println(date);
    }


    /*
    * public class Dateextends Objectimplements Serializable, Cloneable, Comparable<Date>
    *     类 Date 表示特定的瞬间，精确到毫秒

     * */
    private static void demo01(){
        Date date = new Date();
        System.out.println(date);//Tue Apr 14 23:17:54 CST 2020
    }
}
