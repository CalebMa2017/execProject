package week01.day01;

/**
 * 父类private的方法，子类不能被继承，所以不能被重写。
 */
public class Demo09 {

    public static void main(String[] args) {

    }
}
class Children {
    private void method(){

    }
}
class Father extends Children {
    public void method() {

    }
}
