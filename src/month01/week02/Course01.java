package month01.week02;

/**
 * 课堂练习：对象的一对一关系
 */
public class Course01 {

    public static void main(String[] args) {
        Weapon zbsm = new Weapon("丈八蛇矛","钢", (short) 00001);
        Hero zhangfei = new Hero(zbsm,"张飞","40","蜀国");
        System.out.println("我的武器信息是"+zhangfei.getWeapon());
        zhangfei.introduct();
        Weapon jian = new Weapon("剑","合金",(short) 00002);
        Hero 李白 = new Hero(jian,"李白","20","tang");
        System.out.println("我会用的武器是"+李白.getWeapon());
        李白.introduct();
    }
}

/**
 * 英雄
 */
class Hero {
    private Weapon herowea;
    private String name;
    private String age;
    private String country;
    public void introduct() {
        System.out.println("我是"+name);
    }
    public String getWeapon() {
        return herowea.toString();
    }

    public Hero(Weapon herowea, String name, String age, String country) {
        this.herowea = herowea;
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public Hero() {
    }
}
/**
 * 武器
 */
class Weapon {
    private String name;
    private String material;
    private short typecode;

    public  Weapon() {}

    public Weapon(String name, String material, short typecode) {
        this.name = name;
        this.material = material;
        this.typecode = typecode;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", typecode=" + typecode +
                '}';
    }
}

