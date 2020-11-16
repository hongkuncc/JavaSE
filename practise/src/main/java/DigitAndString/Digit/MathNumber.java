package DigitAndString.Digit;

public class MathNumber {
    public static void main(String[] args) {
        float f1 = 5.4f;
        float f2 = 5.5f;
        System.out.println(Math.round(f1));
        System.out.println(Math.round(f2));

        System.out.println(Math.random());

        System.out.println((int)(Math.random()*10));

        System.out.println(Math.sqrt(9));
//        次方（2的4次方）
        System.out.println(Math.pow(2,4));
        //Π
        System.out.println(Math.PI);

        //自然常熟
        System.out.println(Math.E);

        int n = Integer.MAX_VALUE;
        System.out.println(Math.pow(1+1/n,n));


        int max = 10000*10000;
        int count = 0;
        for (int i = 1; i <=max ; i++) {
            if (isPrime(i)) {
                count++;

            }
        }
        System.out.println("一千以内的质数共有："+count);


    }

    public static boolean isPrime(int i){
        for (int j = 2; j < Math.sqrt(i); j++) {
            if (0 == i%j)
                return false;
        }
        return true;

    }
}
