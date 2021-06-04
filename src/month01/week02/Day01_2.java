package month01.week02;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Day01_2 {
    /**
     * 数组的扩容
     * @param args
     */
    public static void main(String[] args) {
        int[] ints = new int[]{1,2,3,4,5,6};
        int[] ints1 = Arrays.copyOf(ints, ints.length*2);
        System.out.println(Arrays.toString(ints1));
    }

    /**
     * 时间格式化的练习
     */
    @Test
    public void testFn() {
        SimpleDateFormat sim = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss:SSS");
        String format = sim.format(new Date());
        System.out.println(format);
        try {
            Date parse = sim.parse("1888/01/23 18:33:33:888");
            System.out.println(parse);
            long time = parse.getTime();
            System.out.println(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试Calendar
     */
    @Test
    public void testFn2() {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        Date date = new Date(1000);
        System.out.println(date);
        long time = cal.getTimeInMillis();
        System.out.println(time);
        cal.add(Calendar.YEAR,-10);
        System.out.println(cal.getTimeInMillis());
        cal.set(Calendar.YEAR,1974);
        System.out.println(cal.getTimeInMillis());
        int i = cal.get(Calendar.MONTH);
        System.out.println(i);
    }
    /**
     * 包装类
     */
    @Test
    public void testFn3() {
        Integer i1 = new Integer("3");
        Integer i2 = new Integer(3);
        Integer i3 = 3;
        System.out.println(i1==i2);  //dual new
        System.out.println(i1==i3);
        System.out.println(i2==i3);
    }
    @Test
    public void testFn4() {
        Integer i1 = Integer.valueOf(88);
        Integer i2 = Integer.valueOf("88");
        System.out.println(i1==i2);
    }
}
