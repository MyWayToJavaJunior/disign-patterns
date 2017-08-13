package behavioral.chain_of_responsibility;

public class HeaderHandler implements Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handle(String text) {
        System.out.println("Hello!");
        System.out.println();

        if (next != null) next.handle(text);
    }
}
