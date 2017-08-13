package creational.sigleton;

public class Singleton {
    private static Singleton instance;
    private String message;

    private Singleton() {}

    public Singleton instance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
