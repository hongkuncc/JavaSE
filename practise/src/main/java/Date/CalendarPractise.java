package Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarPractise {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println("今天是：" + format(c.getTime()));
        //先翻到下下个月
        c.add(Calendar.MONTH,2);
        //设置到月初
        c.add(Calendar.DATE,1);
        //再往回翻3天
        c.add(Calendar.DATE,-3);
        Exception e;
        System.out.println("下个月倒数第三天是："+format(c.getTime()));

    }

    private static String format(Date time){
        return sdf.format(time);
    }
}
