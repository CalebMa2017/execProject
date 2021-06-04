package month01.week01;

import org.junit.Test;

import java.util.Arrays;

/**
 * 周日课练习
 */
public class Demo12 {

    public static void main(String[] args) {
        char[] chars = new char[]{'a','b','c','d','e','f','g'};
        print_(chars);
    }
    public static void print_(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = chars.length; j > i+1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(chars[i]);
            }
            System.out.println();
        }
    }
    /**
     * 冒泡排序
     */
    @Test
    public void testFun() {
        int[] ints = new int[]{8,3,56,3,22,6,8};
        for (int i = 0; i < ints.length - 1; i++) {     //趟数数组长度-1
            for (int j = 0; j < ints.length - i - 1; j++) {      //每趟比较的个数，数组长度-趟数（趟数从1开始
                if(ints[j]>ints[j+1]) {
                    int temp = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
    }
}
