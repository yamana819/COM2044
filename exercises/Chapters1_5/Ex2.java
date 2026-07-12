package exercises.Chapters1_5;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first integer:");
        int int1 = input.nextInt();
        System.out.print("Enter second integer:");
        int int2 = input.nextInt();
        if (int1==int2){
            System.out.println(int1+" = "+int2);
        }
        else if (int1>int2){
            System.out.println(int1+" > "+int2);
        }
        else{
            System.out.println(int1+" < "+int2);
        }
        input.close();
    }
}
