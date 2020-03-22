package com.hongkuncc.day01.demo05;

public class methodOverload {
    public static void main(String[] args) {
        byte a=4;
        byte b=5;
        System.out.println(issame(a,b));
        System.out.println(issame((short) 5,(short) 6));
        System.out.println(issame(7,8));
        System.out.println(issame(7L,8L));


    }

    public static boolean issame(int a,int b){
        System.out.println("两个参数的INT方法执行");
       boolean same;
        if (a==b){
            same=true;
        }
        else {
            same= false;
        }
        return same;

    }

    public static boolean issame(byte a,byte b) {
        System.out.println("两个参数的BYTE方法执行");
        boolean result = a==b?true:false;
        return result;
    }
    public static boolean issame(short a,short b) {
        System.out.println("两个参数的SHORT方法执行");
        return a==b;
    }
    public static boolean issame(long a,long b) {
        System.out.println("两个参数的long方法执行");
        return a==b;
    }

}
