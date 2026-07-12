package exercises.Chapter_17;
import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args) {
        System.out.print("Sum of 1 through 10 is:"+IntStream.rangeClosed(1,10).sum());
        System.out.println();
        System.out.print("Sum of the even ints from 2 trough 20 is:"+IntStream.rangeClosed(1,10).map((int x)->{return x*2;}).sum());
        System.out.println();
        System.out.print("Sum of the triples of even ints from 2 through 10 is:"+IntStream.rangeClosed(1,10).filter(x->x%2==0).map(x->x*3).sum());
    }
}
