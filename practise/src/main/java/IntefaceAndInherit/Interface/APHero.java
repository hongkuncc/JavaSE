package IntefaceAndInherit.Interface;

public class APHero extends Hero implements AP {
    @Override
    public void MagicAttack() {
        System.out.println("进行魔法攻击");
    }
}
