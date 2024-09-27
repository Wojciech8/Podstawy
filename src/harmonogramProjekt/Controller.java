package harmonogramProjekt;

import java.util.List;
import java.util.Scanner;

public class Controller {

    private Service service = new Service();


    void startProgram(){

        int choice;
        do {
            System.out.println("Witaj w programie układającym harmonogram!");
            System.out.println("Dzisiaj jest: " + service.getDayOfTheWeekInPolish());
            Scanner scanner = new Scanner(System.in);
            System.out.println("Co chcesz zrobić?");
            System.out.println("1. dodać zadanie");
            System.out.println("2. zadania na dziś");
            System.out.println("3. wyświetlić zadania");
            System.out.println("4. zakończ dzisiejsze zadanie");
            System.out.println("5. wyświetl wolne dni");
            System.out.println("0. zakoncz program");

            choice= scanner.nextInt();

            scanner.nextLine(); // po co to?
            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    showTodaysTasks();
                    break;
                case 3:
                    showTasks();
                    break;
                case 4:
                    finishTodaysTask();
                    break;
                case 5:
                    showFreeDays();
            }
        }while (choice != 0);
    }



    private void addTask(){  // Task jak działa
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jakie zadanie chcesz dodać?");
        String taskName = scanner.nextLine();
        System.out.println("Na jaki dzień tygodnia? " + service.getAllDays());
        String dayOfTheWeek = scanner.nextLine();
        Task newTask = new Task(taskName,dayOfTheWeek); // tutaj
        System.out.println("Stworzone zadanie wyglada tak: " + newTask);
        service.saveTask(newTask);
        System.out.println("Twoje zadanie zapisane!");
    }
    private void showTodaysTasks() {
        System.out.println("Twoje zadania na dziś:");
        List<Task> tasks = service.getTodaysTasks();
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
    private void showTasks(){
        System.out.println("Twoje zadania: ");
      List<Task> tasks = service.getAllTasks();
        for(int i =0;i<tasks.size();i++){
            System.out.println(i+1 + ". " + tasks.get(i));
        }
    }

    private void finishTodaysTask() {
        //todo tylko nieukończone zadania na dziś
        List<Task> tasks = service.getTodaysTasks();
        System.out.println("Zadania na dziś to: " + tasks);
        if (tasks.isEmpty()){
            System.out.println("Brak zadań na dziś" );
            return;
        }
        Scanner scanner = new Scanner(System.in);
        showTasks();
        System.out.println("Które zadanie chcesz zamknąć?");
        int close = scanner.nextInt();
        System.out.println("Zamykam Twoje zadanie");
        Task task = tasks.get(close - 1);
        task.finishedDutys = true;

        // jeśli jest jakieś zadanie to przestawię je na zrobione
    }

    private void showFreeDays(){
        System.out.println("Dni, w których nie masz żadnych zadań: ");
        List<String> freeDays = service.getFreeDays();
        for (String freeDay : freeDays) {
            System.out.println(freeDay);
        }
    }

}
