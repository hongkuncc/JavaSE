package com.hongkuncc.day05.demo02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static com.hongkuncc.day05.demo01.Demo01Map.show01;

public class DemoHashMapSavaPerson {
    public static void main(String[] args) {
        show02();
    }

    /*
     * hashMap存储自定义类型键值
     * key:Person类型
     *     Person类必须重写hashCode方法和equals方法，以保证key唯一
     *value：String
     *      可以重复
     * */

    public static void show02(){
        HashMap<Person,String> map = new HashMap<>();
        map.put(new Person("张三",20),"北京");
        map.put(new Person("李四",21),"上海");
        map.put(new Person("王五",22),"广州");
        map.put(new Person("张三",20),"深圳");
        //使用keySet加强for遍历Map集合
        Set<Map.Entry<Person,String>> set = map.entrySet();
        for(Map.Entry<Person,String> entry:set){
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }
    /*
    * hashMap存储自定义类型键值
    * key:String类型
    *     String类重写hashCode方法和equals方法，可以保证key唯一
    *value：Person类型
    *      可以重复
    * */
    private static void show01(){
        HashMap<String,Person> map = new HashMap<>();
        map.put("北京",new Person("张三",20));
        map.put("上海",new Person("李四",21));
        map.put("广州",new Person("王五",22));
        map.put("深圳",new Person("赵六",23));
        //使用keySet加强for遍历Map集合
        Set<String> set = map.keySet();
        for(String key:set){
            Person value = new Person();
            System.out.println(key+"="+value);
        }
    }
}
