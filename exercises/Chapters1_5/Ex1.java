package exercises.Chapters1_5;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int int1,int2,sum;
        System.out.print("Enter first integer:");
        int1=input.nextInt();
        System.out.print("Enter second integer:");
        int2=input.nextInt();
        sum=int1+int2;
        System.out.print("Sum is:"+sum);
        input.close();
    }
}
