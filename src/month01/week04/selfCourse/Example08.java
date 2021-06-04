package month01.week04.selfCourse;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 数字处理：
 * BigDecimal
 * BigInteger
 */
public class Example08 {

    public static void main(String[] args) {
        Integer i = 234324832;
        BigInteger bi = new BigInteger("387432891579310572175832917532915739821");
        System.out.println(bi);
        BigInteger bi2 = new BigInteger("3333333333333333333333333");
        //加法
        System.out.println(bi.add(bi2));
        //乘法
        System.out.println(bi.multiply(bi2));
        /*
        大浮点数
         */
        System.out.println("大浮点数");
        double d = 58903217590235173289150321320156327.3593128517023957239332910372189573290517329175239875329732947329842343242374983274927349823423;
        System.out.println(d);
        BigDecimal bd1 = new BigDecimal("58903217590235173289150321320156327.3593128517023957239332910372189573290517329175239875329732947329842343242374983274927349823423");
        System.out.println(bd1);
        BigDecimal bd2 = new BigDecimal("327859320157928357328195027598327519375.328940721358239057328974237492374329874983");
        //减法
        System.out.println("subtract-----------");
        BigDecimal subtract;
        System.out.println( subtract = bd2.subtract(bd1));
        System.out.println(subtract);
        System.out.println(bd1.subtract(bd2));
        //除法

        {
            BigDecimal bd3 = new BigDecimal("33.33");
            BigDecimal bd4 = new BigDecimal("11.11");
            System.out.println(bd3.divide(bd4));
            System.out.println(bd4.divide(bd3));
        }
    }

}

