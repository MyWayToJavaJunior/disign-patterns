package structular.decorator;

public class Main {
    public static void main(String[] args) {
        String test = "somE Test tEXt";

        new TextModifierImpl().print(test);
        new StudlyCaseModifier(new TextModifierImpl()).print(test);
        new SnackCaseModifier(new UpperCaseModifier(new TextModifierImpl())).print(test);
        new DotCaseModifier(new LowerCaseModifier(new TextModifierImpl())).print(test);
        new SpaceCaseModifier(new StudlyCaseModifier(new TextModifierImpl())).print(test);
    }
}
