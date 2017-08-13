package structular.composite;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ElementHolder {
    private List<ElementImpl> list = new ArrayList<>();

    public List<ElementImpl> getList() {
        return list;
    }

    public void print() {
        list.sort(new Comparator<ElementImpl>() {
            @Override
            public int compare(ElementImpl element, ElementImpl t1) {
                return Integer.compare(element.getPosition(), t1.getPosition());
            }
        });

        int i = 0;
        for (ElementImpl el : list) {
            el.setPosition(i);
            i += 10;
        }

        for (Element el : list) System.out.print(el + " ");
        System.out.println();
    }
}
