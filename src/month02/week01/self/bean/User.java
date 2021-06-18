package month02.week01.self.bean;

/**
 * 用户的数据库
 */
public class User {
    private int age;
    private String name;
    private int num;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", num=" + num +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public User() {
    }

    public User(int age, String name, int num) {
        this.age = age;
        this.name = name;
        this.num = num;
    }
}
