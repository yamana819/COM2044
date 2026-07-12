package exercises.Chapter_20;

public class MaximumTest {
    public static void main(String[] args) {
        System.out.println(maximum(3,21,332));
        System.out.println(maximum("abc","abd","abe"));
        System.out.println(maximum(3.1,23.2,44.36));
    }
    public static <T extends Comparable<T>> T maximum(T x,T y,T z){
        T max = x;
        if (y.compareTo(max)>0){
            max=y;
        }
        if (z.compareTo(max)>0){
            max=z;
        }
        return max;
    }
}
