package exercises.Chapter_17;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.Arrays;

public class InStreamOperations {
    public static void main(String[] args) {
        int[] values = {3,10,6,1,4,8,2,5,9,7};
        IntPredicate even = value-> value%2==0;
        IntPredicate greaterThan5 = value -> value>5;
        System.out.print("Original values:");
        IntStream.of(values).forEach(value->System.out.print(value+" "));
        System.out.println();
        System.out.println("Count"+IntStream.of(values).count());
        System.out.println("Max:"+IntStream.of(values).max().getAsInt());
        System.out.println("Min"+IntStream.of(values).min().getAsInt());
        System.out.println("Sum:"+IntStream.of(values).sum());
        System.out.println("Average:"+IntStream.of(values).average().getAsDouble());
        System.out.println("Sum via lambda method:"+IntStream.of(values).reduce(0,(x,y)->x+y));
        System.out.println("Sum of squares via reduce method:"+IntStream.of(values).reduce(0,(x,y)->x+y*y));
        System.out.print("Even values displayed on sorted order:");
        IntStream.of(values).filter(value->value%2==0).sorted().forEach(value->System.out.print(value+" "));
        System.out.println();
        IntStream.of(values).filter(even.and(greaterThan5)).sorted().forEach(value-> System.out.print(value+" "));
        System.out.println();
        System.out.println(IntStream.range(1,10).sum());
        IntStream.of(values).filter(value->value%2==0).map(value->value*10).sorted().forEach(value->System.out.print(value+" "));
    }
}
