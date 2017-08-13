package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Originator originator = new Originator();

        originator.setText("New text");
        caretaker.getMementos().add(originator.save());

        originator.setText("New text2");
        caretaker.getMementos().add(originator.save());

        originator.setText("New text3");
        caretaker.getMementos().add(originator.save());

        originator.setText("New text4");
        caretaker.getMementos().add(originator.save());

        System.out.println(originator.getText());

        originator.undo(caretaker.getMementos().get(1));
        System.out.println(originator.getText());
    }
}
