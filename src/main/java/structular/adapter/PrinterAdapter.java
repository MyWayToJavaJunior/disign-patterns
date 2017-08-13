package structular.adapter;

public class PrinterAdapter implements NewPrinter {
    private LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void out(String str) {
        System.out.print("Description: " + str + " - ");
        legacyPrinter.print();
    }
}
