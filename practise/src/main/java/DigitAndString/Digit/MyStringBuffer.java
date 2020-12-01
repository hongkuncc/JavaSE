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
/*    public MyStringBuffer(String str) {
        if (null != str)
            value = str.toCharArray();

        length = value.length;
        if (capacity < value.length)
            capacity = value.length * 2;
    }*/

    //有参构造方法
    public MyStringBuffer(String str) {
        this();
        if (null == str)
            return;

        if (capacity < str.length()) {
            capacity = value.length * 2;
            value = new char[capacity];
        }
        if (capacity >= str.length())
            System.arraycopy(str.toCharArray(),0,value,0,str.length());
        length = str.length();
    }


    @Override
    public void append(String str) {
        insert(length,str);

    }

    @Override
    public void append(char c) {
        append(String.valueOf(c));

    }

    @Override
    public void insert(int pos, char b) {
        insert(pos,String.valueOf(b));

    }

    @Override
    public void insert(int pos, String b) {
        //边界条件判断
        if (pos < 0)
            return;
        if (pos > length)
            return;
        if (null == b)
            return;

        //扩容
        while(length+b.length()>capacity){
            capacity = (int)((length+b.length())*1.5f);
            char[] newValue = new char[capacity];
            System.arraycopy(value,0,newValue,0,length);
            value = newValue;
        }

        char[] cs = b.toCharArray();

        //先把已经存在的数据往后移

        System.arraycopy(value, pos, value,pos+ cs.length, length-pos);
        //把要插入的数据插入到指定位置
        System.arraycopy(cs, 0, value, pos, cs.length);

        length = length+cs.length;

    }

    @Override
    public void delete(int start) {

    }

    @Override
    public void delete(int start, int end) {

    }

    @Override
    public void reverse() {
        for (int i = 0; i <length/2 ; i++) {
            char temp = value[i];
            value[i] = value[length - i - 1];
            value[length -i - 1] =temp;
        }

    }

    @Override
    public int length() {
        return length;
    }
    public String toString(){
        char[] realValue = new char[length];
        System.arraycopy(value,0,realValue,0,length);
        return new String(realValue);
    }

    public static void main(String[] args) {
        MyStringBuffer sb = new MyStringBuffer("there light");
        System.out.println(sb);
        sb.insert(0,"let ");
        System.out.println(sb);

        sb.insert(10,"be ");
        System.out.println(sb);
        sb.insert(0,"God Say ");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.append('?');
        sb.reverse();
        System.out.println(sb);
    }
}
