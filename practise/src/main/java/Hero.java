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

        Hero teemo = new Hero();
        garen.name="提莫";
        garen.hp=383f;
        garen.armor=14f;
        garen.moveSpeed=330;
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
