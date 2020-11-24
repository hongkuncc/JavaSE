package DigitAndString.Digit;


public class StringBufferTesting {

    public static void main(String[] args) {
        String str1 = "let there";
        StringBuffer sb = new StringBuffer(str1);
        sb.append("be light");

        System.out.println(sb);
        sb.delete(4,10);

        System.out.println(sb);

        sb.insert(4,"there ");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);


        System.out.println(sb.length());//内容长度
        System.out.println(sb.capacity());//总空间

        int total = 10000;
        String s = randomString(10);
        StringBuffer ss = new StringBuffer();

        String str2 = "";
        long start = System.currentTimeMillis();

        for (int i = 0; i < total; i++) {
            str2 += s;
        }
        long end = System.currentTimeMillis();
        System.out.printf("使用字符串连接+的方式，连接%d次，耗时%d毫秒%n",total,end-start);
        total *= 100;
        start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            ss.append(s);
        }
        end = System.currentTimeMillis();
        System.out.printf("使用字符串连接+的方式，连接%d次，耗时%d毫秒%n",total,end-start);

    }
    private static String randomString(int length){
        String pool = "";
        for (int i = '0'; i <'9' ; i++) {
            pool += (char)i;
        }
        for (int i = 'a'; i <'z' ; i++) {
            pool += (char)i;
        }
        for (int i = 'A'; i < 'Z'; i++) {
            pool += (char)i;
        }
        char cs[] = new char[length];
        for (int i = 0; i <cs.length ; i++) {
            int index = (int)(Math.random()*pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);
        return result;
    }
}
