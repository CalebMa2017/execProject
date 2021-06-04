package month01.week04.self;

import org.junit.Test;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 自我练习01
 */
public class Self01 {
    public static void main(String[] args) {
        String str = "suo**fne**wu";
        String str2 = str.replace("**","00");
        System.out.println(str);
        System.out.println(str2);
        String[] split = str2.split("00", 2);
        System.out.println(Arrays.toString(split));
    }
    @Test
    public void test01() {
        double d = 37489201473.34347328;
        double sqrt = Math.sqrt(d);
        System.out.println(sqrt);
        double sqrt1 = Math.sqrt(4);
        System.out.println(sqrt1);
    }

    /**
     * 关于时间
     */
    @Test
    public void test02() {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        GregorianCalendar gre = new GregorianCalendar();
        System.out.println(date);
        System.out.println(cal);
        System.out.println(gre);
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = sdf.format(date);
        System.out.println(format);
    }

    /**
     * 有问题
     */
    @Test
    public void test03() {
        Locale locale = Locale.getDefault();
        Locale localezh = new Locale("zh","CN");
        Locale localeen = new Locale("en","US");
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择语言环境，1.默认，2.汉语，3.英语");
        ResourceBundle rb = null;
        int option = sc.nextInt();
        switch (option) {
            case 1:
                rb = ResourceBundle.getBundle("month01/week03/resource_zh_CN",locale);
                break;
            case 3:
                rb = ResourceBundle.getBundle("month01/week03/resource_en_US",localeen);
                break;
            case  2:
                rb = ResourceBundle.getBundle("month01/week03/resource_zh_CN",localezh);
                break;

        }
        System.out.println(rb.getString("system.name"));
    }
    @Test
    public void test04(){
        Girlfriend[] gfs = new Girlfriend[]{
                new Girlfriend(17,"小蕊"),
                new Girlfriend(21,"徐长春"),
                new Girlfriend(18,"词词")
        };
        System.out.println(Arrays.toString(gfs));
//        Arrays.sort(gfs);
        Arrays.sort(gfs,new MyComparator());
        System.out.println(Arrays.toString(gfs));
    }
    @Test
    public void test05() {
//        Random rd = new Random();
//        System.out.println(rd.nextInt());
        Set<String> set = System.getProperties().stringPropertyNames();
        for(String s : set) {
            String property = System.getProperty(s);
            System.out.println(s+" -> "+property);
        }
        System.out.println("--------------------------------");
        Runtime rt = Runtime.getRuntime();
        int i = rt.availableProcessors();
        System.out.println("处理器的数量"+i+"个");
        System.out.println("jvm总内存数"+rt.totalMemory());
        System.out.println("jvm空闲内存数"+rt.freeMemory());
        System.out.println("jvm最大内存数"+rt.maxMemory());
        System.out.println("-------------------------------");
        try {
            rt.exec("paint");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class Girlfriend implements Comparable{
    int age;
    String name;

    public Girlfriend(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void kiss() {
        System.out.println("Kissing me!");
    }

    @Override
    public int compareTo(Object o) {
        return this.age-((Girlfriend)o).age;
    }

    @Override
    public String toString() {
        return "Girlfriend{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
class MyComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return ((Girlfriend) o1).age - ((Girlfriend) o2).age;
    }
}
