package behavioral.chain_of_responsibility;

public class FooterHandler implements Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handle(String text) {
        System.out.println();
        System.out.println("With best wishes");

        if (next != null) next.handle(text);
    }
}
