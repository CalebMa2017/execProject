package month01.week04.selfCourse;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * 程序国际化
 */
public class Sp_i18n {

    public static void main(String[] args) {
        Locale lc = Locale.getDefault();
        Locale lc_zh = new Locale("zh", "CN");
        Locale lc_en = new Locale("en", "US");
        Scanner sc = new Scanner(System.in);
        ResourceBundle rb = null;
        while (true) {
            System.out.println("请选择：1.默认 2.zh 3.en");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    rb = ResourceBundle.getBundle("month01.week04.resource.info_zh_CN", lc);
                    break;
                case 2:
                    rb = ResourceBundle.getBundle("month01.week04.resource.info_zh_CN", lc_zh);
                    break;
                case 3:
                    rb = ResourceBundle.getBundle("month01.week04.resource.info_en_US", lc_en);
                    break;
                default:
                    System.out.println("您输入的有误，请重新输入");
                    continue;
//                    break;
            }
            break;
            /*if (opt == 1 || opt == 2 || opt == 3) {
                break;
            }*/

        }
        System.out.println("---------------"+rb.getString("system.name")+"-----------------");
        System.out.println(rb.getString("system.print1")+rb.getString("system.added"));
        while (true) {
            System.out.println(rb.getString("system.print2"));
            String name = sc.next();
            if(name.equals(rb.getString("user.name"))){
                System.out.println(rb.getString("system.print3.else"));
                String pwd = sc.next();
                if(pwd.equals(rb.getString("user.password"))){
                    System.out.println(rb.getString("login.success"));
                    break;
                }else {
                    System.out.println(rb.getString("login.fail"));
                    continue;
                }
            }else if(name.equals(rb.getString("user2.name"))) {
                System.out.println(rb.getString("system.print3.else"));
                String pwd = sc.next();
                if(pwd.equals(rb.getString("user2.password"))){
                    System.out.println(rb.getString("login.success"));
                    break;
                }else {
                    System.out.println(rb.getString("login.fail"));
                    continue;
                }
            }else {
                System.out.println(rb.getString("system.print3"));
                continue;
            }
        }

    }


}
