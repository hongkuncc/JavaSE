package com.hongkuncc.day01.demo05;

public class overloadPrint {
    public static void main(String[] args) {
        myPrint('A');
        myPrint(4);
    }

    public static void myPrint(int num) {
        System.out.println(num);
    }
    public static void myPrint(short num) {
        System.out.println(num);
    }
    public static void myPrint(byte num) {
        System.out.println(num);
    }
    public static void myPrint(long num) {
        System.out.println(num);
    }
    public static void myPrint(float num) {
        System.out.println(num);
    }
    public static void myPrint(double num) {
        System.out.println(num);
    }
    public static void myPrint(boolean num) {
        System.out.println(num);
    }
    public static void myPrint(char num) {
        System.out.println(num);
    }


}
