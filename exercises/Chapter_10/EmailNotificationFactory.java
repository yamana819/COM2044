package exercises.Chapter_10;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification(String recipient){
        return EmailNotification.create(recipient);
    }
}
