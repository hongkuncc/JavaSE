package com.hongkuncc.day02.demo03;

import java.util.Random;

public class demo01Random {
    public static void main(String[] args) {
        Random one = new Random();
        //随意取，全区间
        int sum = one.nextInt();
        System.out.println("随机数是："+sum);
        //左闭右开
        int sum2 = one.nextInt(2);
        System.out.println("随机数是："+sum2);
    }
}
