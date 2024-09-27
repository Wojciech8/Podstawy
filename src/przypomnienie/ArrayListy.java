package przypomnienie;

import java.util.ArrayList;

public class ArrayListy {
    public static void main(String[] args) {

        String[] tablica = {"Wojciech", "Daniel","Kasia"};
        String[] tablica2 = new String[3];
        tablica2[0] = "Wojciech";
        tablica2[1] = "DANIEL";
        tablica2[2] = "Ewa";
        tablica2[0] = "Julia";
        for (String imie : tablica2) {
            System.out.println(imie);
        }
        System.out.println();

        ArrayList<String> imiona = new ArrayList<>();
        imiona.add("Wojciech");
        imiona.add("Daniel");
        imiona.add("Ewa");
        imiona.remove(0);
        imiona.set(0,"Wojciech");

        for (int i = 0; i < imiona.size(); i++) {
           String imie = imiona.get(i);
            System.out.println(imie);
        }

        /*for( i ; waruenk ; zmiana i){

        }*/

        /*
        for(element : zbior){
        }
        * */
        for(String imie  : imiona){
            System.out.println(imie);
        }
        for (String imie : tablica2){
            System.out.println(imie);
        }
    }
}
