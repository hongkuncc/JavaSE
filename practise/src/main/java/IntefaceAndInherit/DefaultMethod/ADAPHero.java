package IntefaceAndInherit.DefaultMethod;

import IntefaceAndInherit.AbstractClass.Hero;

public class ADAPHero extends Hero implements AD,AP,Mortal {
    @Override
    public void attack() {
        System.out.println("这个ADAPHero自己的attack方法");
    }

    @Override
    public void die() {
        System.out.println( " 这个混合英雄挂了");

    }

    @Override
    public void physicAttack() {

    }

    @Override
    public void MagicAttack() {

    }
}
