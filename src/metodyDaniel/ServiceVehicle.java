package metodyDaniel;

import java.util.ArrayList;

public class ServiceVehicle {
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    void saveVehicle(Vehicle newVehicle){
        vehicles.add(newVehicle);
    }

}
