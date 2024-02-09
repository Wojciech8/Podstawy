package podstawy;

public class Imie {
    public static void main(String[] args) {

        String name = "Wojciech";
        String surName = "Osiadacz";
        int age = 4;
        boolean pelnoletni = 18 <= age;
        boolean dziecko = 12 >= age;
        boolean nastolatek = 12 > age && 18 < age;
        boolean wiekEmerytalny = 67 <= age;
        boolean przedzial = 100 > age;
        System.out.println("Cześć jak masz na imię ?");
        System.out.println(name);
        System.out.println("Jak masz na nazwisko ?");
        System.out.println(surName);
        System.out.println("Ile masz lat ?");
        System.out.println(age);
        System.out.println("Już wiem że jesteś pełnoletni  " + pelnoletni);
        System.out.println("Czy jesteś dzieckiem " + dziecko);
        System.out.println("Czy jesteś nastolatkiem " + nastolatek);
        System.out.println("Czy jesteś emerytem " + wiekEmerytalny);
        System.out.println("Czy mieścisz się w przedziale 0-100 lat " + przedzial);
    }
}
