package month01.week04.selfCourse;

import org.junit.Test;

import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * System,Runtime类实践
 */
public class Example07 {

    public static void main(String[] args) {
        System.out.println("这是普通打印");
        System.err.println("这是一个错误打印");
//        System.exit(0);
        Properties properties = System.getProperties();
        Set<String> set = properties.stringPropertyNames();
        for(String x:set) {
            System.out.println(x+"\t\t-> "+System.getProperty(x));
        }
    }

    /**
     * Runtime实例
     */
    @Test
    public void test01() {
        Runtime r = Runtime.getRuntime();
        /*
                    8
            126877696
            118814736
            1854930944
         */
        System.out.println(r.availableProcessors());
        System.out.println(r.totalMemory());
        System.out.println(r.freeMemory());
        System.out.println(r.maxMemory());
        try {
            r.exec("notepad");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}