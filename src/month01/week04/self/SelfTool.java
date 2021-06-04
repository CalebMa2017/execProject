package month01.week04.self;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.Base64;

/**
 * 工具类
 */
public class SelfTool {
    static DecimalFormat df ;
    public static String roundInt(double d) {
        df = new DecimalFormat("#");
        String format = df.format(d);
        return format;
    }
    public static String round02(double d) {
        df = new DecimalFormat("###.####");
        return df.format(d);
    }
    public static String round03(double d) {
        df = new DecimalFormat("000.00000");
        return df.format(d);
    }
    public static String round04(BigDecimal decimal){
        df = new DecimalFormat("#####.#############");
        return df.format(decimal);

    }
    public static String round05(BigDecimal decimal) {
        df = new DecimalFormat("#####.####%");
        return df.format(decimal);
    }
    /**
     * md5加密
     */
    public static String md5calculate(String str) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("md5");
            return Base64.getEncoder().encodeToString(md5.digest(str.getBytes(StandardCharsets.UTF_8)));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
