package month01.week04.selfClass;

import java.util.*;

/**
 * 集合：Collection Map接口
 */
public class Example01 {

    public static void main(String[] args) {
        collectionWork();
    }

    /**
     * Collection接口
     */
    public static void collectionWork() {
        System.out.println("------------Collection----------------");
        listWork();
        setWork();
    }

    /**
     * List接口
     */
    public static void listWork() {
        System.out.println("----------------List--------------------");
        //ArrayList
        List<String> list = new ArrayList();
        list.add("hhhh");
        list.add("ieobi");
        list.add("3ifoie");
        list.add("8eree8");
        list.add("34ien");
        Iterator<String> listiter = list.iterator();
        while (listiter.hasNext()){
            System.out.print(listiter.next()+" ");
        }
        System.out.println();
        //LinkedList
        LinkedList<String> linkedList = new LinkedList();
        //Vector
        Vector<Integer> vector = new Vector<>();
    }
    /**
     * Set接口
     */
    public static void setWork() {
        System.out.println("------------------Set--------------------");
        //HashSet:底层HashMap  无序
        Set<String> set1 = new HashSet<>();

        //TreeSet：（二叉树）自动排序：按自然顺序查询
        Set<String> set2 = new TreeSet<>();

        //LinkedHashSet: 按照存储顺序查询
        Set<Integer> set3 = new LinkedHashSet<>();
    }

    /**
     * Map接口
     */
    public static void mapWork() {

    }
}
