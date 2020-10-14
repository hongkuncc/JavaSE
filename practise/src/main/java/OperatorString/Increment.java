package OperatorString;

public class Increment {
    public static void main(String[] args) {
        int i = 1;
        int j = ++i + i++ + ++i +i++;
        System.out.println(j);
    }
}
