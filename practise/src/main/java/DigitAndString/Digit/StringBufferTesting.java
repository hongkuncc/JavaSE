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
        long currentDate = System.currentTimeMillis();

    }
    private static String randomString(int length){
        String pool ="";
        for (int i = '0'; i <'9' ; i++) {
            pool +=(char)i;
        }
        for (int i = 'a'; i <'z' ; i++) {
            pool +=(char)i;
        }
        for (int i = 'A'; i < 'Z'; i++) {
            pool +=(char)i;
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
