package ClassAndObject.Package.Charactor;

public class ADHero extends Hero {
    public void attack() {
        System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");
    }
    public void attack(Hero... heros){
        for (int i = 0; i < heros.length; i++) {
            System.out.println(name +"攻击了"+heros[i].name);
        }
    }

/*    public void attack(Hero h1) {
        System.out.println(name + "对" + h1.name + "进行了一次攻击 ");
    }

    public void attack(Hero h1, Hero h2) {
        System.out.println(name + "同时对" + h1.name + "和" + h2.name + "进行了攻击 ");
    }*/

    public static void main(String[] args) {
        ADHero vn = new ADHero();
        vn.name = "薇恩";

        Hero h1 = new Hero();
        h1.name = "盖伦";
        Hero h2 = new Hero();
        h2.name = "提莫";

        vn.attack(h1);
        vn.attack(h1, h2);
    }
}
