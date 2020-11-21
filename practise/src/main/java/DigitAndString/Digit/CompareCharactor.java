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


        /*创建一个长度是100的字符串数组
        使用长度是2的随机字符填充该字符串数组
        统计这个字符串数组里重复的字符串有多少种*/

        String[] s = new String[100];
        //初始化
        for (int i = 0; i < s.length; i++) {
            s[i] = randomString(2);
        }
        //打印
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i] + " ");
            if (19 == i % 20) {
                System.out.println();
            }
        }
        for (String s1 : s
                ) {
            int repeat = 0;
            for (String s2 : s
                    ) {
                if (s1.equalsIgnoreCase(s2)) {
                    repeat++;
                    if (2 == repeat) {
                        // 当repeat==2的时候，就找打了一个非己的重复字符串
                        putIntoDuplicatedArray(s1);
                        break;
                    }
                }
            }
        }

    }
        static String[] foundDuplicated = new String[100];
        static int pos;

        private static void putIntoDuplicatedArray (String s){
            for (int i = 0; i < pos; i++) {
                if (foundDuplicated[i].equalsIgnoreCase(s))
                    return;
            }
            foundDuplicated[pos++] = s;
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
