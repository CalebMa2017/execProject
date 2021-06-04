package month01.week02;

import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        ImportCosmeticManger cm = new ImportCosmeticManger();
        cm.add(new Cosmetic("大宝" , "国产" , 22));
        cm.add(new Cosmetic("蒂花之秀" , "进口" , 11));
        cm.add(new Cosmetic("舒肤佳" , "国产" , 33));
        cm.add(new Cosmetic("baby brown","进口",44));
        cm.add(new Cosmetic("香奈儿","进口",33));
        cm.add(new Cosmetic("hhhhh","国产",11));
        cm.printAll();
    }
}
class ImportCosmeticManger extends CosmeticManager {
    /**
     * 只输出进口化妆品类
     */
    @Override
    public void printAll() {
        System.out.println("所有进口化妆品为：");
        for(int i=0;i<count;++i) {
            if(cosmetics[i].getType().equals("进口"))
                System.out.println(cosmetics[i]);
        }
        System.out.println("--------------------------");
    }
}
class SortCosmeticManager extends CosmeticManager{

    public void printAll(){
        Cosmetic[] cosmetics1 = Arrays.copyOf(cosmetics , cosmetics.length);

        for(int i = 0 ; i < count ; i ++ ){
            int minIndex = i;
            for (int j = i ; j < count ; j ++){
                if(cosmetics1[minIndex].getPrice() > cosmetics1[j].getPrice()){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                Cosmetic temp = cosmetics1[minIndex];
                cosmetics1[minIndex] = cosmetics1[i];
                cosmetics1[i] = temp;
            }
        }

        //printAll();
        for(int i = 0 ; i < count ; i ++){
            System.out.println(cosmetics1[i].toString());
        }
    }
}

class CosmeticManager{

    Cosmetic[] cosmetics = new Cosmetic[5];
    int count = 0 ;
    public void add(Cosmetic c){
        if(count == cosmetics.length){
            cosmetics = Arrays.copyOf(cosmetics , cosmetics.length + (cosmetics.length / 2 + 1));
        }
        cosmetics[count++] = c;
    }

    public void printAll(){
        for(int i = 0 ; i < count ; i ++){
            System.out.println(cosmetics[i].toString());
        }
    }
}

class Cosmetic{

    private String name;
    private String type;
    private int price;

    public Cosmetic() {
    }

    public Cosmetic(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cosmetic{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}