package metodyDaniel;

public class Vehicle { //KLASA HErmetyzująca
    int enginePower;
    double tyres;
    String typeOfCar;

    Vehicle (int enginePower, double tyres, String typeOfCar){
        this.enginePower = enginePower;
        this.tyres = tyres;
        this.typeOfCar = typeOfCar;

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "enginePower=" + enginePower +
                ", tyres=" + tyres +
                ", typeOfCar='" + typeOfCar + '\'' +
                '}';
    }
}

