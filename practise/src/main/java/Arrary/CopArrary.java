package Arrary;

import java.util.Arrays;

public class CopArrary {
    public static void main(String[] args) {
        int a[][] = new int [4][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[i].length ; j++) {
               a[i][j] =(int)(Math.random()*100);
            }
        }
        System.out.println("打印二维数组：");
        for (int[] i:a
             ) {
            System.out.println(Arrays.toString(i));
        }
        //复制二维数组到一维数组
        int b[] = new int[a.length*a[0].length];
        for (int i = 0; i < a.length; i++) {
            System.arraycopy(a[i],0,b,i*a[i].length,a[i].length);
        }
        //排序
        Arrays.sort(b);
        //对一维数组复合到二维数组
        for (int i = 0; i <a.length ; i++) {
            System.arraycopy(b,a[i].length*i,a[i],0,a[i].length);
        }
        System.out.println("打印排序后的二维数组:");
        for (int[] i:a
             ) {
            System.out.println(Arrays.toString(i));
        }
    }
}
