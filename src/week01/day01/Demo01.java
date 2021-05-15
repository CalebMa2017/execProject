package week01.day01;

public class Demo01 {
    public static void main(String[] args) {
        B b = new B();
        b.staticMethod01();
    }
}
class A {
    static void staticMethod01() {
        System.out.println("A.staticMethod01");
    }
}
class B extends A {
    static void staticMethod01(){
        System.out.println("B.staticMethod01");
    }
}
