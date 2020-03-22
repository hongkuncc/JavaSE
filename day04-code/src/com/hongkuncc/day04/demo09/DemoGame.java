package com.hongkuncc.day04.demo09;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("盖伦");

        //设置技能
//        hero.setSkill(new SkillImpl()); 使用单独定义的实现类
       //还可以改成使用匿名内部类
 /*       Skill skill = new Skill(){
            @Override
            public void use() {
                System.out.println("pia~pia~pia");

            }
        };//匿名内部类
        hero.setSkill(skill);*/

        //简化，使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("biu~pia~biu~pia");

            }
        });

        hero.attack();
    }
}
