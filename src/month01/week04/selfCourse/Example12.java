package month01.week04.selfCourse;

import month01.week03.ArrayListDemo;

import java.util.ArrayList;
import java.util.Vector;

/**
 * 集合     List（线性表） Set Map（映射）
 * 根根接口Iterator (接口）
 *  父接口 Collection(接口）
 *List 有两个  我用的是util包下的
 * List Set Map都是（接口）
 * List Set 都继承Collection
 * Map是单独的
 *
 * List 的实现类：ArrayList（数组） LinkedList（链表） Vector(向量）
 * ArrayList:单线程 查询修改 数组
 * LinkedList:单线程 插入删除 双链表
 * Vector:多线程 查询修改 数组     单线程不推荐 C++推荐
 *
 * Set 的实现类：HashSet(常用）  TreeSet(排序）  LinkedHashSet(extends HashSet)
 * Map 的实现类HashMap TreeMap LinkedHashMap 和Set的结构是一样的
 *
 * 集合工具类
 * Collections Arrays（数组）
 *
 * 排序的相关接口implements
 * Comparable  Comparator
 */
public class Example12 {
    /**
     *
     * **如果想了解的深刻的话**
     *     **多看源码**
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
        ArrayList实现原理：
        初始化创建空数组：
        第一次添加元素，开始扩充数组容量   默认到10
        扩充算法：
        ->  默认扩充到原来的1又1/2
        建议在构造器中传初始容量，防止多次扩容
         */
        ArrayList arrayList = new ArrayList();
        /*
        Vector 采用动态数组
        默认初始化10个对象容量
        扩充算法（可以在构造器传入增量，否则默认是0）
        增量 = 0 ，扩充到原来的2倍
        增量 != 0,容量加上增量
         */
        Vector<String> vector = new Vector<>();
    }
}