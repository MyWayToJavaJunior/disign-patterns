package behavioral.chain_of_responsibility;

public class PostfixHandler implements Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handle(String text) {
        System.out.println("Ivanov Danil");

        if (next != null) next.handle(text);
    }
}
