package IntefaceAndInherit.AbstractClass;

public class MagicPotion extends Item{
    public void effect(){
        System.out.println("使用蓝瓶后，可以回魔法");
    }

    @Override
    public boolean disposable() {
        return true;
    }
}
