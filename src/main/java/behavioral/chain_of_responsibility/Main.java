package behavioral.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Handler handler1 = new HeaderHandler();
        Handler handler2 = new BodyHandler();
        Handler handler3 = new FooterHandler();
        Handler handler4 = new PostfixHandler();

        handler2.handle("Everything is OK! Thanks.");

        System.out.println("--------------------------------");

        handler2.setNext(handler3);
        handler1.setNext(handler2);
        handler1.handle("Everything is OK! Thanks.");

        System.out.println("--------------------------------");

        handler3.setNext(handler4);
        handler1.handle("Everything is OK! Thanks.");
    }
}
