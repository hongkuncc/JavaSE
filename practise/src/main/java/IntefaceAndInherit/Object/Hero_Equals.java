package IntefaceAndInherit.Object;

public class Hero_Equals {
    public String name;
    protected float hp;

    public boolean equals(Object o){
        if(o instanceof Hero_Equals){
            Hero_Equals h = (Hero_Equals) o;
            return this.hp == h.hp;
        }
        return false;
    }

    public static void main(String[] args) {
        Hero_Equals h1= new Hero_Equals();
        h1.hp = 300;
        Hero_Equals h2= new Hero_Equals();
        h2.hp = 400;
        Hero_Equals h3= new Hero_Equals();
        h3.hp = 300;



        //equals() 用于判断两个对象的内容是否相同
        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));

        //==这不是Object的方法，但是用于判断两个对象是否相同
        //更准确的讲，用于判断两个引用，是否指向了同一个对象
        System.out.println(h1==h2);
        System.out.println(h1==h3);
    }
}
