package week01.day01;

import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

/**
 * 用来练习java的类及方法的
 */
public class Demo06 {

    public static void main(String[] args) {

    }
    /**
     * System类
     */
    @Test
    public void testFn1() {
        System.err.println("输出一条错误信息");
        long l = System.currentTimeMillis();
        System.out.println(l);
        int[] ints1 = new int[] {1,6,4,3,4};
        int[] ints2 = new int[8];
        System.arraycopy(ints1,0,ints2,0,4);
        System.out.println(Arrays.toString(ints1));
        Properties properties = System.getProperties();
        Set<String> set = properties.stringPropertyNames();
        //打印所有属性名及属性值
        set.forEach(s-> System.out.println(s+"\t\t\t"+System.getProperty(s)));
        //异常退出，程序中断
        System.exit(9);
       System.exit(0);

    }

    /**
     * Runtime类的使用
     */
    @Test
    public void testFn2() {
        Runtime rt = Runtime.getRuntime();
        try {
            Process pro = rt.exec("notepad.exe");
            Thread.sleep(5000);
            pro.destroy();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testFn3() {
        int num=-1;
        //不会改变原值，会产生新的值
        Math.abs(num);
        System.out.println(num);
        System.out.println(Math.abs(-9.8888));
        System.out.println(Math.ceil(4.4));
        System.out.println(Math.floor(5.9));
        System.out.println(Math.round(-9.7));
        System.out.println(Math.max(8, 8.8));
        System.out.println(Math.min(9, -3));
        double random = Math.random();
        System.out.println(random);
    }

    /**
     * Random类
     */
    @Test
    public void testFn4() {
        //如果不传入种子种子是随机的
        Random rd = new Random(2);
        double v = rd.nextDouble();
        System.out.println(v);
        double v1 = rd.nextDouble();
        System.out.println(v1);
    }

    /**
     * 包装类
     */
    @Test
    public void testFn5() {
        //集合不能存储基本数据类型
        Integer i01 = 3;
        int i = i01.intValue();
        System.out.println(i);
        Integer integer = Integer.valueOf("33");
        System.out.println(integer);
        Integer integer1 = Integer.valueOf(22);
        System.out.println(integer1);
        //注意：这里返回的是i1类型
        int i1 = Integer.parseInt("333");
        System.out.println(i1);
    }
}
