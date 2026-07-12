package exercises.Chapter_10;

public class SMSNotificationFactory extends NotificationFactory{
    @Override
    public Notification createNotification(String recipient){
        return SMSNotification.create(recipient);
    }
}
