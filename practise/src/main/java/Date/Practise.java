package Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practise {
    public static void main(String[] args) {
        int yearStart = 1970;
        int yearEnd = 2000;
        Date[] ds = new Date[9];
        for (int i = 0; i <ds.length ; i++) {
            ds[i] = getRandomDate(yearStart,yearEnd);
        }
        System.out.println("得到的随机数组：");
        for (int i = 0; i < ds.length; i++) {
            System.out.println(toString(ds[i])+"\t");
            if (2 ==i%3)
                System.out.println();
        }

        //选择法排序
        for (int j = 0; j < ds.length; j++) {
            for (int i = 0; i < ds.length; i++) {
                String strTimeI = toString(ds[i],"HHmmss");
                String strTimeJ = toString(ds[j],"HHmmss");

                int lTimeI = Integer.parseInt(strTimeI);
                int lTimeJ = Integer.parseInt(strTimeJ);

                if (lTimeI < lTimeJ) {
                    Date temp = ds[j];
                    ds[j] = ds[i];
                    ds[i] = temp;
                }
            }

        }
        System.out.println("排序后的随机日期数组：");
        for (int i = 0; i < ds.length; i++) {
            System.out.println(toString(ds[i])+"\t");
            if (2 == i%3) {
                System.out.println();
            }
        }

    }
    public static String toString(Date d){
        return toString(d,"yyyy-MM-dd HH:mm:ss");
    }
    public static String toString(Date d,String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(d);
    }
    private static Date getRandomDate(int yearStart, int yearEnd){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        try {
            Date dStart = sdf.parse(String.valueOf(yearStart));
            Date dEnd = sdf.parse(String.valueOf(yearEnd));
            long timeStart = dStart.getTime();
            long timeEnd = dEnd.getTime() - 1;
            long timeRandom = (long) (timeStart + Math.random() * (timeEnd - timeStart));
            return new Date(timeRandom);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
