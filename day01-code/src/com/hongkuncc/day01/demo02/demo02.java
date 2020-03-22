package com.hongkuncc.day01.demo02;

import java.util.Scanner;

public class demo02 {
        public static void main(String[] args) {
            int sum=0;
            for (int i=1;i<=100;i++){

                if (i%2==0){

                    sum +=i;
                }

            }
            System.out.println("总和为："+sum);
            Scanner sc= null;
        }


}
