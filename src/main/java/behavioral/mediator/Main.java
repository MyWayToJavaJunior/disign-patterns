package behavioral.mediator;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ControlMediator controlMediator = new ControlMediator();

        Dron a = new Dron(controlMediator, "A", new Coordinate(1, 1));
        Dron b = new Dron(controlMediator, "B", new Coordinate(1, 2));
        Dron c = new Dron(controlMediator, "C", new Coordinate(2, 2));

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                controlMediator.print();
            }
        }, 0, 500);

        a.move(new Coordinate(1, 3));
        b.move(new Coordinate(3, 3));
        c.move(new Coordinate(2, 3));
    }
}
