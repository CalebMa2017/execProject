package morth01.week03;

/**
 * 简单工厂模式
 */
public class Example03 {
    public static void main(String[] args) {
        String str = "phone";
        if(null!=str) {
            Product product01 = ProductFactory.produce(str);
            product01.work();
        }
    }
}
class ProductFactory{
    public static Product produce(String name) {
        if("phone".equals(name)) {
            return new Phone();
        }else if("computer".equals(name)){
            return new Computer();
        }
        return null;
    }
}
class Phone implements Product {

    @Override
    public void work() {
        System.out.println("手机在工作");
    }
}
class Computer implements Product {
    @Override
    public void work() {
        System.out.println("电脑在工作");
    }
}
interface Product {
    void work();
}