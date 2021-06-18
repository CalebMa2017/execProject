package month02.week01.self.singleInstance;

/**
 * 单例设计的优化
 */
public class Single {
    public static void main(String[] args) {

    }

}

/**
 * 仅限于饿汉式
 */
final class Singleton {
    private Singleton() {
        //防止反射
        throw new RuntimeException("此类为单例设计模式，不允许外部调用");
    }
    //易变的属性
    private volatile static Singleton singleton = null;
    private static Singleton getSingletonInstance(){
        if (null==singleton) {//这个if是防止消耗性能的
            synchronized (Singleton.class) {
                if(singleton==null) singleton=new Singleton();
            }
        }
        return singleton;
    }
}
