package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionOperation {
    public static void main(String[] args) {
        File f =new File("d:/LOL.exe");
        try{
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
            SimpleDateFormat sdf =new SimpleDateFormat("yyy-MM-dd");
            Date d = sdf.parse("2020-12-03");
        }
        catch (FileNotFoundException e){
            System.out.println("d:/LOL.exe不存在");
            e.printStackTrace();
        }catch (ParseException e){
            System.out.println("日期格式解析错误");
            e.printStackTrace();
        }
        /*catch (FileNotFoundException | ParseException e) {
            if (e instanceof FileNotFoundException)
                System.out.println("d:/LOL.exe不存在");
            if (e instanceof ParseException)
                System.out.println("日期格式解析错误");

            e.printStackTrace();
        }*/
        finally{
            System.out.println("无论是否存在都会执行");
        }

    }
}
