package com.hongkuncc.day03.demo03;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    public void recove(ArrayList<Integer> list){
        //从当前红包中随便抽取一个，随机获得一个索引编号
        int index = new Random().nextInt(list.size());
        //根据索引，从集合中删除，并且得到被删除的红包，给我自己
        int delta =list.remove(index);
        //当前长远自己本来有多少钱

        int money = super.getMoney();

        super.setMoney(money+delta);
    }
}
