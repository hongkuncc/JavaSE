package ClassAndObject.Package.Charactor;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    int killed;
    int kill;
    int support;
    int money;
    int lastHit;
    int attackSpeed;
    String wordAfterKill;
    String wordAfterKilled;


//    这个无参的构造方法，如果不写，
//    就会默认提供一个无参的构造方法
//    public Hero() {
//        System.out.println("实例化一个对象的时候，必然调用构造方法");
//    }

    //有参的构造方法
    //默认的无参的构造方法就失效了
//    public Hero(String heroname){
//        name = heroname;
//    }
//    两个参数的重载

/*    public Hero(String heroname,float herohp){
        name = heroname;
            hp = herohp;
        }
    public Hero(String heroname,float herohp,float heroArmor,int heroMoveSpeed){
        name = heroname;
        hp = herohp;
        armor = heroArmor;
        moveSpeed = heroMoveSpeed;
    }*/






//    public static void main(String[] args) {
//        Hero garen =  new Hero("盖伦");
//
//        Hero teemo =  new Hero(); //无参的构造方法“木有了”
//    }


    //打印内存中的虚拟地址
    public void showAddressInMemory(){
        System.out.println("打印this看到的虚拟地址："+this);
    }


    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name="盖伦";
        garen.hp=616.28f;
        garen.armor=27.536f;
        garen.moveSpeed=330;
        garen.addSpeed(100);
        System.out.println(garen.name + " 当前的血量是 " +garen.hp);
        System.out.println("回血100");
        garen.recovery(100);
        System.out.println("现在的血量是:" + garen.hp);
        System.out.println("打印对象看到的虚拟地址："+garen);
        garen.showAddressInMemory();

        Hero teemo = new Hero();
        teemo.name="提莫";
        teemo.hp=383f;
        teemo.armor=14f;
        teemo.moveSpeed=330;
        System.out.println("打印对象看到的虚拟地址："+teemo);
        teemo.showAddressInMemory();

        //以下是转义字符
        char tab = '\t'; //制表符
        char carriageReturn = '\r'; //回车
        char newLine = '\n'; //换行
        char doubleQuote = '\"'; //双引号
        char singleQuote = '\''; //单引号
        char backslash = '\\'; //反斜杠
    }

    void addSpeed(int speed){
        //在原来的基础上增加移动速度
        moveSpeed = moveSpeed + speed;
    }

    //获取护甲值
    float getArmor(){
        return armor;
    }

    //坑队友
    void keng(){
        System.out.println("坑比队友！");
    }

    // 超神 legendary(),无参数，无返回类型
    void legendary(){
        System.out.println("超神！");
    }

    // 获取当前的血量
    float getHp(float hp){
        return hp;

    }
    // 回血 recovery(float blood)， 有参数 float类型参数 blood表示本次恢复的血量，无返回类型
    void recovery(float blood){
        hp = hp+blood;

    }

}
