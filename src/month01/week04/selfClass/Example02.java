package month01.week04.selfClass;

import java.util.*;

/**
 * 猪舍管理案例
 */
public class Example02 {
    public static void main(String[] args) {
        PigMangager pm =new PigMangager();
        pm.addAll("hh",2,500,7);
        pm.printAll();
    }
}

/**
 * 管理类
 */
class PigMangager {
    //定义一个自动按年龄排序的猪舍
    private List<Pig> pigSet = new ArrayList<>();
    public void insert(int index,String name,int age,int weight){
        pigSet.add(index,new Pig(name,age,weight));
    }

    /**
     * 排序1：
     */
    public void sort1() {
        pigSet.sort(new PigComparator());
    }
    /**
     * 根据年龄排序的比较器
     */
    static class PigComparatorByAge implements Comparator<Pig> {
        @Override
        public int compare(Pig o1, Pig o2) {
            return o1.getAge()-o2.getAge();
        }
    }
    /**
     * 添加
     * @param name
     * @param age
     * @param weight
     * @param amount
     */
    public void addAll(String name,int age,int weight,int amount) {
        pigSet.addAll(PigFactory.producePigs(name,age,weight,amount));
    }
    public void add(String name,int age,int weight) {
        pigSet.add(PigFactory.producePig(name,age,weight));
    }
    /**
     * 根据age移除方法
     * @param age
     */
    public void remove(int age) {
        for(Pig p:pigSet) {
            if(p.getAge()==age) {
                pigSet.remove(p);
            }
        }
    }

    /**
     * 输出所有Pig方法
     */
    public void printAll() {
        pigSet.forEach(System.out::println);
    }

}

