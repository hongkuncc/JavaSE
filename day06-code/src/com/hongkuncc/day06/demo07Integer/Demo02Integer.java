package com.hongkuncc.day06.demo07Integer;

import java.util.ArrayList;

/*
* 自动装箱与自动拆箱：基本类型的数据和包装类之间可以自动的相互转化
*
* */
public class Demo02Integer {
    public static void main(String[] args) {
        /*
        *
        * 自动装箱：直接把int类型的整数赋值包装类
        * Integer in = 1 ;就相当于Integer in = new Integer(1) ;
        *
        * */
        Integer in = 1;
        /*
        *
        * 自动拆箱：in 是包装类，无法直接参与运算，可以自动转换为基本数据类型，再进行计算
        * in+2;相当于 in.intValue()+2 = 3
        * in = in.intValue（）+2 =3又是一个自动装箱
        *
        * */
        in =in+2;

        ArrayList<Integer> list = new ArrayList<>();
        //Array不能直接存储int类型
        list.add(1);//自动装箱
        int a= list.get(0);




    }
}
