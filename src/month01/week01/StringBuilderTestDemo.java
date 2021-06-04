package month01.week01;

public class StringBuilderTestDemo {

    public static void main(String[] args) {
        testFn01();
        System.out.println("--------");
        testFn02();
    }
    public static void testFn01() {
        StringBuilder sb = new StringBuilder("111");
        System.out.println(sb);
        sb.append("我");
        sb.append("喜欢");
        sb.append("你");
        sb.append("222").append("333").append("4");
        System.out.println(sb);
        sb.insert(0,0).insert(0,0);
        System.out.println(sb);
        sb.delete(0,3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.deleteCharAt(sb.length()-1).deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
    public static void testFn02() {
        String str="";
        StringBuilder sb = new StringBuilder();
        long l = Runtime.getRuntime().freeMemory();
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 500; i++) {
            sb.append("8");
        }
        long ll = Runtime.getRuntime().freeMemory();
        long time2 = System.currentTimeMillis();
        System.out.println("内存占用了"+(l-ll));
        System.out.println("耗时"+(time2-time1)+"ms");
    }
    public static void testFn03() {
        StringBuffer sbf = new StringBuffer();
    }
}
