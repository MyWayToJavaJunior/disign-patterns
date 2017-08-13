package creational.abstart_factory;

public class MySQLDriver implements Driver {
    @Override
    public void getConnection() {
        System.out.println("MySQL connection");
    }
}
