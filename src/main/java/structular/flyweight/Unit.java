package structular.flyweight;

public class Unit {
    private String name;
    private Character character;

    public Unit(String name) {
        this.name = name;
        this.character = Character.DEFAULT;
    }

    public Unit(String name, Character character) {
        this.name = name;
        this.character = character;
    }

    public String getName() {
        return name;
    }

    public Character getCharacter() {
        return character;
    }
}
