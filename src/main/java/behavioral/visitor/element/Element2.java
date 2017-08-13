package behavioral.visitor.element;

import behavioral.visitor.CompositeElement;
import behavioral.visitor.Visitor;

public class Element2 implements CompositeElement {
    @Override
    public void apply(Visitor visitor) {
        visitor.visit(this);
    }
}
