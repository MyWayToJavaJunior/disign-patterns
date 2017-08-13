package structular.decorator;

public class DotCaseModifier extends TextModifierDecorator {
    public DotCaseModifier(TextModifier modifier) {
        super(modifier);
    }

    @Override
    public String[] modify(String[] arr) {
        String[] results = new String[2 * arr.length - 1];

        results[0] = arr[0];
        int j = 1;
        for (int i = 1; i < arr.length; i++) {
            results[j++] = ".";
            results[j++] = arr[i];
        }

        return results;
    }
}
