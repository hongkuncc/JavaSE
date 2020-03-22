package com.hongkuncc.day04.demo08;

public class DemoMain {
    public static void main(String[] args) {
        //创建角色
        Hero hero = new Hero();
        hero.setName("艾希");
        hero.setAge(18);

        Weapon weapon = new Weapon("多兰剑");
        hero.setWeapon(weapon);
        hero.attack();
    }
}
