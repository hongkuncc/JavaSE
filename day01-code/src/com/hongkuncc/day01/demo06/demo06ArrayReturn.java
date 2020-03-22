package com.hongkuncc.day01.demo06;

public class demo06ArrayReturn {
    public static void main(String[] args) {
        int[] arrayB = array(2,55,455);
        System.out.println(arrayB);
        System.out.println("总和为："+arrayB[0]);
        System.out.println("平均数为："+arrayB[1]);
    }

    public static int[] array(int a,int b,int c) {
        int sum = a+b+c;
        int avg = sum/3;
        int [] arrayA = {sum,avg};
        return arrayA;
    }

}
