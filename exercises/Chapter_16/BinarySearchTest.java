package exercises.Chapter_16;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
        String[] colors = {"red","white","blue","black","yellow","tan","purple","pink"};
        List<String> list = new ArrayList<>(Arrays.asList(colors));
        Collections.sort(list);
        System.out.println("Sorted list:"+list);
        printSearchResults(list,"black");
        printSearchResults(list,"yello");
        printSearchResults(list,"pink");
    }
    public static void printSearchResults(List<String> list,String key){
        int result = Collections.binarySearch(list,key);
        if (result>=0){
            System.out.println("Found at index "+result);
        }
        else {
            System.out.println("Not found.");
        }
    }
}
