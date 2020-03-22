package com.hongkuncc.day08.demo02;
/*
*
* 递归要设置条件不然会导致栈内存溢出
* Exception in thread "main" java.lang.StackOverflowError
 * */
public class Demo01Recursion {
    public static void main(String[] args) {
        b(-1);
    }
    public static void b(int i){
        System.out.println(i);
        if(i==1000){
            return;//结束
        }
        b(++i);
    }
    public static void a(){
        System.out.println("我是大帅比");
        a();
    }

}
