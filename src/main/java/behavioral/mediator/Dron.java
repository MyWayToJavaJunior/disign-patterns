package behavioral.mediator;

public class Dron {
    private ControlMediator control;
    private String name;

    public Dron(ControlMediator control, String name, Coordinate coordinate) {
        this.control = control;
        this.name = name;

        if (!this.control.add(this, coordinate)) throw new RuntimeException();
    }

    public void move(Coordinate goal) throws InterruptedException {
        while(!control.getField().get(this).compare(goal)) {
            Coordinate cur = control.getField().get(this);
            Coordinate next = cur.getVector(goal);
            Thread.sleep(1000);

            if (control.move(this, next)) ;
            else if (control.move(this, next.x(0))) ;
            else if (control.move(this, next.y(0))) ;
        }
        System.out.println(name + " finish");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
