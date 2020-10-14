package OperatorString;

import java.util.Scanner;

public class AddAandB {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("第一个值为："+a);
        int b = sc.nextInt();
        System.out.println("第二个值为："+b);
        int sum = a + b;
        System.out.println("两个的和为："+sum);

    }

}
