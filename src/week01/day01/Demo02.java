package week01.day01;

public class Demo02 {
    public static void main(String[] args) {
        BB b=new BB();
        b.testFn();
    }
}
class AA {
    public static void testFn() {
        System.out.println("AA.testFn");
    }
}
class BB extends AA{
    public static void testFn() {
        System.out.println("BB.testFn");
    }
}
