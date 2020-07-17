import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("请输入月份");
        int month = s.nextInt();
        String season;
        switch (month){
            case 1:
            case 2:
            case 3:
                season = "春天";
                break;
            case 4:
            case 5:
            case 6:
                season = "夏天";
                break;
            case 7:
            case 8:
            case 9:
                season = "秋天";
                break;
            case 10:
            case 11:
            case 12:
                season = "冬天";
                break;
            default:
                season="error";
        }
        System.out.println(season);

        int i =0;
        while(i<5){
            System.out.println(i);
            i++;
        }
        do{
            System.out.println(i);
            i++;
        } while(i<5);

        Scanner s1= new Scanner(System.in);

        int n = s1.nextInt();
        int fac = 1;
        while (n>=1){
            fac *= n;
            n--;
        }
        System.out.println("阶乘是："+fac);

        //使用for打印0到4
        for (int j = 0; j < 5; j++) {
            System.out.println("for  循环输出的"+j);
        }

        int moneyEachDay = 0;
        int day = 10;
        int sum=0;
        for (int k = 1; k <= day; k++) {
            if(0==moneyEachDay)
                moneyEachDay = 1;
            else
                moneyEachDay *= 2;

            sum+=moneyEachDay;

            System.out.println(k + " 天之后，洪帮主手中的钱总数是: " + sum );
        }

        //声明一个引用
        int[] a;
        //创建一个长度是5的数组，并且使用引用a指向该数组
        a = new int[5];

        int[] b = new int[5]; //声明的同时，指向一个数组

        int[] c;
        c = new int[5];

        System.out.println(c.length); //打印数组的长度

        c[4]=100; //下标4，实质上是“第5个”，即最后一个
        c[5]=101; //下标5，实质上是“第6个”，超出范围 ,产生数组下标越界异常

        int[] d = new int[5];
        d[0] = (int) (Math.random() * 100);
        d[1] = (int) (Math.random() * 100);
        d[2] = (int) (Math.random() * 100);
        d[3] = (int) (Math.random() * 100);
        d[4] = (int) (Math.random() * 100);

        System.out.println("数组中的各个随机数是:");
        for (int l = 0; l < d.length; l++)
            System.out.println(a[l]);

        System.out.println("本练习的目的是，找出最小的一个值: ");

        /*思路二： 进行首尾调换*/
        for (int ii = 0; ii < a.length/2; ii++) {
            int middle = a[a.length-ii-1];
            a[a.length-ii-1] = a[ii];
            a[ii] = middle;
        }
        System.out.println("再次反转后的数组中各个值是:");
        for (int kk = 0; kk < a.length; kk++) {
            System.out.print(a[kk] + " ");
        }
        System.out.println("首尾调换");

    }
}
