package com.hongkuncc.day03.demo03;

import java.util.ArrayList;

public class demo01RedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",200);
        Member one =new Member("成员A",0);
        Member two =new Member("成员B",0);
        Member three =new Member("成员C",0 );

        manager.show();
        one.show();
        two.show();
        three.show();

        System.out.println("============");
        ArrayList<Integer> redList =  manager.send(36,5);

        one.recove(redList);
        two.recove(redList);
        three.recove(redList);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("========");
    }
}
