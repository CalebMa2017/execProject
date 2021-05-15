package week01.day01;

import org.junit.Test;

import java.util.Scanner;

public class Demo10 {
    /**
     * 打印空格直角三角形
     */
    @Test
    public void testFun() {
        for (int i = 1; i <=5; i++) {
            for (int j = 0;j<5-i;j++) {
                System.out.print(" ");
            }
            for (int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 打印等腰三角形
     */
    @Test
    public void testFun2() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");
        int m = sc.nextInt();
        int days = days(m);
        if (days==0) {
            System.out.println("输入月份有误");
        }else {
            System.out.println("月份为"+days);
        }
        System.out.println("--------------------------------------------");
        System.out.println("请输入操作：");
        String next = sc.next();
        double a=3.3;double b=-3.3;
        exec(next, a, b);
    }
    public static int days(int m) {
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 0;
        }
    }
    public static void exec(String str,double a,double b) {
        if(str.equals("+")) {
            System.out.println("计算的结果是"+(a+b));
        }else if(str.equals("-")) {
            System.out.println("计算的结果是"+(a-b));
        }else if(str.equals("*")) {
            System.out.println("计算的结果是"+(a*b));
        }else if(str.equals("/")){
            System.out.println("计算的结果是"+(a/b));
        }else {
            System.out.println("操作输入有误");
        }
    }
}
