package exercises.Chapter_11;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroException {
    public static int quotient(int numerator,int denominator) throws ArithmeticException{
        return numerator/denominator;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueLoop=true;
        do {
            try {
                System.out.print("Please enter an integer numerator:");
                int numerator = input.nextInt();
                System.out.print("Please enter an integer denominator:");
                int denominator = input.nextInt();
                System.out.println("Result of "+numerator+"/"+denominator+" is "+quotient(numerator,denominator));
                continueLoop=false;
            } catch (InputMismatchException e){
                System.out.printf("Exception:%s\n",e);
                System.out.println("Please enter an integer.");
                input.nextLine();
            } catch (ArithmeticException e){
                System.out.printf("Exception:%s\n",e);
                System.out.println("Zero is an invalid denominator.Try again.");
            }
        } while (continueLoop);
    }
}
