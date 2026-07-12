package exercises.Chapter_17;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Arrays;

public class ArraysAndStreams2 {
    public static void main(String[] args) {
        String[] strings = {"red","blue","Yellow","green","Blue","indigo"};
        System.out.println("Original strings:"+ Arrays.asList(strings));
        System.out.println("Strings in uppercase:"+Arrays.stream(strings).map(String::toUpperCase).collect(Collectors.toList()));
        System.out.println("Strings less than n sorted ascending:"+Arrays.stream(strings).filter(s->s.compareToIgnoreCase("n")<0).sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList()));
    }
}
