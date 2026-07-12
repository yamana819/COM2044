package exercises.Chapter_17;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class ArraysAndStreams {
    public static void main(String[] args) {
        Integer[] values = {2,9,0,5,3,7,1,4,8,6};
        System.out.print("Original values:"+Arrays.asList(values));
        System.out.println();
        System.out.println("Values in sorted order:"+Arrays.stream(values).sorted().collect(Collectors.toList()));
        List<Integer> greaterThan4=Arrays.stream(values).filter(value->value>4).collect(Collectors.toList());
        System.out.println("Values greater than 4:"+greaterThan4);
        System.out.println("Values greater than 4 in sorted order:"+Arrays.stream(values).filter(value->value>4).sorted().collect(Collectors.toList()));
        System.out.println("Values greater than 4 in sorted (streams):"+greaterThan4.stream().sorted().collect(Collectors.toList()));
    }
}
