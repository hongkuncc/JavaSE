package IntefaceAndInherit.ObjectTrans;

import IntefaceAndInherit.Interface.Healer;
import IntefaceAndInherit.Interface.Hero;

public class Support extends Hero implements Healer {
    @Override
    public void heal() {
        System.out.println("实现治疗");
    }
}
