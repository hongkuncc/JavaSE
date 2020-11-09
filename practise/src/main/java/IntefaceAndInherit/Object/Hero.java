package IntefaceAndInherit.Object;


public class Hero extends Object{
    public String name;
    protected float hp;
    float armor;
    int moveSpeed;
    public String toString(){
        return name;
    }

    /*当一个对象没有任何引用指向的时候，它就满足垃圾回收的条件

当它被垃圾回收的时候，它的finalize() 方法就会被调用。

finalize() 不是开发人员主动调用的方法，而是由虚拟机JVM调用的。
*/
    public void finalize(){
        System.out.println("这个英雄正在被回收");
    }
    public static void main(String[] args) {
        Hero h;
        for (int i = 0; i < 100000; i++) {
            //不断生成新的对象
            //每创建一个对象，前一个对象，就没有引用指向了
            //那些对象，就满足垃圾回收的条件
            //当，垃圾堆积的比较多的时候，就会触发垃圾回收
            //一旦这个对象被回收，它的finalize()方法就会被调用
            h = new Hero();
        }

    }
}
