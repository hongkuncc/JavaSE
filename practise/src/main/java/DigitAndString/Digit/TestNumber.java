package DigitAndString.Digit;

public class TestNumber {
    public static void main(String[] args) {
        /*
        * 所有的基本类型，都有对应的类类型
比如int对应的类是Integer
这种类就叫做封装类
        * */
        int i = 5;

        //把一个基本类型的变量,转换为Integer对象
        Integer it = new Integer(i);//基本类型转换成封装类型
        //自动转换就叫装箱
        Integer it2 =i;
        //把一个Integer对象，转换为一个基本类型的int
        int a = it.intValue();//封装类型转换成基本类型

        //自动转换就叫拆箱
        int i3 = it;

        /*
        * 数字封装类有Byte,Short,Integer,Long,Float,Double
          这些类都是抽象类Number的子类
        * */

        //Integer是Number的子类，所以打印true
        System.out.println(it instanceof Number);

        //int的最大值
        System.out.println(Integer.MAX_VALUE);
        //int的最小值
        System.out.println(Integer.MIN_VALUE);

    }
}
