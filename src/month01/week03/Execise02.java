package month01.week03;

/**
 * 单例设计模式（简单）
 */
public class Execise02 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingletonInstance();
        Singleton2 s2 = Singleton2.getSingleton2Instance();
        s1.method01();
        s2.method02();
    }
}
class Singleton {
    private Singleton() {}
    private static Singleton singleton = new Singleton();
    public static Singleton getSingletonInstance() {
        return singleton;
    }
    public void method01() {
        System.out.println("Singleton.method01");
    }
}
class Singleton2{
    private Singleton2() {}
    private static Singleton2 singleton2;
    public static Singleton2 getSingleton2Instance() {
        if(singleton2==null) singleton2 = new Singleton2();
        return singleton2;
    }
    public void method02() {
        System.out.println("Singleton2.method02");
    }
}
