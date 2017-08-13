package behavioral.template_method;

public abstract class Subject {
    protected String result;

    public void getResult() {
        System.out.println(result);
    }

    protected abstract void doAction();
}
