package IntefaceAndInherit.Overide;

public class Item {
    String name;
    int price;

    public  void buy() {
        System.out.println("购买");
    }
    public void effect(){
        System.out.println("物品使用后，有效果");
    }

    public static void main(String[] args) {
        Item i = new Item();
        i.effect();

        LifePotion lp = new LifePotion();
        lp.effect();

        MagicPotion mp = new MagicPotion();
        mp.effect();
    }
}
