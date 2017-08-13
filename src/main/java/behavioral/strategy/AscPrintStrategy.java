package behavioral.strategy;

import java.util.List;

public class AscPrintStrategy implements PrintStrategy {
    public void print(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + " ");
    }
}
