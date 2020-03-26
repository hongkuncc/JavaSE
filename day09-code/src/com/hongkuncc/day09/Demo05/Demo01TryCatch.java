package com.hongkuncc.day09.Demo05;

import java.io.FileWriter;
import java.io.IOException;

/*
* 1.7之前
* try{
*
* }
* catch(){
* }finally{
* }
*
*
* */
public class Demo01TryCatch {
    public static void main(String[] args)  {
        //提高变量fw作用域
        FileWriter fw=null ;
        try {
            fw = new FileWriter("w:\\day09-code\\x.txt",true);
            for (int i = 0; i <10 ; i++) {
                fw.write("Hello World!"+i+"\r\n");
            }
        }
        catch(IOException e){
            System.out.println(e);

        }finally {
            //一定会指定的代码
            //创建对象失败了，fw的默认值是null,null不能调调用方法，会抛出异常IOException
            if(fw!=null) {


                try {
                    //fw.close方法抛出异常对象，需要处理，要么throws，要么try catch
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
