package DigitAndString.Digit;

public class TestNumber {
    public static void main(String[] args) {
        /*
        * 所有的基本类型，都有对应的类类型
比如int对应的类是Integer
这种类就叫做封装类
        * */
        int i = 5;
        Integer it = new Integer(i);
        int a = it.intValue();
    }
}
