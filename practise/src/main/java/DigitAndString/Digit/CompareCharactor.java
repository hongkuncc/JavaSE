package DigitAndString.Digit;

public class CompareCharactor {
    public static void main(String[] args) {
//        是否是同一个对象
        String str1 = "the light";
        String str2 = new String(str1);

        //==用于判断是否是同一个字符串对象
        System.out.println(str1 == str2);

        //特例
        String str3 = "the light";
        System.out.println(str1 == str3);
        String str4 = str1.toUpperCase();

        //内容是否相同
        /*使用equals进行字符串内容的比较，必须大小写一致
        equalsIgnoreCase，忽略大小写判断内容是否一致*/
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str4));

        String start = "the";
        String end = "Ight";

        System.out.println(str1.startsWith(start));
        System.out.println(str1.endsWith(end));

        String[] s = new String[100];


    }

    public static String randomString(int length){
        String pool ="";
        for (short i = 0; i <='9'; i++) {
            pool +=(char)i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool += (char) i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool += (char) i;
        }
        char cs[] = new char[length];

        for (int i = 0; i < cs.length; i++) {
            int index =(int)(Math.random()*pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);
        return result;

    }
}
