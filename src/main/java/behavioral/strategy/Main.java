package behavioral.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.setList(Arrays.asList(1, 2, 3, 4, 5));

        printer.print(new AscPrintStrategy());
        printer.print(new DescPrintStrategy());
    }
}
