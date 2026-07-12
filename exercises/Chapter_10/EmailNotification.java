package exercises.Chapter_10;

public class EmailNotification implements Notification{
    private String recipient;
    private EmailNotification(String recipient){
        this.recipient=recipient;
    }
    public static Notification create(String recipient){
        return new EmailNotification(recipient);
    }
    @Override
    public void notifyUser(){
        System.out.println("Sending mail to "+recipient);
    }
}
