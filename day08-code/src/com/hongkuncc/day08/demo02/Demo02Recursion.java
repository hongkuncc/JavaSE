package com.hongkuncc.day08.demo02;
/*
* f(n)=n!
* =n*(n-1)(n-2)(n-3)...1
* */
public class Demo02Recursion {
    public static void main(String[] args) {
        int m = multi(5);
        System.out.println(m);
    }
    public static int multi(int i){
        if (i==1){
            return 1;
        }

        return i*multi(i-1);
    }
}
