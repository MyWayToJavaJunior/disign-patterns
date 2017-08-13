package structular.decorator;

public class LowerCaseModifier extends TextModifierDecorator {
    public LowerCaseModifier(TextModifier modifier) {
        super(modifier);
    }

    @Override
    public String[] modify(String[] arr) {
        String[] results = new String[arr.length];
        int i = 0;
        for (String s : arr) results[i++] = s.toLowerCase();

        return results;
    }
}
