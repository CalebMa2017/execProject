package month01.week02;

import java.util.Arrays;

/**
 * 课堂练习：对象数组的管理
 */
public class CURDTrain {
    public static void main(String[] args) {
        Chicken[] cks = new Chicken[5];
        ChickenManager cm = new ChickenManager(cks);
        cm.add(new Chicken(1,"惨叫鸡",20));
        cm.add(new Chicken(2,"小黄鸡",21));
        cm.add(new Chicken(3,"大公鸡",22));
        cm.add(new Chicken(4,"僵尸鸡",10000));
        cm.printAll();
        cm.add(new Chicken(4,"僵尸鸡",10000));
        cm.add(new Chicken(4,"僵尸鸡",10000));
        cm.add(new Chicken(4,"僵尸鸡",10000));
        cm.add(new Chicken(4,"僵尸鸡",10000));
        cm.printAll();
    }
}

/**
 * 用管理者对数组进行增删改查
 */
class ChickenManager {
    private Chicken[] cks;
    private int count;
    public ChickenManager(Chicken[] cks) {
        this.cks = cks;
    }

    /**
     * 扩大2倍
     */
    public void copyOf() {
        cks=Arrays.copyOf(cks,cks.length*2);
    }
    /**
     * 增加方法
     * @param ck
     * @return
     */
    public boolean add(Chicken ck) {
        if(cks.length==count) return false;
        cks[count++]=ck;
        return true;
    }

    /**
     * 更新小鸡
     * @param id
     * @param ck
     * @return
     */
    public boolean update(int id,Chicken ck){
        for (int i = 0; i < count; i++) {
            if(cks[i].getId()==id) {
                cks[i]=ck;
                return true;
            }
        }
        return false;
    }

    /**
     * 打印小鸡信息
     */
    public void printAll() {
        for (int i = 0; i < cks.length; i++) {
            System.out.println(cks[i]);
        }
        System.out.println("----------------------");
    }

    /**
     * 删除方法
     * @param id
     * @return
     */
    public boolean delete(int id) {
        int index=-1;
        for (int i = 0; i < count; i++) {
            if(cks[i].getId()==id) {
                index=i;
            }
        }
        if(index==-1) return false;
        for (int i = index; i < count-1; i++) {
            cks[i]=cks[i+1];
        }
        cks[count--]=null;
        return true;
    }
    /**
     * 判断是否存在
     */
    public boolean isExist(Chicken ck) {
        for (int i = 0; i < count; i++) {
            if (ck.getId()==cks[i].getId()&&
            ck.getMonth()==cks[i].getMonth()&&
            ck.getName().equals(cks[i].getName()))
                return true;
        }
        return false;
    }
    /**
     * 查询指定id的Chicken,如果查询成功则输出
     */
    public boolean printByIdIfPresent(int id){
        for (int i = 0; i < count; i++) {
            if(cks[i].getId()==id) {
                System.out.println(cks[i]);
                return true;
            }
        }
        return false;
    }
    /**
     * 插入
     */
//    public boolean insert(int index) {
//        if(index<)
//    }
}

/**
 * 鸡类
 */
class Chicken {
    public Chicken(int id, String name, int month) {
        this.id = id;
        this.name = name;
        this.month = month;
    }
    public Chicken() {}
    private int id;
    private String name;
    private int month;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", month=" + month +
                '}';
    }
}
