package morth01.week02;

/**
 * 简单工厂
 */
public class SimpleFactory {

    public static void main(String[] args) {
        Product product1 = Factory.produce("Phone");
        Product product2 = Factory.produce("Computer");
        Product product3 = Factory.produce("Mouse");
        product1.work();
        product2.work();
        product3.work();
    }
}
abstract class Factory implements Product{
    public static Product produce(String name) {
        if(name.equals("Phone")) return new Phone();
        if("Computer".equals(name)) return new Computer();
        if("Keyboard".equals(name)) return new Keyboard();
        return null;
    }
    public static void doIfCould(Product product) {
        if(null==product) System.out.println("生产该产品");
        else product.work();
    }
}
interface Product {
    void work();
}
class Phone implements Product{
    @Override
    public void work() {
        System.out.println("Phone.work");
    }
}
class Computer implements Product {
    @Override
    public void work() {
        System.out.println("Computer.work");
    }
}
class Keyboard implements Product {
    @Override
    public void work() {
        System.out.println("Keyboard.work");
    }
}
