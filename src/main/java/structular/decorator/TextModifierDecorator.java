package structular.decorator;

public abstract class TextModifierDecorator implements TextModifier {
    private final TextModifier modifier;

    public TextModifierDecorator(TextModifier modifier) {
        this.modifier = modifier;
    }

    @Override
    public abstract String[] modify(String[] arr);

    @Override
    public void print(String str) {
        StringBuilder builder = new StringBuilder();
        for (String s : modify(modifier.modify(str.split(" ")))) builder.append(s);

        System.out.println(builder);
    }
}
