package month01.week03;

/**
 * 练习compare
 */
public class Course {
    public static void main(String[] args) {
        Person222 p = new Person222();
        try {
            Object clone = p.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
class Person222 implements Cloneable{
    public int age;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
abstract class AA{
    abstract void method();
}