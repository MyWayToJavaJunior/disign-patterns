package behavioral.strategy;

import java.util.List;

public class DescPrintStrategy implements PrintStrategy {
    public void print(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) System.out.print(list.get(i) + " ");
    }
}
