package month01.week01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 双色球
 */
public class Demo13 {
    public static void main(String[] args) {
        //获取系统蓝球及红球（中奖号码）
        String sysblue =(String) getBalls(1);
        String[] sysred =(String[]) getBalls(6);
        //声明用户号码
        String userblue;
        String[] userred = new String[6];
        System.out.println("双色球：1.机选 2.手动选");
        Scanner scanner=new Scanner(System.in);
        while (true) {
            int i = scanner.nextInt();
            if(i==1) {
                userblue =(String) getBalls(1);
                userred = (String[]) getBalls(6);
                break;
            }else if (i==2) {
                Scanner sc =new Scanner(System.in);
                System.out.println("请输入红球");
                for(i = 0 ; i<6;i++){
                    userred[i]=sc.next();
                }
                System.out.println("请输入蓝球");
                userblue=sc.next();
            }else {
                System.out.println("输入有误重新输入....");
            }
        }
        //打印信息
        System.out.println("用户的号码是"+Arrays.toString(userred)+userblue);
        System.out.println("中奖号码是"+Arrays.toString(sysred)+sysblue);
        awardGrade(sysred,sysblue,userred,userblue);
    }
    /**
     * 中奖等级
     */
    public static void awardGrade(String[] sred,String sblue, String[] ured, String ublue) {
        int redamount=0;
        int blueamount=0;
        if(ublue.equals(sblue)) blueamount=1;
        for(String x:sred){
            for(String y:ured){
                if(x.equals(y)) {
                    redamount++;
                }
            }
        }
        if(blueamount==1&&redamount<3) {
            System.out.println("恭喜，6等奖");
        }else if(blueamount+redamount==4) {
            System.out.println("恭喜，5等奖");
        }else if(blueamount+redamount==5) {
            System.out.println("恭喜，4等奖");
        }else if(blueamount+redamount==6&&blueamount==1) {
            System.out.println("恭喜，3等奖");
        }else if(blueamount+redamount==6) {
            System.out.println("恭喜，2等奖");
        }else if(blueamount+redamount==7) {
            System.out.println("恭喜，7等奖");
        }else {
            System.out.println("对不起，您没有中奖");
        }
    }
    /**
     * 获取球池
     * @return
     */
    public static String[] getPool() {
        String[] strs = new String[33];
        for (int i = 0; i < 33; i++) {
            if(i<9) {
                strs[i] = "0" + (i+1);
            }else {
                strs[i] = i+1+"";
            }
        }
        return strs;
    }

    /**
     * 获取红球或蓝球
     * @param n
     * @return
     */
    public static Object getBalls(int n) {
        String[] pool = getPool();
        Random r = new Random();
        if(n==1) {
            return pool[r.nextInt(16)];//蓝
        }
        //red
        String[] redballs = new String[6];
        int[] intball = new int[6];
        int[] isUsed = new int[33];
        int count = 1;
        while (count > 6) {
            int i = r.nextInt(33);
            if(isUsed[i] == 0) {
                isUsed[i]=1;
                intball[count-1] = i;
            }else {
                continue;
            }
            count++;
        }
        Arrays.sort(intball);
        //ball
        count=0;
        for(int x:intball) {
            redballs[count++] = pool[x];
        }
        return redballs;
    }
}
