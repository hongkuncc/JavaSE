package Exception;

public class TestException {
    public static void main(String[] args) {
        int result = method();
        System.out.println("result:"+result);

/*
    运行时异常
        //任何除数不能为0:ArithmeticException
        int k = 5/0;

        //下标越界异常：ArrayIndexOutOfBoundsException
        int j[] = new int[5];
        j[10] = 10;

        //空指针异常：NullPointerException
        String str = null;
        str.length();*/

    }
    public static int method(){
        try {
            return return1();
        }catch (Exception e){
            return return2();
        }finally {
            return return3();
        }
    }
    private static int return1(){
        System.out.println("return 1");
        return 1;
    }
    private static int return2(){
        System.out.println("return 2");
        return 2;
    }
    private static int return3(){
        System.out.println("return 3");
        return 3;
    }
}
