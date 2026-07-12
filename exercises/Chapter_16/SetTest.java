package exercises.Chapter_16;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        String[] colors = {"Red","Blue","Blue","White","Yellow","Red"};
        List<String> list = Arrays.asList(colors);
        System.out.println("List:"+list);
        printNonDuplicates(list);
    }
    public static void printNonDuplicates(Collection<String> values){
        Set<String> set = new HashSet<>(values);
        System.out.println("Nonduplicated values are:"+set);
    }
}
