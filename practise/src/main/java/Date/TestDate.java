package Date;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {

        Date d = new Date();
        long currentTime = System.currentTimeMillis();
        System.out.println("当前时间："+currentTime);

        System.out.println("当前时间是："+d);
        System.out.println("当前时间是："+d.toString());
        System.out.println("当前时间getTime时间是："+d.getTime());//getTime() 得到一个long型的整数
        System.out.println();
        // 从1970年1月1日 早上8点0分0秒 开始经历的毫秒数
        Date d2 = new Date(500);
        System.out.println("从1970年1月1日早上08点0时0分，经历了5秒");
        System.out.println(d2);

        Date zero = new Date(0);
        System.out.println("用0作为构造方法，得到的日期是："+zero);

        System.out.println("当前日期的毫秒"+System.currentTimeMillis());
        System.out.println("本程序共运行了："+(System.currentTimeMillis()-currentTime)+"毫秒");

        System.out.println();


        long second = 1000;
        long minute = 60*second;
        long hour = 60*minute;
        long day = hour*24;
        long year = day*365;
        long yearStart = (1995-1970)*year;
        long leapDay =(1995-1970)/4*day;//每隔4年有一个润日
        yearStart+=leapDay;
        long eightHour = hour*8;////8个小时的毫秒数，因为从0毫秒对应的是1970.1.1 08:00:00
        yearStart -= eightHour;

        Date dStart = new Date(yearStart);
        System.out.println("1995年第一天："+dStart);
        long yearEnd = yearStart +year -1;
        Date dEnd = new Date(yearEnd);
        System.out.println("1995年最后一天："+dEnd);

        long randomTime = (long)(Math.random()*(year-1) + yearStart);
        Date dRandom = new Date(randomTime);
        System.out.println("1995年这一年中的一个随机时间："+dRandom);
    }
}
