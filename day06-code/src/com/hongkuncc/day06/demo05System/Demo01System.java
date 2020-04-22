package com.hongkuncc.day06.demo05System;

/*
* java.lang.System
*
*public final class Systemextends ObjectSystem 类包含一些有用的类字段和方法。它不能被实例化。
在 System 类提供的设施中，有标准输入、标准输出和错误输出流；对外部定义的属性和环境变量的访问；加载文件和库的方法；还有快速复制数组的一部分的实用方法。


static long currentTimeMillis()返回以毫秒为单位的当前时间
static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。

* */
import java.util.Arrays;

public class Demo01System {
    public static void main(String[] args) {
        demo02();
    }
    private static void demo02(){
        //定义源数组
        int[] src = {1,2,3,4,5};
        int[] dest = {14,15,6,7,8};
        System.out.println("复制前："+Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后："+Arrays.toString(dest));
    }
    private static void demo01(){
        //程序运行前获取一次毫秒值
        long s = System.currentTimeMillis();
        for (int i = 0; i <=9999 ; i++) {
            System.out.println(i);
        }
        //程序运行后获取一次毫秒值
        long e = System.currentTimeMillis();
        System.out.println("程序共耗时："+(e-s)+"毫秒");
    }
}
