package morth01.week03;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        int[] ints = new int[] {5,3,9,3,4,5,6,7,2,1};
        int[] a = insertSort(ints);
        System.out.println(Arrays.toString(a));
    }
    /**
     * 直接插入排序
     */
    public static int[] insertSort(int[] ints) {
        for(int i=1;i<ints.length;i++) {
            int value = ints[i];
            int j;
            for(j=i-1;value<ints[j]&&j>=0;j--) {
                ints[j+1]=ints[j];
            }
            ints[j+1]=value;
        }
        return ints;
    }
    /**
     * 折半插入排序
     */
//    public static int[] insertSort2(int[] a) {
//
//    }
}
