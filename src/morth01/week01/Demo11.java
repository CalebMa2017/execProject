package morth01.week01;

import org.junit.Test;

public class Demo11 {

    public static void main(String[] args) {
        int n = 3;
        int[] ints = new int[n];
        int a[] = new int[3];
        methodInfor("hhhhS",3,4,4,55,6);
    }
    public static void methodInfor(String b,int... a) {
        for(int x:a) {
            System.out.print(" "+x);
        }
    }
    @Test
    public void testFun() {
        int a=8;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
