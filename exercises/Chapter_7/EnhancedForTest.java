package exercises.Chapter_7;

public class EnhancedForTest {
    public static void main(String[] args){
        int[] arr ={12,17,21,44,56,123,99,21,27};
        int sum=0;
        for (int x:arr){
            sum+=x;
        }
        System.out.println("Sum:"+sum);
    }
}
