package com.hongkuncc.day03.demo04;
/*
*
* 问题描述
* 我们需要抽取一个共有方法，用来解决两个默认方法之间重复代码的问题
* */
import javax.xml.bind.SchemaOutputResolver;

public interface MyInterfacePrivateA {
    public default void methodDefault1(){
        System.out.println("默认方法1");
//        methodCommon();
    }

    public default void methodDefault2(){
        System.out.println("默认方法2");
//        methodCommon();
    }

  /*  private void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");

        private java9独有
    }    */
}
