import java.util.*;
interface Trackable{
    void logActivity();

    default void resetData(){

        System.out.println("fitness data has reset");
    }
}
interface Reportable{
    void generateReport();
}
interface Notifiable{
    void sendAlert();
}
class FitnessDevice implements Trackable,Reportable,Notifiable{
    public void logActivity(){
        System.out.println("Activity looged: completed 200 steps");
    }
    public void generateReport(){
        System.out.println("Report: you burned 200 calories");
    }
    public void sendAlert(){
        System.out.println("Alert: drink water ");
    }
}
public class FitnessTracker {
    public static void main(String[] args) {
        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();
    }
}