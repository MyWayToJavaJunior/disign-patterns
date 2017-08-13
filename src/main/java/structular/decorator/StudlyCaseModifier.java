package structular.decorator;

public class StudlyCaseModifier extends TextModifierDecorator {
    public StudlyCaseModifier(TextModifier modifier) {
        super(modifier);
    }

    @Override
    public String[] modify(String[] arr) {
        String[] results = new String[arr.length];
        int i = 0;
        for (String s : arr) {
            char[] ch = s.toCharArray();
            results[i++] = String.valueOf(ch[0]).toUpperCase() + s.substring(1, s.length()).toLowerCase();
        }

        return results;
    }
}
