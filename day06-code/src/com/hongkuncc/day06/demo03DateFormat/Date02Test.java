package com.hongkuncc.day06.demo03DateFormat;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
*
* 使用日期相关API计算出一个人已经出生了多少天
*
* */
public class Date02Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生日期：");
        String birthday = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate =sdf.parse(birthday);
        long birthdatDateTime = birthdayDate.getTime();
        long today = new Date().getTime();
        long time = today -birthdatDateTime;
        System.out.println(time/1000/60/60/24);

    }

}
