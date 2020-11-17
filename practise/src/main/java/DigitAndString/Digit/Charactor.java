package DigitAndString.Digit;

import java.util.Scanner;

public class Charactor {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '1';
        char c3 = '中';
//        char c4 = 'ab'; 只能放一个字符
        Character c = c1;//自动装箱
        c1 = c;//自动拆箱

        //常见方法
        System.out.println(Character.isLetter('a'));//判断是否为字母
        System.out.println(Character.isDigit('a'));//判断是否为数字
        System.out.println(Character.isWhitespace(' '));//判断是否空白
        System.out.println(Character.isUpperCase('a'));//判断是大写
        System.out.println(Character.isLowerCase('A'));//判断是小写

        System.out.println(Character.toLowerCase('A'));//转换为小写
        System.out.println(Character.toUpperCase('a'));//转换为大写

//        String a = 'a';不能直接把一个字符转为字符串
        String a2 = Character.toString('a');//转换为字符

        //转义字符
        System.out.println("使用空格无法达到对齐的效果");
        System.out.println("abc def");
        System.out.println("ab def");
        System.out.println("a def");

        System.out.println("使用\\\\t制表符可以达到对齐的效果");
        System.out.println("abc\tdef");
        System.out.println("ab\tdef");
        System.out.println("a\tdef");

        System.out.println("一个\\t制表符长度是8");
        System.out.println("12345678def");

        System.out.println("换行符 \\n");
        System.out.println("abc\ndef");

        System.out.println("单引号 \\'n");
        System.out.println("abc\'def");
        System.out.println("双引号 \\\"");
        System.out.println("abc\"def");
        System.out.println("反斜杠本身 \\");
        System.out.println("abc\\def");

/*        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] cs = str.toCharArray();

        for (int i = 0; i < cs.length; i++) {
            char d =cs[i];
            if (Character.isUpperCase(d) || Character.isDigit(d)) {
                System.out.print(d);
            }
        }*/

        String garen ="盖伦"; //字面值,虚拟机碰到字面值就会创建一个字符串对象

        String teemo = new String("提莫"); //创建了两个字符串对象

        char[] ccs = new char[]{'崔','斯','特'};

        String hero = new String(ccs);//  通过字符数组创建一个字符串对象

        String hero3 = garen + teemo;//  通过+加号进行字符串拼接

        System.out.println(hero);
        System.out.println(hero3);

//        String 被修饰为final,所以是不能被继承的

        /*
        *
        * 创建一个长度是5的随机字符串，随机字符有可能是数字，大写字母或者小写字母

给点提示: 数字和字符之间可以通过互相转换
        * */

        char rand[] = new char[5];
        short start = '0';
        short end ='z'+1;
        for (int i = 0; i < rand.length; i++) {
            while(true){
                char e = (char)((Math.random()*(end-start))+start);
                if (Character.isLetter(c)||Character.isDigit(c)){
                    rand[i] = e;
                    break;
                }
            }
        }
        String result = new String(rand);
        System.out.println(result);

    }
}
