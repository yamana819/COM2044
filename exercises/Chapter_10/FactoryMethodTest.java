package exercises.Chapter_10;

public class FactoryMethodTest {
    public static void main(String[] args) {
        NotificationFactory emailFactory = new EmailNotificationFactory();
        Notification email = emailFactory.createNotification("@mail.com");
        email.notifyUser();
        NotificationFactory smsFactory = new SMSNotificationFactory();
        Notification sms = smsFactory.createNotification("+123456789");
        sms.notifyUser();
    }
}
