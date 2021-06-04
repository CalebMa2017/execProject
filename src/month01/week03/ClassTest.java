package month01.week03;

public class ClassTest {
    public static void main(String[] args) {
        System.out.println(new Person() {
            public int a = 0;

            @Override
            public void say() {
                System.out.println("说话");
            }
        }.a);
        Outer.Inner i = new Outer().new Inner();
        Outer.Inner2 i2 = new Outer.Inner2();
//        Outer.new Inner2();//没有这种语法
    }
}
abstract class Person {
    public abstract void say();
}
class Outer {
    class Inner {

    }
    static class Inner2 {

    }
}
