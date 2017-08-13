package creational.object_pool;

public class Main {
    public static void main(String[] args) {
        PoolFactory factory = new PoolFactory();

        Connection con1 = factory.get();
        Connection con2 = factory.get();
        Connection con3 = factory.get();

        con1.connect();
        con2.connect();
        con3.connect();

        con1.close();
        con3.close();

        Connection con4 = factory.get();
        Connection con5 = factory.get();

        con4.connect();
        con5.connect();

        Connection con6 = factory.get();

        con6.connect();
    }
}
