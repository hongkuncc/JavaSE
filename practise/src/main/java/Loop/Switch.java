package Loop;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("请输入月份：");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        switch(year){
            case 1: case 2: case 3:
                System.out.println("你输入的春天");
                break;
            case 4: case 5: case 6:
                System.out.println("你输入的夏天");
                break;
            case 7: case 8: case 9:
                System.out.println("你输入的秋天");
                break;
            case 10: case 11: case 12:
                System.out.println("你输入的冬天");
                break;
            default:
                System.out.println("输入错误，请重新输入！");

        }

    }
}
