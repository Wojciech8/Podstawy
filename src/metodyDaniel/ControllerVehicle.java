package metodyDaniel;

import harmonogramProjekt.Service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControllerVehicle {

    private ServiceVehicle service = new ServiceVehicle();

    public void startProgram() {
        System.out.println("Witaj w konfiguracji auta");
        int choice;
        do {
            try {
                choice = startOption();
            } catch (InputMismatchException e) {
                System.out.println("Błąd proszę wprowadzić cyfrę");
                choice = 1;
            }
        } while (choice != 0);
        System.out.println("Dziękuje, do zobaczenia");
    }
    private int startOption(){
        Scanner scanner = new Scanner(System.in);
        opcjeWyboru();
        int choice = scanner.nextInt();
        scanner.nextLine();// po co to
        choseOption(choice);

        return choice;
    }
    private void opcjeWyboru(){
        System.out.println("Jakie auto cię interesuje sportowe, miniwan");
        System.out.println("Aby wybrać sportowe auto wciśnij 1, miniwan wciśnij 2");
        System.out.println("Aby wybrać skonfigurowane samochody wciśnij 3 ");
        System.out.println("Aby wyjść z programu wciśnij '0' ");
    }
    private void choseOption(int choice){
        switch (choice) {
            case 1:
                System.out.println("Wybrałeś sportowe");
                choseSportVehicle();
                break;
            case 2:
                System.out.println("Wybrałeś miniwan");
                choseMinivanVehicle();
                break;
            case 3:
                System.out.println(service.vehicles);
                break;
        }
    }
    private void choseSportVehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj moc silnika");
        int enginePower = scanner.nextInt();
        System.out.println("Jaki rodzaj opon");
        int tyers = scanner.nextInt();
        Vehicle sportscar = new Vehicle(enginePower, tyers, "Sportowy");
        System.out.println("Stworzony samochod wyglada tak: " + sportscar);
        service.saveVehicle(sportscar);
    }

    private void choseMinivanVehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj moc silnika");
        int enginePower = scanner.nextInt();
        System.out.println("Jaki rodzaj opon");
        int tyers = scanner.nextInt();
        Vehicle minivan = new Vehicle(enginePower, tyers, "minivan");
        System.out.println("Stworzony samochod wyglada tak: " + minivan);
        service.saveVehicle(minivan);
    }




}

