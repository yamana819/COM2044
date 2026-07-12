package exercises.Chapter_16;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
    public static void main(String[] args) {
        String[] colors = {"Red","Blue","Blue","White","Yellow","Red","Green"};
        SortedSet<String> set = new TreeSet<>(Arrays.asList(colors));
        System.out.println("Sorted set:"+set);
        System.out.println("Head set:"+set.headSet("Red"));
        System.out.println("Tail set:"+set.tailSet("Red"));
        System.out.println(set.first());
        System.out.println(set.last());
    }
}
