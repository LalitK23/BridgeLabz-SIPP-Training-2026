public class ChargingStation {

    static int totalStations = 0;

    static double electricityRate = 12;

    int stationId;

    int unitsConsumed;

    public ChargingStation(int stationId, int unitsConsumed) {

        this.stationId = stationId;

        this.unitsConsumed = unitsConsumed;

        totalStations++;
    }

    public double calculateBill() {

        return unitsConsumed * electricityRate;
    }

    public void displayStationDetails() {

        System.out.println("Station ID: " + stationId);

        System.out.println("Units Consumed: " + unitsConsumed);

        System.out.println("Bill: " + calculateBill());

        System.out.println();
    }

    public static void main(String[] args) {

        ChargingStation s1 = new ChargingStation(1, 50);

        ChargingStation s2 = new ChargingStation(2, 80);

        ChargingStation s3 = new ChargingStation(3, 100);

        ChargingStation s4 = new ChargingStation(4, 70);

        ChargingStation s5 = new ChargingStation(5, 120);

        s1.displayStationDetails();

        s2.displayStationDetails();

        s3.displayStationDetails();

        s4.displayStationDetails();

        s5.displayStationDetails();

        System.out.println("Total Stations: " + totalStations);

        electricityRate = 15;

        System.out.println("\nUpdated Electricity Rate");

        s1.displayStationDetails();

        s2.displayStationDetails();
    }
}