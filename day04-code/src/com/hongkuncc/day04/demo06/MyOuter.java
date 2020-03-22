package com.hongkuncc.day04.demo06;


public class MyOuter {
    public void methodOuter(){
        int num = 10;//所在方法的局部变量，final 可省略

        class MyInner{
            public void methodInner(){
                System.out.println(num);
            }
        }
    }
}
