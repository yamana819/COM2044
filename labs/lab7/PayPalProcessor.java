
public class PayPalProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) throws PaymentException{
        if (amount<10){
            throw new PaymentException("PayPal amount can not be smaller than 10.");
        }
        System.out.println("Processing PayPal payment of "+amount);
    }
}
