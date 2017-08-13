package structular.composite;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ElementHolder holder = new ElementHolder();
        ElementImpl a = new ElementImpl("A", 10);
        ElementImpl b = new ElementImpl("B", 20);
        ElementImpl c = new ElementImpl("C", 30);
        ElementImpl d = new ElementImpl("D", 40);
        ElementImpl e = new ElementImpl("E", 50);
        ElementImpl f = new ElementImpl("F", 60);
        holder.getList().addAll(Arrays.asList(a, b, c, d, e, f));

        holder.print();

        e.move(55);
        c.move(25);
        holder.print();

        new ElementComposite(Arrays.asList(b, f, d)).move(35);
        holder.print();
    }
}
