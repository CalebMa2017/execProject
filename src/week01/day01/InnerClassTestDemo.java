package week01.day01;

import org.junit.Test;

public class InnerClassTestDemo {
    /**
     * 非静态内部类
     * @param args
     */
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.method();
    }

    /**
     * 静态内部类
     */
    @Test
    public void test() {
        Outer2.Inner2 in=new Outer2.Inner2();
        in.approach();
        Outer2.Inner2.staticApproach();
    }
}
class Outer{
    private int number;
    private String name;
    public void method() {
        System.out.println("Outer.outerMethod");
    }
    class Inner {
        private int number;
        private String name;
        public void method() {
            System.out.println("Inner.innerMethod");
            System.out.println(name+Outer.this.name);
            System.out.println(this.number+""+Outer.this.number);
            method();
            this.method();
            Outer.this.method();
        }
    }
}
class Outer2 {
    private int num;
    private static int num2;
    public void method() {
        System.out.println("Outer2.method");
    }
    public static void method2() {
        System.out.println("Outer2.method2");
    }
    static class Inner2 {
        private int num;
        private static int staticnum;
        public void method1() {
            System.out.println("Inner2.method1");
        }
        public static void method2() {
            System.out.println("Inner2.method2");
        }
        public void approach() {
            System.out.println("Inner2.approach");
            method2();
            Outer2.method2();
        }
        public static void staticApproach() {
            System.out.println("Inner2.staticApproach");
            method2();
//            method1();//不允许
            Outer2.method2();
            System.out.println(staticnum);
            System.out.println(num2);
        }
    }
}

