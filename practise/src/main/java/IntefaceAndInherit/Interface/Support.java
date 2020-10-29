package IntefaceAndInherit.Interface;

public class Support extends Hero implements Healer {
    @Override
    public void heal() {
        System.out.println("实现治疗");
    }
}
