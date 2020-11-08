package IntefaceAndInherit.Hide;

public class Hero {
    public String name;
    protected float hp;

    //类方法，静态方法
    //通过类就可以直接调用
    public static void battleWin(){
        System.out.println("hero battle win");
    }

    public static void main(String[] args) {
        //虽然h指向的是一个子类对象，但是依然调用的是父类的类方法。
        //甚至在h指向一个空对象null的时候，也能够成功调用battleWin().
        Hero h =new ADHero();
        h.battleWin();
        h =null;
        h.battleWin();
    }
}
