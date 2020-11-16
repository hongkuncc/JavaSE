package DigitAndString.Digit;


import java.util.Locale;

/*
* %s 表示字符串
%d 表示数字
%n 表示换行
* */
public class DigitFormat {
    public static void main(String[] args) {
        String name ="盖伦";
        int kill = 8;
        String title="超神";

        //使用格式化输出
        String sentenceFormat ="%s 在进行了连续 %d 次击杀后，获得了 %s 的称号%n";

        System.out.printf(sentenceFormat,name,kill,title);
//        printf和format能够达到一模一样的效果，在printf中直接调用了format
        System.out.format(sentenceFormat,name,kill,title);

        System.out.printf("这是换行符%n");

        int year = 2020;
        //总长度，左对齐，补0，千位分隔符，小数点位数，本地化表达

        //直接打印数字
        System.out.printf("%d%n",year);
        //总长度8，默认右对齐
        System.out.printf("%8d%n",year);
        //总长度8，左对齐
        System.out.printf("%-8d%n",year);
        //总长度8，不够补0
        System.out.printf("%08d%n",year);
        //千分位分隔符
        System.out.printf("%,8d%n",year*1000);

        //小数点位
        System.out.printf("%.2f%n",Math.PI);

        //不同国家的千位分隔符
        System.out.printf(Locale.FRANCE,"%,.2f%n",Math.PI*10000);
        System.out.printf(Locale.US,"%,.2f%n",Math.PI*10000);
        System.out.printf(Locale.UK,"%,.2f%n",Math.PI*10000);
        System.out.printf(Locale.CHINA,"%,.2f%n",Math.PI*10000);
    }
}
