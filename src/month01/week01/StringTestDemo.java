package month01.week01;

import java.util.Arrays;
import java.util.Locale;

public class StringTestDemo {
    public static void main(String[] args) {
        testFn01();
        testFn02();
        System.out.println("---------------------------");
        testFn03();
    }
    public static void testFn01() {
        String str = "string";
        String str2 = new String("string");
        String str3 = "string";
        System.out.println(str==str2);
        System.out.println(str==str3);
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase("String"));
    }
    public static void testFn02() {
        String str = "0123456789,Hello World!89";
        System.out.println(str.charAt(3));
        System.out.println(str.length());
        //转换成数组
        char[] strchar = str.toCharArray();
        System.out.println(Arrays.toString(strchar));
        System.out.println(str.indexOf("89"));
        System.out.println(str.lastIndexOf("89"));
        System.out.println(str.contains("Hello"));
        System.out.println(str.startsWith("012"));
        System.out.println(str.endsWith("!89"));
        //split可传入正则表达式
        String[] strs = str.split(" ");
        System.out.println(Arrays.toString(strs));
    }
    public static void testFn03() {
        String str = "Hello World";
        System.out.println(str.replace('o','*'));
        System.out.println(str.substring(3));
        System.out.println(str.substring(3,5));
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str.toUpperCase(Locale.ROOT));
        String str02 = "   Hello    ";
        System.out.println(str02.trim());
        //原字符串不变
        System.out.println(str02);
    }
}
