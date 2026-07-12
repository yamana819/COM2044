package exercises.Chapter_10;

public class SMSNotification implements Notification{
    private String recipient;
    private SMSNotification(String recipient){
        this.recipient=recipient;
    }
    public static Notification create(String recipient){
        return new SMSNotification(recipient);
    }
    @Override
    public void notifyUser(){
        System.out.println("Sending sms to "+recipient);
    }
}
