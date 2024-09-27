package harmonogramProjekt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Service {
    ArrayList<Task> tasks = new ArrayList<>();


    public List<Task> getAllTasks(){
        return tasks;
    }

    void saveTask(Task newTask){
        tasks.add(newTask);
    }
    public List<String> getFreeDays (){
        List<String> daysOfWeek = getAllDays();


        for (Task task : tasks) {
            daysOfWeek.remove(task.dayOfWeek);
        }
        return daysOfWeek;
    }

    public String getDayOfTheWeekInPolish(){
        LocalDate aktualnaData = LocalDate.now();
        DayOfWeek day = aktualnaData.getDayOfWeek();
        switch (day){
            case MONDAY : return  "pon";
            case TUESDAY: return "wto";
            case WEDNESDAY: return "śro";
            case THURSDAY: return "czw";
            case FRIDAY: return "pio";
            case SATURDAY: return "sob";
            case SUNDAY: return "niedz";
        }
        return day.name();

    }
    public List<Task> getTodaysTasks(){
        String curentDay = getDayOfTheWeekInPolish();
        ArrayList<Task> todayTasks = new ArrayList<>();

       /* for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
         ta sama pętla jest pod spodem }*/

        for (Task task : tasks){
            if (curentDay.equals(task.dayOfWeek)){
                todayTasks.add(task);
            }
        }


        return todayTasks;
    }
    public List<String> getAllDays() {
        ArrayList<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("pon");
        daysOfWeek.add("wto");
        daysOfWeek.add("śro");
        daysOfWeek.add("czw");
        daysOfWeek.add("pio");
        daysOfWeek.add("sob");
        daysOfWeek.add("niedz");
        return daysOfWeek;
    }





}
