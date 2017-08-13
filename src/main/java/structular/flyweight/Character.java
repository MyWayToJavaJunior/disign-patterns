package structular.flyweight;

public class Character {
    public static final Character DEFAULT = new Character();

    private int might = 50;
    private int vitality = 100;
    private int magic = 5;

    public Character() {
    }

    public Character(int might, int vitality, int magic) {
        this.might = might;
        this.vitality = vitality;
        this.magic = magic;
    }

    public int getMight() {
        return might;
    }

    public int getVitality() {
        return vitality;
    }

    public int getMagic() {
        return magic;
    }
}
