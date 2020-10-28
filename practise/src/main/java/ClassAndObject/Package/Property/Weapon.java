package ClassAndObject.Package.Property;

public class Weapon extends Item {
    int damage;

    public static void main(String[] args) {
        Weapon infinityEdage = new Weapon();
        infinityEdage.damage = 65;
        infinityEdage.name = "无尽之刃";
        infinityEdage.price = 3600;
    }
}
