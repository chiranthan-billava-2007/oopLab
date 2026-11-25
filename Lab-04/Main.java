interface ParkingCharge {
    void calculateCharge();
    void displayParkingDetails();
}

class VehicleParking {
    String vehicleNumber;
    String vehicleType;
    int parkingHours;
    double charge;  // Common member

    VehicleParking(String number, String type, int hours) {
        vehicleNumber = number;
        vehicleType = type;
        parkingHours = hours;
    }
}

class TwoWheeler extends VehicleParking implements ParkingCharge {

    TwoWheeler(String number, int hours) {
        super(number, "Two_Wheeler", hours);
    }

    @Override
    public void calculateCharge() {
        if (parkingHours <= 2)
            charge = parkingHours * 20;
        else
            charge = 2 * 20 + (parkingHours - 2) * 10;
    }

    @Override
    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Charge: " + charge);
    }
}

class FourWheeler extends VehicleParking implements ParkingCharge {

    FourWheeler(String number, int hours) {
        super(number, "Four_Wheeler", hours);
    }

    @Override
    public void calculateCharge() {
        if (parkingHours <= 2)
            charge = parkingHours * 50;
        else
            charge = 2 * 50 + (parkingHours - 2) * 30;
    }

    @Override
    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Charge: " + charge);
    }
}

public class Main {
    public static void main(String[] args) {
        ParkingCharge p;

        p = new TwoWheeler("KA20MJ4694", 4);
        p.calculateCharge();
        p.displayParkingDetails();

        System.out.println();

        p = new FourWheeler("KA02CD5678", 4);
        p.calculateCharge();
        p.displayParkingDetails();
    }
}