class Notification{
    String recipientname;
    String message;
    Notification(String recipientname,String message){
        this.recipientname=recipientname;
        this.message=message;
    }
    void sendNotification(){
        System.out.println("sending notification");
    }
}
class EmailNotification extends Notification{
    EmailNotification(String recipientname,String message){
        super(recipientname, message);
    }
    void sendNotification(){
        System.out.println("Email send to" + recipientname + ":" + message);
    }
}
class SMSNotification extends Notification{
    SMSNotification(String recipientname,String message){
        super(recipientname, message);
    }
    void sendNotification(){
        System.out.println("SMS send to" + recipientname + ":" + message);
    }
}
class PushNotification extends Notification{
    PushNotification(String recipientname,String message){
        super(recipientname, message);
    }
    void sendNotification(){
        System.out.println("Push Notification send to"+recipientname+":"+message);
    }
}
public class SmartNotificationSystem{
    public static void main(String[] args){
        Notification [] notifications = {
            new EmailNotification("Amit", "Welcome to our platform"),
            new SMSNotification("Rahul", "Your OTP is 1234"),
            new PushNotification("Priya", "You have a new message")
        };
        for(Notification n : notifications){
            n.sendNotification();
        }
    }
}