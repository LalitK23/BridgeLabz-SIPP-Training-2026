import java.util.*;

public class SmartParkingSlotManager {

    private ArrayList<String> vehicles = new ArrayList<>();

    public void addVehicle(String vehicleNumber) {

        vehicles.add(vehicleNumber);

        System.out.println(vehicleNumber + " entered the parking.");
    }

    public void removeVehicle(String vehicleNumber) {

        if (vehicles.remove(vehicleNumber)) {

            System.out.println(vehicleNumber + " exited the parking.");
        } else {

            System.out.println("Vehicle not found.");
        }
    }

    public void searchVehicle(String vehicleNumber) {

        if (vehicles.contains(vehicleNumber)) {

            System.out.println("Vehicle is parked.");
        } else {

            System.out.println("Vehicle is not parked.");
        }
    }

    public void displayVehicles() {

        System.out.println("\nParked Vehicles:");

        for (String vehicle : vehicles) {

            System.out.println(vehicle);
        }

        System.out.println("\nTotal Occupied Parking Slots: " + vehicles.size());
    }

    public static void main(String[] args) {

        SmartParkingSlotManager parking = new SmartParkingSlotManager();

        parking.addVehicle("UP32AB1234");
        parking.addVehicle("DL01CD5678");
        parking.addVehicle("MH12EF9876");

        System.out.println();

        parking.searchVehicle("DL01CD5678");

        System.out.println();

        parking.removeVehicle("UP32AB1234");

        System.out.println();

        parking.displayVehicles();
    }
}