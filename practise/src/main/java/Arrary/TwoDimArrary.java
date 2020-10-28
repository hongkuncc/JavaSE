package Arrary;

public class TwoDimArrary {
    public static void main(String[] args) {
        //初始化
        int a[][] = new int [5][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                a[i][j] =(int)(Math.random()*100);
            }
        }

        //打印数组
        for (int []row:a
             ) {
            for (int each:row
                 ) {
                System.out.println(each+"\t");
            }
            System.out.println();

        }

        int max = -1;
        int target_x = -1;
        int target_y = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] >max) {
                    max = a[i][j];
                    target_x = i;
                    target_y = j;

                }
            }
        }
        System.out.println("最大值："+max);
        System.out.println("坐标"+"("+target_x+","+target_y+")");
    }
}
