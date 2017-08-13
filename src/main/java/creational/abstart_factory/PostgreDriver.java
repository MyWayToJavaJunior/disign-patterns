package creational.abstart_factory;

public class PostgreDriver implements Driver {
    @Override
    public void getConnection() {
        System.out.println("PostgreSQL connection");
    }
}
