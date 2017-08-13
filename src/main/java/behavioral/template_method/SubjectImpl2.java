package behavioral.template_method;

public class SubjectImpl2 extends Subject {
    @Override
    protected void doAction() {
        result = "Impl 2";
    }
}
