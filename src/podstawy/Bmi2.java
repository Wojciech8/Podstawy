package podstawy;

public class Bmi2 {
    public static void main(String[] args) {
        double wzrost = 1.78;
        double waga = 103;
        double bmi = waga/(wzrost*wzrost);
        boolean otyly = bmi >= 24.9;
        boolean chudy = bmi <= 18.5;
        boolean norma = bmi > 18.5 && bmi < 24.9;
        boolean norma2 = !chudy && !otyly;
        boolean problem = chudy || otyly;
        System.out.println("Twoj wzrtost to : " + wzrost);
        System.out.println("Twoja waga wynosi : " + waga);
        System.out.println("podstawy.Bmi wynosi :" + bmi);
        System.out.println("Jesteś otyly :" + otyly);
        System.out.println("Jesteś za chudy " + chudy);
        System.out.println("Jesteś w normie " + norma);
        System.out.println("Masz problem " + problem);
    }
}
