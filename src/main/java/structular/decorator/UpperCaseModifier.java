package structular.decorator;

public class UpperCaseModifier extends TextModifierDecorator {
    public UpperCaseModifier(TextModifier modifier) {
        super(modifier);
    }

    @Override
    public String[] modify(String[] arr) {
        String[] results = new String[arr.length];
        int i = 0;
        for (String s : arr) results[i++] = s.toUpperCase();

        return results;
    }
}
