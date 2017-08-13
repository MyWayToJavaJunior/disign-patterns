package behavioral.visitor;

import behavioral.visitor.element.Element1;
import behavioral.visitor.element.Element2;

public interface Visitor {
    void visit(Element1 element1);
    void visit(Element2 element2);
}
