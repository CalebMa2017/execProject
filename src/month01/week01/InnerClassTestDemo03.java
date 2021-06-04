package month01.week01;

/**
 * 匿名内部类
 */
public class InnerClassTestDemo03 {

    public static void main(String[] args) {
        testFunction(new AbClass() {
            @Override
            public void fly() {
                System.out.println("重写了fly方法");
            }

            @Override
            public void say() {
                System.out.println("重写了say方法");
            }
        });
        testFunction2(new FlyInter() {
            @Override
            public void fly() {
                System.out.println("实现了fly方法");
            }
        });
    }
    public static void testFunction(AbClass a) {
        a.fly();
        a.say();
    }
    public static void testFunction2(FlyInter flyinter) {
        flyinter.fly();
    }
}
abstract class AbClass {
    public abstract void fly();
    public abstract void say();
}
interface FlyInter {
    void fly();
}