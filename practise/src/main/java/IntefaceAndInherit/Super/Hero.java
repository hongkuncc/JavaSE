package IntefaceAndInherit.Super;

import IntefaceAndInherit.Overide.Item;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;


    /*
    *
    * 父类Hero提供了一个有参的构造方法:
    *
    *
*/
    public Hero(String name){
        this.name = name;
    }
    /*
    * 但是没有提供无参的构造方法，子类应该怎么处理？
    * 作为子类，无论如何 都会调用父类的构造方法。
默认情况下，会调用父类的无参的构造方法。
但是，当父类没有无参构造方法的时候( 提供了有参构造方法，并且不显示提供无参构造方法)，子类就会抛出异常，因为它尝试去调用父类的无参构造方法。
这个时候，必须通过super去调用父类声明的、存在的、有参的构造方法
    * */



    public void useItem(Item i) {
        System.out.println("hero use item");
        i.effect();
    }
/*    public Hero(){
        System.out.println("Hero的构造方法");
    }
    public Hero(String name){
        System.out.println("Hero的有一个参数的构造方法");
        this.name = name;
    }*/

    public static void main(String[] args) {
//        new Hero();
    }
}
