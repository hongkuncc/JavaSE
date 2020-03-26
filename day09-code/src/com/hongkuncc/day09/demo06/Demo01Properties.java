package com.hongkuncc.day09.demo06;

import java.util.Properties;
import java.util.Set;

/*
* Properties继承Hashtable
* Properties表示一个持久的属性集，Properties可保存在流中或从流中加载
* Properties集合石一个唯一和IO流相结合的集合
*       可以使用其中的store方法，把集合中的临时数据，持久化写入到硬盘中
*       可以使用其中的load方法，把硬盘中保存的文件（键值对），读取到集合中使用
*属性列表中每个键值对是一个字符串
*Properties集合是一个双列集合，key和value默认都是字符串
*
*
* */
public class Demo01Properties {
    public static void main(String[] args) {
        show02();

    }


    /*
    *Properties集合store方法
    *
    *
    * */
    public static void show02(){

    }
    /*
    * 使用Properties集合存储数据，遍历取出数据
    *
    *
    * */

    public static void show01(){
        Properties pro = new Properties();
        //setProperty往集合中添加数据
        pro.setProperty("h1","23");
        pro.setProperty("h2","22");
        pro.setProperty("h3","24");
        pro.setProperty("h4","26");
        pro.setProperty("h5","28");
        //stringPropertyNames把集合中的键取出存储到一个set中
        Set<String> set = pro.stringPropertyNames();
        //增强for循环
        for (String key:set) {
           String value = pro.getProperty(key);
            System.out.println(value);

        }
    }


}
