package com.hongkuncc.day03.demo05;
/*
* 1、接口是没有静态代码块或者构造方法的
* 2、一个类有直接父类是唯一的，但是一个类可以同时实现多个接口
*3、
* 4、如果实现类没有覆盖重写所有接口当中所有抽象方法，那么实现类就必须是一个抽象类
* 5、如果是实现类锁实现的多个接口中，存在重复的的默认方法，那么实现类一定要对冲突的
* 默认方法进行覆盖重写
*6、一个类当中直接父类中的方法，和接口当中的默认方法产生了冲突，优先使用父类当中的方法
* */
public interface MyInterfaceA {

    public abstract void methodA();
    public abstract void methodAbs();
    public default void methodDefault(){
        System.out.println("默认方法AAA");
    }
}
