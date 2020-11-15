package Date;
import java.util.Calendar;
import java.util.Date;

public class TestCanlendar {
//    Calendar类即日历类，常用于进行“翻日历”，比如下个月的今天是多久
    public static void main(String[] args) {
    //采用单例模式获取日历对象Calendar.getInstance();
    Calendar c = Calendar.getInstance();

    //通过日历对象得到日期对象
    Date d = c.getTime();

    Date d2 = new Date(0);
    c.setTime(d2);//把这个日历，调成日期 : 1970.1.1 08:00:00

    }
}
