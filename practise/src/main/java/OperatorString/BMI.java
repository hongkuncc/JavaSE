package OperatorString;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体重");
        float weight = sc.nextFloat();
        System.out.println("请输入身高");
        float height = sc.nextFloat();
        float bmi = weight/(height*height);
        System.out.println("您的身材为：");
        if(bmi>=35){
            System.out.println("重度肥胖");
        }else if (bmi >=30&bmi<35 ) {
            System.out.println("中度肥胖");
        }else if (bmi >=27&bmi<30) {
            System.out.println("轻度肥胖");
        }else if (bmi >=24&bmi<27) {
            System.out.println("体重过重");
        } else if (bmi >= 18.5&bmi<24) {
            System.out.println("正常范围");

        }else{
            System.out.println("体重过轻");

        }

    }
}
