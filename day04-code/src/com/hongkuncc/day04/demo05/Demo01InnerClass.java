package com.hongkuncc.day04.demo05;
/*
*  内部类
*1、成员内部类
*2、局部内部类：包含匿名内部类
*成员内部类的定义格式：
* 修饰符 class 类名称{
* 修饰符 class 内部类名称{
*   }
* }
*内用外随意访问
* 外用内借助内部对象才能用
*
* ====
* 使用成员内部类
* 1、间接方式：在外部类的方法中，使用内部类，然后main只是调用外部类的方法
* 2、直接方式：
* 类名称 对象名 = new 类名称（）；
* 外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
 *
*
* */
public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body();//外部类对象
        //通过外部类的对象，调用外部类的方法，里面间接使用内部类heart
        body.methodBody();
        System.out.println("=================");

        Body.Heart heart = new Body().new Heart();
        heart.beat();

    }
}