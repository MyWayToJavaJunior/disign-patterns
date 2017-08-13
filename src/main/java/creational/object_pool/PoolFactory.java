package creational.object_pool;

import java.util.LinkedList;
import java.util.Queue;

public class PoolFactory {
    Queue<Pool> pool = new LinkedList<>();

    public Pool get() {
        if (pool.isEmpty()) pool.add(new Pool());
        return pool.poll();
    }


    class Pool implements Connection {
        Connection connection = new ConnectionImpl();

        @Override
        public void connect() {
            connection.connect();
        }

        @Override
        public void close() {
            pool.add(this);
        }
    }
}
