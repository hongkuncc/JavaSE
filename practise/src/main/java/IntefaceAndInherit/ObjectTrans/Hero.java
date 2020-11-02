package IntefaceAndInherit.ObjectTrans;



public class Hero {
    public String name;
    protected float hp;
/*    首先，明确引用类型与对象类型的概念
    在这个例子里，有一个对象 new ADHero(), 同时也有一个引用ad
    对象是有类型的， 是ADHero
    引用也是有类型的，是ADHero
    通常情况下，引用类型和对象类型是一样的
    接下来要讨论的类型转换的问题，指的是引用类型和对象类型不一致的情况下的转换问题*/
    public static void main(String[] args) {
        Hero h = new Hero();
        ADHero ad = new ADHero();

/*        //类型转换指的是把一个引用所指向的对象的类型，转换为另一个引用的类型

        //把ad引用所指向的对象的类型是ADHero
        //h引用的类型是Hero
        //把ADHero当做Hero使用，一定可以

        h = ad; */

        Support s = new Support();
/*        父类转子类(向下转型)顶折

        h = ad;
        ad =(ADHero)h;
        h =s;
        ad =(ADHero)h;*/

//没有继承关系的两个类，互相转换
        APHero ap = new APHero();
// 没有继承关系的类型进行互相转换一定会失败，所以会出现编译错误
/*        ad = (ADHero) ap;*/

//        实现类转换成接口(向上转型)
/*        AD adi =ad;*/

//        接口转换成实现类(向下转型),失败
/*        ADHero adHero = (ADHero) adi;

        ADAPHero adapHero =(ADAPHero)adi;
        adapHero.magicAttack();*/
/*        Hero h1 = ad;
        Hero h2 = ap;

        //判断引用h1指向的对象，是否是ADHero类型
        System.out.println(h1 instanceof ADHero);

        //判断引用h2指向的对象，是否是APHero类型
        System.out.println(h2 instanceof APHero);

        //判断引用h1指向的对象，是否是Hero的子类型
        System.out.println(h1 instanceof Hero);*/
    }






    }

/*    所谓的转型，是指当引用类型和对象类型不一致的时候，才需要进行类型转换
    类型转换有时候会成功，有时候会失败(参考基本类型的类型转换)*/


