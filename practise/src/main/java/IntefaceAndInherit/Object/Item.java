package IntefaceAndInherit.Object;

public class Item extends Object{
    String name;
    int price;
    public String toString(){
        return "叫做" + name + " 的物品，其价格是 " + price;
    }

    public void finalize() {
        System.out.println("回收叫做 " +name + " 的物品");
    }

    public boolean equals(Object obj) {
        if (obj instanceof Item) {
            Item i = (Item)obj;
            if (i.price == this.price)
                return true;
            else
                return false;
        }
        return false;
    }
}
