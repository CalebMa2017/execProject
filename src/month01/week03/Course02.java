package month01.week03;

import org.junit.Test;

import java.util.Arrays;

/**
 * 课堂练习
 */
public class Course02 {

    public static void main(String[] args) throws Exception{
        try {
//            System.exit(0);
            throw new Exception("抛出了异常");
        } finally {
            System.out.println("进行了处理");
        }
    }
    @Test
    public void test01 () {
        String s1 = new String("22");
        String s2 ="22";
        System.out.println(s1==s2);
    }

    /**
     * 字符串共同的字符
     */
    @Test
    public void test02() {
        String s1 = "iiiiifenofn222293";
        String s2 = "ii3iisdiodf9222222929";
        char[] chars = s1.toCharArray();
        Arrays.sort(chars);
        char c=chars[0];
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            if (c==chars[i]&&i!=0) {
                continue;
            }
            c = chars[i];
            int ind = s2.indexOf(c);
            if(ind!=-1) {
                result= result+c;
            }
        }
        System.out.println(result);
    }
}
