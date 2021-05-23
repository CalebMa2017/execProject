package morth01.week01;

import org.junit.Test;

import java.util.*;

/**
 * 双色球写第二遍
 */
public class Demo14 {

    @Test
    public void testFun() {
        Set redBalls = getRedBalls();
        System.out.println(redBalls);
    }
    public static void main(String[] args) {
        String[] pool = getPool();
        System.out.println("欢迎来到双色球");
        //定义一些工具性变量
        boolean flag=true;
        Set userred = null;
        String userblue = null;
        while (flag) {
            System.out.println("请输入买彩票的规则：1.机选 2.手选");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            switch (input) {
                case 1://机选，首先获取用户的号码
                    userred = getRedBalls();
                    userblue = getBlueBall();
                    flag=false;
                    break;
                case 2:
                    userred = manualreds();
                    userblue = manualblue();
                    flag=false;
                    break;
                default:
                    System.out.println("输入有误请重新输入");
                    break;
            }
        }
        //输出用户的号码
        System.out.println("您的号码是");
        userred.forEach(s-> System.out.print(s+" "));
        System.out.println("+ " + userblue);
        //获取系统的中奖号码
        Set sysred = getRedBalls();
        String sysblue = getBlueBall();
        //奖项
        printAward(userred,userblue,sysred,sysblue);
        //输出系统中奖号码
        System.out.println("中奖号码是");
        sysred.forEach(s-> System.out.print(s+" "));
        System.out.println("+ " + sysblue);
    }

    /**
     * 输出奖项
     * @param ur
     * @param ub
     * @param sr
     * @param sb
     */
    public static void printAward(Set ur,String ub,Set sr,String sb) {
        int blueamount = 0;
        int redamount = 0;
        if(ub.equals(sb)) blueamount++;
        for(Object x:ur) {
            for(Object y:sr) {
                if(x.equals(y)) redamount++;
            }
        }
        if(blueamount==1&&redamount<3) System.out.println("恭喜，6等奖");
        else if(blueamount+redamount==4) System.out.println("恭喜，5等奖");
        else if(blueamount+redamount==5) System.out.println("恭喜，4等奖");
        else if(blueamount==1 && blueamount+redamount==6) System.out.println("恭喜，3等奖");
        else if(blueamount+redamount==6) System.out.println("恭喜，2等奖");
        else if(blueamount+redamount==7) System.out.println("恭喜，1等奖");
        else System.out.println("很遗憾，您没中奖");
    }
    /**
     * 手动获取红球
     * @return
     */
    public static Set<String> manualreds() {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> set = new TreeSet<>();
        System.out.println("请输入红球的号码");
        for (int i = 0; i < 6; i++) {
            set.add(sc.next());
        }
        return set;
    }
    /**
     * 手动获取蓝球
     * @return
     */
    public static String manualblue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入蓝球的号码");
        String next = sc.next();
        return next;
    }
    /**
     * 获取蓝球
     */
    public static String getBlueBall() {
        Random r=new Random();
        int index = r.nextInt(16);
        return getPool()[index];
    }
    /**
     * 获取红球
     * @return
     */
    public static Set getRedBalls() {
        Set set = new TreeSet<String>();
        Random r = new Random();
        String[] pool = getPool();
        int count=0;
        boolean[] isused = new boolean[33];
        while (count<6){
            int index = r.nextInt(33);
            if (isused[index]==false) {
                String value = pool[index];
                isused[index]=true;
                set.add(value);
            }else continue;
            count++;
        }
        return set;
    }
    /**
     * 获取球池
     * @return
     */
    public static String[] getPool() {
        String[] pool = new String[33];
        for (int i = 0; i < 33; i++) {
            if(i<=8) {
                pool[i]="0"+(i+1);
                continue;
            }
            pool[i]=""+(i+1);
        }
        return pool;
    }

}