package ClassAndObject.Package.Property;

public class Armor extends Item {
    int ac ;

    public static void main(String[] args) {
        Armor bj = new Armor();
        bj.name = "布甲";
        bj.price = 300;
        bj.ac = 15;
        Armor szj =new Armor();
        szj.name ="锁子甲";
        szj.price = 500;
        szj.ac = 40;
    }
}
