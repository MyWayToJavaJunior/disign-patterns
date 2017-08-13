package structular.facade;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GuavaCollectionFacade implements CollectionFacade {

    @Override
    public <T extends Comparable<T>> void sort(List<T> list) {
        Collections.sort(list);
    }

    @Override
    public <T> Collection<List<T>> permutate(List<T> list) {
        return Collections2.permutations(list);
    }
}
