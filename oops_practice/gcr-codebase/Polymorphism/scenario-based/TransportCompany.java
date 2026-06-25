class Vehicle {
    String name;

    Vehicle(String name) {
        this.name = name;
    }

    public double fuelCost(int km) {
        return 0;
    }
}

class Car extends Vehicle {
    Car(String name) {
        super(name);
    }

    public double fuelCost(int km) {
        return km * 8;
    }
}

class Bus extends Vehicle {
    Bus(String name) {
        super(name);
    }

    public double fuelCost(int km) {
        return km * 15;
    }
}

class Bike extends Vehicle {
    Bike(String name) {
        super(name);
    }

    public double fuelCost(int km) {
        return km * 3;
    }
}

class ElectricCar extends Vehicle {
    ElectricCar(String name) {
        super(name);
    }

    public double fuelCost(int km) {
        return km * 2;
    }
}

public class TransportCompany {
    public static void main(String[] args) {
        Vehicle[] fleet = {
            new Car("Honda City"),
            new Bus("Volvo Bus"),
            new Bike("Royal Enfield"),
            new ElectricCar("Tata Nexon EV")
        };

        int km = 100;

        for (Vehicle v : fleet) {
            System.out.println("Vehicle Name: " + v.name);
            System.out.println("Fuel Cost: " + v.fuelCost(km));
            System.out.println();
        }
    }
}