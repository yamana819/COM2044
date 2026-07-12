package exercises.Chapter_16;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Sort2 {
    public static void main(String[] args) {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        List<String> list = Arrays.asList(suits);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
