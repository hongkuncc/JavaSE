package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* format,日期转字符串
* parse,字符串转日期
*
* */

public class DateFormat {
    public static void main(String[] args) {
        //y 代表年
        //M 代表月
        //d 代表日
        //H 代表24进制的小时
        //h 代表12进制的小时
        //m 代表分钟
        //s 代表秒
        //S 代表毫秒
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d = new Date();
        String str = sdf.format(d);
        System.out.println("当前时间通过默认格式后输出：" + str);

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String str1 = sdf1.format(d);
        System.out.println("当前时间通过 yyyy-MM-dd hh:mm:ss SSS 格式后输出：" + str1);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        String str2 = sdf2.format(d);
        System.out.println("当前时间通过 yyyy-MM-dd 格式后输出：" + str2);


        String str3 = "2020-11-15";
        try {
            Date d2 = sdf2.parse(str3);
//            System.out.println("字符串 %s 通过格式  yyyy-MM-dd HH:mm:ss 转换为日期对象: %s",str3,d2.toString());
            System.out.println(d2);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
