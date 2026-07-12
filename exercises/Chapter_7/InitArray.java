package exercises.Chapter_7;

public class InitArray {
    public static void main(String[] args){
        int[] array = new int[10];
        final int ARRAY_LENGTH=10;
        for (int i=0;i<array.length;i++){
            System.out.println("Index:"+i+" Element:"+array[i]);
        }
        System.out.println();
        int[] array1={10,23,41,77,21,44,92,105};
        for (int i=0;i<array1.length;i++) {
            System.out.println("Index:" + i + " Element:" + array1[i]);
        }
        System.out.println();
        int[] array2=new int[ARRAY_LENGTH];
        for (int i=0;i<array2.length;i++){
            array2[i] = 2*i+2;
        }
        for (int i=0;i<array2.length;i++){
            System.out.println("Index:" + i + " Element:" + array2[i]);
        }
    }
}
