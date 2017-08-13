package creational.prototype;

public class Subject implements Cloneable {
    private String str;

    protected Subject clone() throws CloneNotSupportedException {
        return (Subject) super.clone();
    }
}
