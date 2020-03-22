package com.hongkuncc.day01.demo08;

public class demo02Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("huge");
        stu.setAge(34);
        stu.setMale(true);
        System.out.println("我的姓名："+stu.getName());
        System.out.println("年龄是："+stu.getAge());
        System.out.println("是否男女："+stu.isMale());

    }
}
