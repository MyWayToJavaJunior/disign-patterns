package structular.adapter;

public class Main {
    public static void main(String[] args) {
        NewPrinter printer = new PrinterAdapter(new LegacyPrinterImpl());
        printer.out("hello");
        printer.out("world");
    }
}
