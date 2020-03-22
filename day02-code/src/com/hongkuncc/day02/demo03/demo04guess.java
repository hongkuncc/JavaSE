package com.hongkuncc.day02.demo03;

import java.util.Random;
import java.util.Scanner;

public class demo04guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int num = r.nextInt(100)+1;

        while (true){
            System.out.println("你输入的数字：");
            int guess=sc.nextInt();
            if (guess>num){
                System.out.println("太大了");
            }
            else if(guess<num){
                System.out.println("太小了");
            }
            else{
                System.out.println("猜对了！");
                break;
            }
        }
        System.out.println("游戏结束！");
    }
}
