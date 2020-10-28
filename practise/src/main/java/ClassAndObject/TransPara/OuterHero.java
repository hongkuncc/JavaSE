package ClassAndObject.TransPara;

public class OuterHero {
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public OuterHero(){

    }

    public OuterHero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }

    //复活
    public void revive(OuterHero h){
        h = new OuterHero("提莫",383);
    }

    public static void main(String[] args) {
        OuterHero teemo = new OuterHero("提莫",383);
        teemo.hp = teemo.hp -400;

        teemo.revive(teemo);

        System.out.println(teemo.hp);
    }
}
/*        在第31行，调用revive的时候，引用h指向 引用teemo所指向的对象 "提莫"
        但是teemo引用，还是指向原来的对象
        在第22行，引用h指向了新的对象 "新的提莫"*/
