package structular.proxy;

public class Proxy implements Subject {
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void doAction() {
        System.out.println(subject + " doAction");
        subject.doAction();
    }
}
