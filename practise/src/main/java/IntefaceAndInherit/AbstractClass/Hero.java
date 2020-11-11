package IntefaceAndInherit.AbstractClass;

public abstract class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public static void main(String[] args) {
//        一旦被声明为抽象类就不能直接被实例化
//        Hero h =new Hero();

    }
    //抽象方法attack
    //Hero的子类会被要求实现attack方法
    public abstract void attack();


}
