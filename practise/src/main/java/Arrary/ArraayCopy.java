package Arrary;

public class ArraayCopy {
    public static void main(String[] args) {
        int a[] = new int[]{34,22,55,44,66,33,29};
        int b[] = new int[3];
        //把a数组的前三位赋值到b数组
        //1、for循环
        for (int i = 0; i <b.length ; i++) {
            b[i]=a[i];
            System.out.println(b[i]+' ');
//            System.out.println(b[i]+' ');
        }
        //2、System.arraycopy(src,srcPOS,dest,destPos,length)
        System.arraycopy(a,0,b,0,3);

        //把内容打印出来
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }


}
