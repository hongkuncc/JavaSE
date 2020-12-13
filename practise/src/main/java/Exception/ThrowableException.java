package Exception;

import java.io.File;
import java.io.FileInputStream;

public class ThrowableException {
    public static void main(String[] args) {
        try {
            method();
        }catch (Throwable e){
            e.printStackTrace();
        }
    }
    public static void method() throws Throwable{
        File f = new File("d:/LOL.exe");
        new FileInputStream(f);
    }

}
