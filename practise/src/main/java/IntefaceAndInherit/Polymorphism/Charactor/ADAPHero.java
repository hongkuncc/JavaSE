package IntefaceAndInherit.Polymorphism.Charactor;

public class ADAPHero extends Hero implements AD,AP,Mortal {
    @Override
    public void physicAttack() {

    }

    @Override
    public void magicAttack() {

    }

    @Override
    public void die() {
        System.out.println(name+ " 这个混合英雄挂了");

    }
}
