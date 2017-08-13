package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class Printer {
    private List<Integer> list = new ArrayList<>();

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public void print(PrintStrategy printStrategy) {
        printStrategy.print(list);
        System.out.println();
    }
}
