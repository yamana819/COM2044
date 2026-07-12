package exercises.Chapter_20;

public class GenericMethodTest {
    public static void main(String[] args){
        Integer[] integers = {12,15,21,35,123};
        String[] strings = {"Zekeriya","Furkan","Ahmet","Kerem"};
        Double[] doubles = {12.2,123.5,92.6,55.42};
        printArray(integers);
        printArray(doubles);
        printArray(strings);
    }
    public static <T> void printArray(T[] arr){
        for (T element:arr){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }
}
