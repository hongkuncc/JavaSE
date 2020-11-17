package DigitAndString.Digit;
/*创建一个长度是8的字符串数组 使用8个长度是5的随机字符串初始化这个数组 对这个数组进行排序，按照每个字符串的首字母排序(无视大小写)*/

import java.util.Arrays;

/*

排序的时候，借助冒泡法的思路
比较逻辑是每个字符串的第一个字符，并且都转换为小写，从而达到无视大小写的效果
*/
public class CharacterSort {
    public static void main(String[] args) {
        String[] ss = new String[8];
        for (int i = 0; i <ss.length ; i++) {
            String randomString =randomString(5);
            ss[i] = randomString;
        }
        System.out.println("未排序前的字符串数组");
        System.out.println(Arrays.toString(ss));
        for (int j = 0; j < ss.length; j++) {
            for (int i = 0; i <ss.length-j-1 ; i++) {
                char firstChar1 = ss[i].charAt(0);
                char firstChar2 = ss[i+1].charAt(0);
                firstChar1 = Character.toLowerCase(firstChar1);
                firstChar2 = Character.toLowerCase(firstChar2);
                if (firstChar1> firstChar2 ) {
                    String temp =ss[i];
                    ss[i] = ss[i+1];
                    ss[i+1] =temp;
                }
            }
        }


        System.out.println("排序后的字符串数组");
        System.out.println(Arrays.toString(ss));
    }

    public static String randomString(int length){
        String pool =" ";
        for (int i = 0; i <= '9'; i++) {
            pool+=(char)i;
        }
        for (int i = 'a'; i <= 'z'; i++) {
            pool+=(char)i;
        }
        for (int i = 'A'; i <= 'Z' ; i++) {
            pool+=(char)i;
        }
        char cs[] = new char[length];
        for (int i = 0; i <cs.length ; i++) {
            int index =(int)(Math.random()*pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);
        return result;

    }
}
