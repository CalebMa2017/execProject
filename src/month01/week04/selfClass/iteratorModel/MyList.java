package month01.week04.selfClass.iteratorModel;

public interface MyList<E> {
    /**
     * 返回List长度
     * @return
     */
    int size();

    /**
     * 添加元素
     * @param e
     * @return
     */
    boolean add(E e) ;

    /**
     * 通过索引获取元素
     * @param index
     * @return
     */
    E get(int index);

    /**
     * 返回迭代器
     * @return
     */
    MyIterator<E> iterator();
}
