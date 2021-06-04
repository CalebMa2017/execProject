package month01.week03;

import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * 程序国际化练习
 */
public class CourseDay02_01 {
    public static void main(String[] args) {
        //获取语言环境
        Locale locale = new Locale("zh","CN");
        Locale locale2 = new Locale("en","US");
        Locale locale3 = Locale.getDefault();
        ResourceBundle rb = null;
        System.out.println("请选择语言环境:1.中文 2.英文 3.默认");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        switch (op) {
            case 1:
                rb = ResourceBundle.getBundle("morth01.week03.resource_zh_CN",locale);
                break;
            case 2:
                rb = ResourceBundle.getBundle("morth01.week03.resource_en_US",locale2);
                break;
            case 3:
                rb = ResourceBundle.getBundle("morth01.week03.resource_zh_CN",locale3);
                break;
        }
        System.out.println(rb.getString("system.name")+"   "+rb.getString("username"));
        System.out.println(rb.getString("system.print"));
        String next = sc.next();
        if(next.equals(rb.getString("password"))){
            System.out.println(rb.getString("system.print2"));
        }
    }

    /**
     * 匿名内部类测试
     */
    @Test
    public void testFn() {
        AbsClass01 ab = new AbsClass01(){
            @Override
            public void methodtoPrint() {
                System.out.println("CourseDay02_01.methodtoPrint");
            }

            @Override
            public void method2() {
                System.out.println("CourseDay02_01.method2");
            }
            public int a=3;
            public void method3() {
                System.out.println("CourseDay02_01.method3");
            }
        };
//        ab.method3();
//        System.out.println(ab.a);
    }
}
abstract class AbsClass01 {
    public abstract void methodtoPrint();
    public abstract void method2();
}
