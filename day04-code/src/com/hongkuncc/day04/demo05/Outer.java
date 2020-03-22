package com.hongkuncc.day04.demo05;
/*
*
*
* */
public class Outer {
    int num =10;
    public class Inner{
        int num = 20;
        public void methodInner(){
            int num = 30;//内部方法局部变量
            System.out.println(num);//局部变量就近原则
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }
}
