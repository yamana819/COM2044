package exercises.Chapter_6;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three floating point number separated by spaces:");
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        double num3=input.nextDouble();
        double result=maximum(num1,num2,num3);
        System.out.println("Maximum value is "+result);
    }
    public static double maximum(double num1,double num2,double num3){
        double max=num1;
        if (num2>max){
            max=num2;
        }
        if (num3>max){
            max=num3;
        }
        return max;
    }
}
