package month01.week04.selfCourse;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * 数字格式化
 */
public class Example09 {

    public static void main(String[] args) {
        double d = 8359375.334832;
        BigDecimal bd = new BigDecimal("9304384.3478932047329847");
        System.out.println(new DecimalFormat("##.###").format(d));
        System.out.println(new DecimalFormat("0.0000").format(bd));
    }
}
