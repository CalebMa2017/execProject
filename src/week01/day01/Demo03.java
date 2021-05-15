package week01.day01;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        int[] ints01=new int[]{1,3,8,7,9};
        int[] ints02=new int[6];
        System.arraycopy(ints01,2,ints02,0,3);
        Arrays.toString(ints01);
        Arrays.sort(ints01);
        Arrays.toString(ints01);
        System.out.println(Arrays.binarySearch(ints01, 7));
    }
}
