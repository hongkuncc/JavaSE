package Loop;

import java.util.Scanner;

public class NFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数");
        int init = sc.nextInt();
        int f =1;
        while (init>1){
            f = f*init;
            init--;
        System.out.println("阶乘为："+f);
        }
    }
}
