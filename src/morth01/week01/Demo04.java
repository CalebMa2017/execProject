package morth01.week01;

import java.util.HashSet;
import java.util.Set;

public class Demo04 {

    public static void main(String[] args) {
        Product p1 = new Product(1,"百战牌鼠标","BZ_001",99.21,0.9);
        Product p2 = new Product(2,"键盘侠玩偶","WO_102",403.00,0.7);
        Product p3 = new Product(3,"实战java程序设计","BK_001",89.00,0.8);
        Product p4 = new Product(4,"高淇牌西装","GQ_XF_12",700.00,0.5);
        Product p5 = new Product(5,"大米牌手机","DM_PH_13",900.00,0.3);
        Product[] products = new Product[] {p1,p2,p3,p4,p5};
        printAll(products);
        System.out.println("----------------------------");
        Set set = returnIfUpper(products,500.00);
        set.forEach(System.out::println);
    }
    public static void printAll(Product[] products) {
        for(Product p:products) {
            System.out.println(p);
        }
    }
    public static Set<Product> returnIfUpper(Product[] products,double pricestandard){
        HashSet<Product> ps = new HashSet<>();
        for(Product x:products) {
            if(x.getPrice()>pricestandard) {
                ps.add(x);
            }
        }
        return ps;
    }
}
class Product {
    public Product(int id, String name, String model, double price, double discount) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }

    private int id;
    private String name;
    private String model;
    private double price;
    private double discount;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }
}
