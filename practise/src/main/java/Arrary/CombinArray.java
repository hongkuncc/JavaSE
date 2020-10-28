package Arrary;

public class CombinArray {
    public static void main(String[] args) {
        int a[] = new int[(int)(Math.random()*5)+5];
        for (int i = 0; i <a.length ; i++) {
            a[i] =(int)(Math.random()*100);
        }
        int b[] = new int[(int)(Math.random()*5)+5];
        for (int i = 0; i <b.length ; i++) {
            b[i] =(int)(Math.random()*100);
        }
        System.out.println("数组a的内容:");
        for (int i:a
             ) {
            System.out.println(i+"");
        }
        System.out.println("数组b的内容:");
        for (int j:b
             ) {
            System.out.println(j+"");
        }

        int c[] =new int[a.length+b.length];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        System.out.println("数组c的内容:");
        for (int k:c
             ) {
            System.out.println(c+" ");
        }

    }
}
