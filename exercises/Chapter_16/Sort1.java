package exercises.Chapter_16;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Sort1 {
    public static void main(String[] args) {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        List<String> list = Arrays.asList(suits);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
