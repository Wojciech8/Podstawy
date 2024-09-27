package harmonogramProjekt;

public class Task {
    private String name;
    String dayOfWeek;
    boolean finishedDutys = false;

    Task(String name, String dayOfWeek){
        this.name = name;
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                ", finishedDutys=" + finishedDutys +
                '}';
    }
}
