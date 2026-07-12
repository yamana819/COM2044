package exercises.Chapter_7;

public class ArrayArgs {
    public static void main(String[] args) {
        if (args.length!=3){
            System.out.println("Error:Please re-enter the entire command including array size initial value and increment.");
        }
        else {
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];
            int initialValue=Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);
            for (int i=0;i<array.length;i++){
                array[i]=initialValue+i*increment;
            }
            for (int x:array){
                System.out.print(x+" ");
            }
        }
    }
}
