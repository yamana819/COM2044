package exercises.Chapter_7;

public class PassArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8};
        System.out.print("Elements of array before modifying the array:");
        for (int x:array){
            System.out.print(x+" ");
        }
        System.out.println();
        modifyArray(array);
        System.out.print("Elements of array after modifying the array.");
        for (int x:array){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.print("Elements of array before modifying the element:");
        for (int x:array){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.print("Elements of array after modifying element.");
        modifyElement(array[3]);
        for (int x:array){
            System.out.print(x+" ");
        }
    }
    public static void modifyArray(int[] arr){
        for (int x=0;x<arr.length;x++){
            arr[x]*=2;
        }
    }
    public static void modifyElement(int element){
        element*=2;
        System.out.println("\nThe value of element in modifyElement:"+element);
    }
}
