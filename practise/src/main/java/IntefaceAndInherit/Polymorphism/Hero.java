package IntefaceAndInherit.Polymorphism;

import IntefaceAndInherit.Overide.Item;
import IntefaceAndInherit.Overide.LifePotion;
import IntefaceAndInherit.Overide.MagicPotion;

public class Hero {
    public String name;
    protected float hp;

    public void useItem(Item i){
        i.effect();
    }

    public static void main(String[] args) {

        Hero garen =  new Hero();
        garen.name = "盖伦";

        LifePotion lp =new LifePotion();
        MagicPotion mp =new MagicPotion();

        garen.useItem(lp);
        garen.useItem(mp);

    }
}
