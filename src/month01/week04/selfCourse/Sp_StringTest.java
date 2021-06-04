package month01.week04.selfCourse;

/**
 * 字符串拼接
 */
public class Sp_StringTest {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aa").append("bb").append("cc");
        System.out.println(sb);
        sb.insert(0,"ttt").insert(0,"kkk");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        /*删除操作
        尾索引可以越界，首索引不能越界*/
        sb.delete(0,30);
//        sb.delete(-1,30);
        sb.append("0");
        System.out.println(sb);
    }
}
