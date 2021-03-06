package behavioral.visitor.service;

import behavioral.visitor.Visitor;
import behavioral.visitor.element.Element1;
import behavioral.visitor.element.Element2;

public class Service2 implements Visitor {
    @Override
    public void visit(Element1 element1) {
        System.out.println("Apply element1");
    }

    @Override
    public void visit(Element2 element2) {
        System.out.println("Apply element2");
    }
}
