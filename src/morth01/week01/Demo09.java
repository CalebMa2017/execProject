package morth01.week01;

/**
 * 父类private的方法，子类不能被继承，所以不能被重写。
 */
public class Demo09 {

    public static void main(String[] args) {
        int a = 3;
//        int b = 4;
        int c = a+(a-=1)+a+a;
        System.out.println(c);
        a=3;
        c = (a-=1)+a;
        System.out.println(c);
    }
}
class Children {
    private void method(){
    }
    public void method02() {

    }
    public static void method03() {

    }
}
class Father extends Children {
    public void method() {

    }
}
