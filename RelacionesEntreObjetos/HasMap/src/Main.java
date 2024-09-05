
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("Uno", 1);
        linkedMap.put("Dos", 2);
        linkedMap.put("Tres", 3);

        System.out.println(linkedMap);
    }
}