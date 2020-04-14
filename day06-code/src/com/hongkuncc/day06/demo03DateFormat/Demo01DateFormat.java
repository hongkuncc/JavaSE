package com.hongkuncc.day06.demo03DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
*java.lang.Object
  继承者 java.text.Format
      继承者 java.text.DateFormat


* Date parse(String source)
          从给定字符串的开始解析文本，以生成一个日期。


java.lang.Object
  继承者 java.text.Format
      继承者 java.text.DateFormat
          继承者 java.text.SimpleDateFormat


          SimpleDateFormat(String pattern)
          用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat。
*
* */
public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
        demo02();
    }

/*
* 使用Dateformate的parse ,把文本解析为日期
*
* */
    private static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2088-08-08 15:51:54");
        System.out.println(date);
    }

    /*
    *
    * 使用Dateformate的format
    * */
    private static void demo01(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String d = sdf.format(date);
        System.out.println(date);
        System.out.println(d);

    }
}
