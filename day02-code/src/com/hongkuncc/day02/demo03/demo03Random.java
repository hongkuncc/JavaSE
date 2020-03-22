package com.hongkuncc.day02.demo03;

import java.util.Random;

public class demo03Random {
    public static void main(String[] args) {
        Random  r= new Random();
        int result;

        for (int i = 0; i < 100; i++) {
            int n=6;
            result =r.nextInt(n)+1;
            System.out.println("取到的值为："+result);
        }
    }
}
