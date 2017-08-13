package structular.facade;

import com.google.common.base.Predicate;

import java.util.Collection;
import java.util.List;

public interface CollectionFacade {
    <T extends Comparable<T>> void sort(List<T> list);
    <T> Collection<List<T>> permutate(List<T> list);
}
