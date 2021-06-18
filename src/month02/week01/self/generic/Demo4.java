package month02.week01.self.generic;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.junit.Test;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<?>[] arrayLists = new ArrayList<?>[3];
    }
    @Test
    public void test1() {
        ArrayList<String>[] arrlist = new ArrayList[3];
        arrlist[0] = new ArrayList();
//        arrlist[0].add(333);
        for(ArrayList a:arrlist) {
            System.out.println(a);
        }

    }

    @Test
    public void test3() {
        ArrayList<String>[] arr = new ArrayList[3];
        System.out.println(Arrays.toString(arr));
        ArrayList a = new ArrayList();
        a.add(3333);
        arr[0]=a;
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------------------");
    }
    @Test
    public void test32() {
        ArrayList<String>[] arr = new ArrayList/*<String>*/[3];//not allow
        System.out.println(Arrays.toString(arr));
        ArrayList a = new ArrayList();
        arr[0] = a;
        arr[0].add("4444");
        a.add(3333);
        System.out.println(Arrays.toString(arr));
    }
    @Test
    public void test33() {
        List<String>[] lsa = new List[10]; // Not really allowed.
        Object o = lsa;
        Object[] oa = (Object[]) o;
        List<Integer> li = new ArrayList<Integer>();
        li.add(new Integer(3));
        oa[1] = li; // Unsound, but passes run time store check
    }
    /**
     * String 数组
     */
    @Test
    public void test2() {
        String[] strarr = new String[3];
        System.out.println(Arrays.toString(strarr));
        for(String s:strarr) {
            System.out.println(s);
        }
        System.out.println("--------------------");
        ArrayList[] arrlist = new ArrayList[3];
        System.out.println(Arrays.toString(arrlist));
        arrlist[0]= new ArrayList();
        arrlist[1] = new ArrayList();
        arrlist[2] = new ArrayList();
        System.out.println(Arrays.toString(arrlist));
    }
}
