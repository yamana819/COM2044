package exercises.Chapter_16;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms2 {
    public static void main(String[] args) {
        String[] colors = {"red","blue","white","brown","yellow","green"};
        List<String> list = Arrays.asList(colors);
        ArrayList<String> list2= new ArrayList<>();
        list2.add("black");
        list2.add("yellow");
        list2.add("purple");
        System.out.println("Before add all:"+list2);
        Collections.addAll(list2,colors);
        System.out.println("After add all:"+list2);
        int frequency=Collections.frequency(list2,"yellow");
        System.out.println("Frequency of yellow is :"+frequency);
        boolean disjoint = Collections.disjoint(list2,list);
        System.out.printf("The list and list2 %s elements in common",disjoint?"do not have":"have");
    }
}
