package exercises.Chapter_7;
import java.util.Arrays;

public class ArrayManinpulations {
    public static void main(String[] args) {
        double[] array = {12.0,32.1,23.42,17.56,43.42};
        Arrays.sort(array);
        for (double x:array){
            System.out.print(x+" ");
        }
        System.out.println();
        int[] array1=new int[10];
        Arrays.fill(array1,7);
        for (int x:array1){
            System.out.print(x+" ");
        }
        System.out.println();
        int[] array3={1,2,3,4,5};
        int[] arrayCopy=new int[array3.length];
        System.arraycopy(array3,0,arrayCopy,0,array3.length);
        for (int x:array3){
            System.out.print(x+" ");
        }
        System.out.println();
        for (int x:arrayCopy){
            System.out.print(x+" ");
        }
        System.out.println();
        boolean b = Arrays.equals(array3,arrayCopy);
        boolean b1 = Arrays.equals(array1,array3);
        System.out.printf("Array3 and arrayCopy are %s\n",b ? "equal":"not equal");
        System.out.printf("Array1 and array3 are %s\n",b1 ? "equal":"not equal");
        int location = Arrays.binarySearch(array3,3);
        if (location>0)System.out.println("Number 3 appears in array3 at position "+location);
        else System.out.println("Number 3 does not appear in array3");
    }
}
