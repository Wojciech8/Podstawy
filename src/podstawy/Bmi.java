package podstawy;

public class Bmi {
    public static void main(String[] args) {
        double waga = 118;
        double wzrost = 1.90;
        double bmi = waga/(wzrost*wzrost);
        boolean otyly = bmi >= 24.9;
        boolean chudy = bmi <= 18.5;
        boolean norma = bmi > 18.5 && bmi < 24.9;
        boolean norma2 = !chudy && !otyly;
        boolean problem = chudy || otyly;
        System.out.println("waga =  " + waga +" kg");
        System.out.println("wzrost =  " + wzrost + "m");
        System.out.println("Twoje podstawy.Bmi wynosi =  " + bmi);
        System.out.println("Jesteś otyły  " + otyly);
        System.out.println("Jesteś za chudy  " + chudy);
        System.out.println("Jesteś w normie  " + norma2);
        System.out.println(" Jest problem z wagą  " + problem);
    }
}
