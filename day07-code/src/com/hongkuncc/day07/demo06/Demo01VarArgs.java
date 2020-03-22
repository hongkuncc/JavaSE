package com.hongkuncc.day07.demo06;
/*
* 可变参数
* 使用前提：当方法的参数列表数据类型已经确定，但是参数的个数不确定使用可变参数
*定义方法时使用：
* 修饰符 返回值类型 方法名（数据类型...变量名）{}
*
* 可变参数底层是一个数组，根据传递参数个数不同，会创建不同长度的数组，来存储这些参数
* 传递的参数个数，可以是0个（不传递）12334.。。个
* */
public class Demo01VarArgs {
    public static void main(String[] args) {
        int i =  add(0,2,6);
        System.out.println(i);

    }
//    public static int add(Object...obj){} 可变参数终极写法
    public static int add(int...arr){
/*        System.out.println(arr);
        System.out.println(arr.length);*/
        //定义一个初始化的变量，记录累加求和
        int sum = 0;
        //遍历数组，获取数组中的每一个元素
        for (int i:arr) {
            sum +=i;

        }

        return sum;
    }
}
