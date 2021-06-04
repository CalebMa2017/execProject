package month01.week01;

import org.junit.Test;

import java.util.Arrays;
import java.util.Locale;

public class StringTestExecice {

    public static void main(String[] args) {

    }
    @Test
    public void testFn01() {
        String str = new String(" Dark, Ori,gin,  ");
        String str2 = new String(" daRk origin  ");
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
        String strfin = new String(chars);
        System.out.println(strfin);
        System.out.println(str.contains("Dark"));
        System.out.println(str.indexOf("OO"));
        System.out.println(str.lastIndexOf("Ori"));
        System.out.println(str.startsWith("D"));
        System.out.println(str.endsWith(" "));
        String[] split = str.split(",");
        System.out.println(Arrays.toString(split));
    }
    @Test
    public void testFn02() {
        String str = "Hello World  ";
        System.out.println(str.replace("H","***"));
//        System.out.println(str.replaceAll(...));  //应该支持正则表达式暂时还不会
        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,5));
        System.out.println(str.trim());
        }
}
