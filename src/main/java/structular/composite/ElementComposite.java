package structular.composite;

import java.util.ArrayList;
import java.util.List;

public class ElementComposite implements Element {
    private List<Element> list = new ArrayList<>();

    public ElementComposite(List<Element> list) {
        this.list = list;
    }

    @Override
    public void move(int position) {
        for (Element el : list) el.move(position);
    }
}
