package month01.week03;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * MD5加密
 */
public class Course_MD5 {

    public static void main(String[] args) {
        String dest = "sfweofjewojfewojf";

    }
}
class Tool{
    public static String getMD5str(String dest) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            String s = Base64.getEncoder().encodeToString(md5.digest(dest.getBytes(StandardCharsets.UTF_8)));
            System.out.println(s);
            return s;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}