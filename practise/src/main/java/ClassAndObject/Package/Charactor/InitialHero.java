package ClassAndObject.Package.Charactor;

public class InitialHero {
    public String name = InitialHero.getName("属性声明");

    public InitialHero(){
        name = InitialHero.getName("构造方法");
    }
    //块
    {
        name = InitialHero.getName("初始化块");
    }
    public static String getName(String pos){
        String result = "name"+pos;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        new InitialHero();

    }
}
