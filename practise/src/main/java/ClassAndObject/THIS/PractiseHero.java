package ClassAndObject.THIS;

public class PractiseHero {
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    //带一个参数的构造方法
    public PractiseHero(String name){
        System.out.println("一个参数的构造方法");
        this.name = name;
    }

    //带两个参数的构造方法
    public PractiseHero(String name,float hp){
//        this.name =name;
        this(name);
        System.out.println("两个参数的构造方法");
        this.hp =hp;
    }

    //带四个参数的构造方法
    public PractiseHero(String name,float hp,float armor,int moveSpeed){
        this(name,hp);
        System.out.println("四个参数的构造方法");
        this.armor =armor;
        this.moveSpeed=moveSpeed;
    }

    public static void main(String[] args) {
        PractiseHero teemo = new PractiseHero("提莫",300);
        System.out.println(teemo.name+"的血量是"+teemo.hp);
        PractiseHero vn = new PractiseHero("薇恩",400,350,50);
        System.out.println(vn.name+"\t的血量是"+vn.hp+"\t"+"护甲是:"+vn.armor+"\t移动速度是:"+vn.moveSpeed);


    }
}
