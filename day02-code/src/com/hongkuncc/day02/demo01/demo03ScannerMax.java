package com.hongkuncc.day02.demo01;

import java.util.Scanner;

public class demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sc1=sc.nextInt();
        int sc2=sc.nextInt();
        int sc3=sc.nextInt();

        /*if (sc1>sc2){
            if (sc1>sc3){
                return max;
            }
            else{

            }
        }*/
        int temp = sc1>sc2?sc1:sc2;
        int max = temp>sc3?temp:sc3;
        System.out.println("最大值为："+max);
    }
}
