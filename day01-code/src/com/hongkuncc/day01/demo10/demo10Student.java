package com.hongkuncc.day01.demo10;

public class demo10Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setAge(29);
        stu1.setName("chk");
        System.out.println("姓名："+stu1.getName()+"\n"+"年龄："+stu1.getAge());
        System.out.println("==============================");
        Student stu2= new Student("chk",33);
        System.out.println("姓名："+stu2.getName()+"\n"+"年龄："+stu2.getAge());
    }
}
