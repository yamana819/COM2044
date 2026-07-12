package exercises.Chapter_16;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethods {
    public static void main(String[] args) {
        List<String> list = List.of("red","blue","green","yellow");
        Set<String> set = Set.of("red","blue","green","yellow");
        Map<String,Integer> map = Map.of("Red",1,"Blue",2,"Yellow",3);
        Map<String,Integer> mapOfEntries = Map.ofEntries(Map.entry("Red",1),Map.entry("Blue",2));
        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
        System.out.println(mapOfEntries);
    }
}
