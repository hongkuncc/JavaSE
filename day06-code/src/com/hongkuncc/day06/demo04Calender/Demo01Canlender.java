package com.hongkuncc.day06.demo04Calender;

import java.util.Calendar;

/*
*
*
*java.util.Calendar 抽象类
*
* Calendar类无法直接创建对象使用，
* static Calendar getInstance()
          使用默认时区和语言环境获得一个日历  返回了calender的子类
* */
public class Demo01Canlender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance() ;//多态
        System.out.println(c);
    }
}
