package morth01.week03;

/**
 * 对象的一对一关系
 */
public class Execise01 {

    public static void main(String[] args) {
        Weapon w1 = new Weapon("屠龙","合金",null);
        Hero hero = new Hero("灵狐",21,w1);
        Hero hero2 = new Hero("hhh",22,null);
        w1.setHero(hero);
    }

}
class Weapon {
    private String name;
    private String material;
    private Hero hero;

    public Weapon(String name, String material, Hero hero) {
        this.name = name;
        this.material = material;
        this.hero = hero;
    }

    public Weapon() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }
}
class Hero {
    private String name;
    private int age;
    private Weapon weapon;

    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Hero() {
    }
}
