package creational.abstart_factory;

public class Service {
    private final Driver driver;

    public Service(Driver driver) {
        this.driver = driver;
    }

    public void getConnection() {
        driver.getConnection();
    }
}
