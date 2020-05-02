package com.hongkuncc.day11.demo01;
/*
* 函数式接口的使用：一般可以作为方法的参数和返回值类型
*
* 如果传入2，那就白拼接了，性能浪费
* */
public class Demo01 {
    public static void show(MyFunctionalInterface myInter){
        myInter.method();
    }
    public static void main(String[] args) {
        //调用show方法，方法的参数是一个接口，所以可以传递接口的实现类对象

        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });

        //调用show方法，方法的参数是一个函数式接口，所以可以使用lambda表达式
        show(()->{
            System.out.println("使用lambda表达式拆卸接口中的抽象方法");
        });
//简化lambda
        show(()->
            System.out.println("使用lambda表达式拆卸接口中的抽象方法")
        );

    }
}
