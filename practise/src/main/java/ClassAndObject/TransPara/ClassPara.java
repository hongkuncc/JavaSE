package ClassAndObject.TransPara;

public class ClassPara {
    String name; // 姓名

    float hp; // 血量

    float armor; // 护甲

    int moveSpeed; // 移动速度

    public ClassPara(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }
    //攻击一个英雄，并让他掉血
    public void attack(ClassPara hero,float damage){
        hero.hp = hero.hp - damage;
    }

    public static void main(String[] args) {
        ClassPara garen = new ClassPara("盖伦",3000);

        ClassPara teemo = new ClassPara("提莫",2000);
        garen.attack(teemo,200);
        System.out.println(teemo.hp);

    }

}
