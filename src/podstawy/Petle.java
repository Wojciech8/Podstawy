package podstawy;

public class Petle {
    public static void main(String[] args) {
        /*if(warunek) {
            kod
        }
        while (warunek) {
            kod
        }*/
        int liczba = 0;
        if (liczba >= 0) {
            System.out.println("Liczba jest dodatnia");
        }
        while (liczba < 12){
            System.out.println("liczba = " + liczba);
            liczba ++ ;
        }
    }
}
