package ClassAndObject.THIS;

public class ThisMethodHero {
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    //带一个参数的构造方法
    public ThisMethodHero(String name){
        System.out.println("一个参数的构造方法");
            this.name = name;
        }
    //带两个参数的构造方法
    public ThisMethodHero(String name,float herohp){
//        this.name =name;
        this(name);
        System.out.println("两个参数的构造方法");
        this.hp =herohp;
    }

    public static void main(String[] args) {
        ThisMethodHero h = new ThisMethodHero("提莫",300);
        System.out.println(h.name+"的血量是"+h.hp);


    }
}
