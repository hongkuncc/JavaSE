package com.hongkuncc.day04.demo05;

/*
* 内部类使用方法
* 1、在外部类的方法中，使用内部类，然后使用main只是调用外部类的方法
*2、
*
* */
public class Body {
    public class Heart{
        public void beat(){
            System.out.println("跳动");
            System.out.println("我叫"+name);
        }
    }
//外部类的成员变量
    private String name;
    //外部类的方法
    public void methodBody(){
        System.out.println("外部类的方法");
        new Heart().beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
