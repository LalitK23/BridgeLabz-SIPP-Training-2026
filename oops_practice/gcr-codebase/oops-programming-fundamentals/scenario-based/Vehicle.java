import java.util.Scanner;

public class Vehicle {

    String vehicleNumber;

    String ownerName;

    String vehicleType;

    public Vehicle(String vehicleNumber,
                   String ownerName,
                   String vehicleType) {

        this.vehicleNumber = vehicleNumber;

        this.ownerName = ownerName;

        this.vehicleType = vehicleType;
    }

    public static void displayCars(Vehicle[] vehicles) {

        System.out.println("\nCars");

        for (Vehicle v : vehicles) {

            if (v.vehicleType.equalsIgnoreCase("Car")) {

                System.out.println(v.vehicleNumber + " " + v.ownerName);
            }
        }
    }

    public static void displayBikes(Vehicle[] vehicles) {

        System.out.println("\nBikes");

        for (Vehicle v : vehicles) {

            if (v.vehicleType.equalsIgnoreCase("Bike")) {

                System.out.println(v.vehicleNumber + " " + v.ownerName);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vehicle[] vehicles = new Vehicle[10];

        for (int i = 0; i < 10; i++) {

            System.out.print("Vehicle Number: ");

            String number = sc.next();

            System.out.print("Owner Name: ");

            String owner = sc.next();

            System.out.print("Vehicle Type: ");

            String type = sc.next();

            vehicles[i] = new Vehicle(number, owner, type);
        }

        displayCars(vehicles);

        displayBikes(vehicles);

        sc.close();
    }
}