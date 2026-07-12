package exercises.Chapter_7;

public class SumArray {
    public static void main(String[] args){
        int[] arr = {87,92,25,36,78,99,31,33};
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum:"+sum);
    }
}
