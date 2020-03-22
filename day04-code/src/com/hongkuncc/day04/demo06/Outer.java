package com.hongkuncc.day04.demo06;
/*
* 局部内部类
*修饰符 class 外部类名称{
 *  修饰符 返回值类型 外部类方法名称(参数列表){
 *      class 局部内部类名称{
 *
 *
 *          }
 *   }
 * }
*
* 定义一个类的时候，权限修饰符级别
 * 1、外部类，public/(default)
 * 2、成员内部类：都可以
 * 3、局部内部类：什么都不能写
*
*
* */
public class Outer {
    public void methodOuter(){
        class Inner{
            int num = 10;
            public void methodInner(){
                System.out.println(num);//10
            }

        }
        Inner inner = new Inner();
        inner.methodInner();
    }
}
