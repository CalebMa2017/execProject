package month01.week04.selfCourse;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Scanner;

/**
 * MD5加密算法
 */
public class Example10 {

    public static void main(String[] args) {
        MessageDigest md5=null;
        try {
            md5  = MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        /*
        输入用户的密码
         */
        Scanner sc = new Scanner(System.in);
        //注意next方法不会读入空格，（但会读入回车吗）
        String pwd = sc.next();
        System.out.println("待加密的password为："+pwd);
        pwd+="      ";
        System.out.println(pwd.length());
        String md5String = Base64.getEncoder().encodeToString(md5.digest(pwd.getBytes()));
        System.out.println("加密后的密码为   "+md5String);

        /*
        注意空格也算字符串
         */
        /*
        待加密的password为：Technology520
        加密后的密码为   Aw5XrFIUxXt+JPQETKoq/A==
         */
    }
}
