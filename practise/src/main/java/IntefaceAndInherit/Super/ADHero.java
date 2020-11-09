package IntefaceAndInherit.Super;

import IntefaceAndInherit.Hide.AD;
import IntefaceAndInherit.Overide.Item;
import IntefaceAndInherit.Overide.LifePotion;

/*
* 实例化子类，父类的构造方法一定会被调用
实例化一个ADHero(), 其构造方法会被调用
其父类的构造方法也会被调用
并且是父类构造方法先调用
子类构造方法会默认调用父类的 无参的构造方法
*
*
* */
public class ADHero extends Hero implements AD {
    int moveSpeed = 400;
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    //使用关键字super 显式调用父类带参的构造方法
/*    public ADHero(String name){
        super(name);
        System.out.println("ADHero的构造方法");
    }


    public static void main(String[] args) {
        new ADHero("德莱文");
    }*/

//通过super调用父类的moveSpeed属性
//ADHero也提供了属性moveSpeed
    public int getMoveSpeed(){
        return this.moveSpeed;

    }
    public int getMoveSpeed2(){
        return this.moveSpeed;
    }

    // 重写useItem，并在其中调用父类的userItem方法
    public void useItem(Item i) {
        System.out.println("adhero use item");
        super.useItem(i);
    }

    public static void main(String[] args) {
        ADHero h = new ADHero();

        System.out.println(h.getMoveSpeed());
        System.out.println(h.getMoveSpeed2());


        LifePotion lp = new LifePotion();
    }

    public ADHero(){
        super("");
    }


}
