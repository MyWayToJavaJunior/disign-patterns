package behavioral.visitor;

import behavioral.visitor.element.Element1;
import behavioral.visitor.element.Element2;

public class Composite {
    private Element1 element1;
    private Element2[] element2s;

    public Composite(Element1 element1, Element2[] element2s) {
        this.element1 = element1;
        this.element2s = element2s;
    }

    public void doVisitor(Visitor visitor) {
        element1.apply(visitor);
        for (Element2 element2 : element2s) element2.apply(visitor);
    }
}
