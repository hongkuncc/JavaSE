package com.hongkuncc.day01.demo06;

public class demo06directory {
    public static void main(String[] args) {
        int [] array={22,35,56,55,76,8,88};
        System.out.println(array);
        printArray(array);
    }

    public static void printArray(int[] array) {
        System.out.println("++++++++++");
        System.out.println(array);
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);

        }


    }
}
