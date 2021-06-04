package month01.week02;

/**
 * 双色球案例
 */
public class DualColor {
    public static void main(String[] args) {

    }

    /**
     * 获取球池
     * @return
     */
    public static String[] getBoolPool() {
        String[] strs=new String[33];
        for (int i = 0; i < 33; i++) {
            if(i+1<10) strs[i]="0"+(i+1);
            else strs[i]=""+(i+1);
        }
        return strs;
    }
    /**
     * 取红球
     */
/*    public static String[] getRedBalls() {
        String[] reds = new String[16];
        Random rd = new Random();
    }*/
}