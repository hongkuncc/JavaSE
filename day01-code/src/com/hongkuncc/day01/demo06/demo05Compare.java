package com.hongkuncc.day01.demo06;

public class demo05Compare {
    public static void main(String[] args) {
        int arrayA[] = {10,22,3,57,4,55};
        /*int max = arrayA[0];
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i]>max){
                max = arrayA[i];
            }

        }
        System.out.println("最大值为:"+max);*/
//        数组元素交换
        for (int min=0,max=arrayA.length-1; min<max ; min++,max--) {
            int temp = arrayA[min];
            arrayA[min]=arrayA[max];
            arrayA[max]=temp;

        }
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("数组遍历："+arrayA[i]);
        }

    }
}
