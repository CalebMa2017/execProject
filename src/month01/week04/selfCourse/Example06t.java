package month01.week04.selfCourse;

import org.junit.Test;

/**
 * 测试protected方法的使用
 */
public class Example06t {
    public static void main(String[] args) {
        MyObject m = new MyObject();
        try {
            Object clone = m.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

    /**
     * 如果子类重写了父类的方法
     */
    @Test
    public void test01() {
        MyFather small = new MySon(18, "小马琛");
        MySon big = new MySon(18,"大马琛");
        MyFather o2 = new MyFather();
        o2.methodProtected();
        small.methodProtected();
        big.methodProtected();
    }
}

/**
 * 创建一个父类
 */
class MyFather {
    protected int age;
    public String name;
    public void methodPublic(){
        System.out.println("MyFather.methodPublic");
    }
    protected void methodProtected() {
        System.out.println("MyFather.methodProtected");
    }

    public MyFather(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public MyFather() {
    }
}

class MySon extends MyFather{
    public MySon(int age, String name) {
        super(age, name);
    }

    public MySon() {
    }


}
/**
 * 自我的定义的对象
 */
class MyObject implements Cloneable{
    int age;
    String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public MyObject() {
    }

    public MyObject(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
