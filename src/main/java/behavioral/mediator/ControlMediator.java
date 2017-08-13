package behavioral.mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ControlMediator {
    private Map<Dron, Coordinate> field = new ConcurrentHashMap<>();

    public boolean move(Dron dron, Coordinate delta) {
        Coordinate coordinate = new Coordinate(field.get(dron), delta);
        if (!field.containsValue(coordinate)) {
            field.remove(dron);
            field.put(dron, coordinate);
            return true;
        }
        return false;
    }

    public boolean add(Dron dron, Coordinate coordinate) {
        if (!field.containsValue(coordinate)) {
            field.remove(dron);
            field.put(dron, coordinate);
            return true;
        }
        return false;
    }

    public Map<Dron, Coordinate> getField() {
        return field;
    }

    public void print() {
        String[][] arr = new String[4][4];
        field.forEach((dron, coord) -> {
            arr[coord.getX()][coord.getY()] = dron.getName();
        });

        for (String[] s1 : arr) {
            for (String s2 : s1) {
                if (s2 == null) System.out.print(".");
                else System.out.print(s2);
            }
            System.out.println();
        }

        System.out.println();
    }
}
