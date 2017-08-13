package structular.adapter;

public class LegacyPrinterImpl implements LegacyPrinter {
    @Override
    public void print() {
        System.out.println("Old text");
    }
}
