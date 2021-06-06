package month01.week04.selfClass.iteratorModel;

public interface MyIterator<E> {
    /**
     * 是否含有下一个元素
     * @return
     */
    boolean hasNext();

    /**
     * 返回下一个元素光标下移
     * @return
     */
    E next();


}
