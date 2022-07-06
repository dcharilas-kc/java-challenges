package part2;

import java.util.Map;
import java.util.TreeMap;

public class TreePut {

    public static void main(String args[]) {
        Map map = new TreeMap();
        map.put("test key 1", "test value 1");
        map.put("test key 2", "test value 2");
        map.put("test key 3", "test value 3");

        System.out.println(map.put("test key 3", "test value 3"));
        System.out.println(map.put("test key 4", "test value 4"));
    }
}
