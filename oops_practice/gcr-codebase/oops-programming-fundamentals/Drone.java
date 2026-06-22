public class Drone {

    int droneId;
    int batteryPercentage;

    static String companyName = "SkyLogistics";

    public Drone(int droneId, int batteryPercentage) {

        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    public void startDelivery() {

        if (batteryPercentage >= 20) {

            System.out.println("Drone " + droneId + " started delivery");

        } else {

            System.out.println("Drone " + droneId + " has low battery");
        }
    }

    public void displayStatus() {

        System.out.println("Drone ID: " + droneId);

        System.out.println("Battery: " + batteryPercentage + "%");

        System.out.println("Company: " + companyName);

        System.out.println();
    }

    public static void main(String[] args) {

        Drone d1 = new Drone(101, 80);

        Drone d2 = new Drone(102, 60);

        Drone d3 = new Drone(103, 15);

        d1.startDelivery();

        d2.startDelivery();

        d3.startDelivery();

        d1.displayStatus();

        d2.displayStatus();

        d3.displayStatus();
    }
}