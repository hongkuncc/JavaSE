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

}
