package ClassAndObject.Package.Charactor;

public class GiantDragon {
    //私有化构造方法使得该类无法在外部通过new进行实例化
    private GiantDragon(){

    }
    /*//饿汉单例模式
    //准备一个类属性，指向一个实例化对象，因为是类属性，所以只有一个
    private static GiantDragon instance = new GiantDragon();
    //public static 方法，提供给调用者获取12行定义的对象
    public static GiantDragon getInstance(){
        return instance;
    }*/


    //懒汉式单例模式
    //准备一个类属性，用于指向一个实例化对象，但是暂时指向null
    private static GiantDragon instance;

    //public static 方法，返回实例对象
    public static GiantDragon getInstance(){
        //第一次访问的时候，发现instance没有指向任何对象，这时实例化一个对象
        if(null==instance){
            instance = new GiantDragon();
        }
        //返回 instance指向的对象
        return instance;
    }

//什么是单例模式？
/*    1. 构造方法私有化
    2. 静态属性指向实例
    3. public static的 getInstance方法，返回第二步的静态属性*/


}
