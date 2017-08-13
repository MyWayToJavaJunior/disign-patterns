package creational.abstart_factory;

public class Main {
    public static void main(String[] args) {
        Service service1 = new Service(new MySQLDriver());
        service1.getConnection();

        Service service2 = new Service(new PostgreDriver());
        service2.getConnection();
    }
}
