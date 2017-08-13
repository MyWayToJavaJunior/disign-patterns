package behavioral.chain_of_responsibility;

public class BodyHandler implements Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handle(String text) {
        System.out.println(text);

        if (next != null) next.handle(text);
    }
}
