package morth01.week01;

/**
 * 测试子类的static方法可不可以重名
 */
public class Demo08 {

    public static void main(String[] args) {

    }
}
class AClass {
    static void methodA() {
        System.out.println("AClass.methodA");
    }
    /*public void methodA(int a) {

    }*/
}
class BClass extends AClass{
    /*public static void methodA() {
        System.out.println("BClass.methodA(public)");
    }
    static void methodA(int a,int b) {
        System.out.println("BClass.methodA(default)");
    }*/
    public void methodA(int a) {

    }
}
