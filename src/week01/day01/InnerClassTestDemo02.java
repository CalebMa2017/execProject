package week01.day01;

/**
 * 方法内部类
 */
public class InnerClassTestDemo02 {

    public static void main(String[] args) {
        Outer3.outerMethod3();
    }
}
class Outer3 {
    private int num;
    public static void outerMethod3() {
        System.out.println("Outer3.outerMethod3");
        class Inner3 {
            public void innerMethod3() {
                System.out.println("Inner3.innerMethod3");
            }
        }
        new Inner3().innerMethod3();
    }
}

