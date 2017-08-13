package structular.decorator;

public class TextModifierImpl implements TextModifier {
    @Override
    public String[] modify(String[] arr) {
        return arr;
    }

    @Override
    public void print(String str) {
        System.out.println(str);
    }
}
