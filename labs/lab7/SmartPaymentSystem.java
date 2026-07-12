import java.util.Scanner;

public class SmartPaymentSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter payment type:");
        String type = input.nextLine().trim();
        System.out.print("Enter payment amount:");
        double amount = input.nextDouble();
        try {
            PaymentProcessor processor = PaymentFactory.createProcessor(type);
            processor.processPayment(amount);
        } catch (IllegalArgumentException error){
            System.out.println("Error:"+error.getMessage());
        } catch (PaymentException error){
            System.out.println("Error:"+error.getMessage());
        }
        input.close();
    }
}
