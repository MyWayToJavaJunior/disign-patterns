package creational.object_pool;

public class ConnectionImpl implements Connection {
    private long time;

    public ConnectionImpl() {
        this.time = System.nanoTime();
    }

    @Override
    public void connect() {
        System.out.println("connect with " + time);
    }

    @Override
    public void close() {
        System.out.println("close " + time);
    }
}
