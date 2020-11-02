package IntefaceAndInherit.ObjectTrans;

import IntefaceAndInherit.Interface.AD;
import IntefaceAndInherit.Interface.Hero;

public class ADHero extends Hero implements AD {
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
}
