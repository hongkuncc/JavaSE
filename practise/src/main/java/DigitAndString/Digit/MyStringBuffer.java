package DigitAndString.Digit;

public class MyStringBuffer implements IStringBuffer{

/*    value：用于存放字符数组
    capacity： 容量
    无参构造方法： 根据容量初始化value*/

    int capacity = 16;
    int length = 0;
    char[] value;
    public MyStringBuffer(){
        value = new char[capacity];
    }

    //有参构造方法
    public MyStringBuffer(String str) {
        if (null != str)
            value = str.toCharArray();

        length = value.length;
        if (capacity < value.length)
            capacity = value.length * 2;
    }

    @Override
    public void append(String str) {

    }

    @Override
    public void append(char c) {

    }

    @Override
    public void insert(int pos, char b) {

    }

    @Override
    public void insert(int pos, String b) {

    }

    @Override
    public void delete(int start) {

    }

    @Override
    public void delete(int start, int end) {

    }

    @Override
    public void reverse() {

    }

    @Override
    public int length() {
        return 0;
    }
}
