package morth01.week03;

/**
 * 测试类之间强制类型转换   （不能随便转的）
 */
public class TestClassIn {
    public static void main(String[] args) {
        Son01 son01 = new Son01();
        Father son02 = new Son02();
        Son01 son03 = (Son01) son02;
    }
}
class Father {
    public static void methodFath(){
        System.out.println("I am Father");
    }
}
class Son01 extends Father{

}
class Son02 extends Father {

}
