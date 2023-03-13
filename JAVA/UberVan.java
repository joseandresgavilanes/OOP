package JAVA;

import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatMaterial;

    public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted,
            ArrayList seatMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatMaterial = seatMaterial;
    }

    public UberVan(String license, Account driver) {
        super(license, driver);
    }

    @Override
    public void setPassengers(Integer passengers) {
        if (passengers == 6) {
            this.passengers = passengers;

        } else {
            System.out.println("You need 6 passengers");
        }
    }
}
