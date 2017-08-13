package behavioral.iterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Collection implements Iterable<Integer> {
    private Integer[] arr = new Integer[20];
    private int length = 0;

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int cur = -1;

            @Override
            public boolean hasNext() {
                return cur < (length - 1);
            }

            @Override
            public Integer next() {
                return arr[++cur];
            }
        };
    }

    @Override
    public void forEach(Consumer<? super Integer> consumer) {

    }

    @Override
    public Spliterator<Integer> spliterator() {
        return null;
    }
}
