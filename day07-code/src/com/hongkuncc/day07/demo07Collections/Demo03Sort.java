package com.hongkuncc.day07.demo07Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
*
*
static <T> void sort(List<T> list, Comparator<? super T> c)
 根据指定比较器产生的顺序对指定列表进行排序。

*
* */
public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //往集合中添加多个元素
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(9);
        list.add(4);
        System.out.println(list);

        Collections.sort(list, new Comparator<Integer>() {
            //重写比较规则
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;//升序
            }
        });
        System.out.println(list);

        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("hhe",23));
        list02.add(new Student("hie",21));
        list02.add(new Student("er",20));
        list02.add(new Student("hu",25));
        list02.add(new Student("bhe",21));

      /*  System.out.println(list02);
        Collections.sort(list02, new Comparator<Student>() {
            //按年龄升序
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(list02);*/

        System.out.println(list02);
        Collections.sort(list02, new Comparator<Student>() {
            //按年龄升序
            @Override
            public int compare(Student o1, Student o2) {
               int result=o1.getAge()-o2.getAge();
            if(result==0){
                return o1.getName().charAt(0)-o2.getName().charAt(0);
            }
            return result;
            }
        });
        System.out.println(list02);
    }

}
