package SortBy;

public class Bubble {
    public static void main(String[] args) {
        int a[] = new int[]{32,54,3,44,76,23};
        //打印顺序
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+"");
        }
        System.out.println("顺序排序");

        for (int i = 0; i <a.length-1 ; i++) {

            for (int j = i+1; j < a.length; j++) {
                if (a[j] >a[i]) {
                    int tmp = a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+"");
        }
        System.out.println("冒泡排序");


        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length-j-1; i++) {
                if(a[i]>a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+"");
        }

    }
}
