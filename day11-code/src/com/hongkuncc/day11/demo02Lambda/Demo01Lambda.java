package com.hongkuncc.day11.demo02Lambda;
/*
* 日志案列
*
* */
public class Demo01Lambda {
    public static void showLog(int level,String message){
        //日志级别进行判断
        if (level == 1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";

        showLog(1,msg1+msg2+msg3);
    }


}
