package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.register(new Flower());
        subject.register((event -> {
            switch (event) {
                case SUNSET:
                    System.out.println("Wolfs gonna hunt!");
                    break;
                case SUNRISE:
                    System.out.println("Wolfs sleep");
                    break;
            }
        }));

        subject.notify(Event.SUNRISE);
        subject.notify(Event.SUNSET);
        subject.notify(Event.SUNRISE);
        subject.notify(Event.SUNSET);
        subject.notify(Event.SUNRISE);
        subject.notify(Event.SUNSET);
    }
}
