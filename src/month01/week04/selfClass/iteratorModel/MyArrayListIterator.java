package month01.week04.selfClass.iteratorModel;

public class MyArrayListIterator<E> implements MyIterator<E>{
   private MyArrayList<E> mal;

    public MyArrayListIterator() {
    }

    public MyArrayListIterator(MyArrayList<E> mal) {
        this.mal = mal;
    }

    @Override
    public boolean hasNext() {

        return false;
    }

    @Override
    public E next() {
        return null;
    }
}
