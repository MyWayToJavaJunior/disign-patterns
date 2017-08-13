package behavioral.template_method;

public class SubjectImpl1 extends Subject {
    @Override
    protected void doAction() {
        result = "Impl 1";
    }
}
