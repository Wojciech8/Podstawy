package przypomnienie;

class Metody {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba();
        osoba1.imie = "Jan";

        Osoba osoba2 = new Osoba();
        osoba2.imie = "Julia";

        osoba1.przedstawSie();
        osoba2.przedstawSie();


       // Osoba.przedstawSie();

        Metody.przywitaj();
        Metody.wyswietlMenu();


        przywitajPana("Jan","Kowalski");
        przywitajPana("Mariusz", "Janowski");

     // String text =  przywitajOsobe(osoba2);
        System.out.println("--------------");

        String przywitanieJana =   przygotujPowitanie("Jana");
        String przywitanieMariusza =  przygotujPowitanie("Mariusza");
        String przywitanieJulii = przygotujPowitanie("Julii");

        String przywitanieGosci= "Przyjecie urodzinowe:\n " + przywitanieJana + "\n" + przywitanieMariusza + "\n" + przywitanieJulii +"\n" + "bawcie się dobrze!" ;


        System.out.println(przywitanieGosci);


    }

    static void przywitaj() {
        System.out.println("Dzień dobry");
        System.out.println("Co robimy?");
    }

    static void wyswietlMenu() {
        System.out.println("Oto menu:");
        System.out.println("1. Dodaj część");
    }


    static void przywitajPana(String imie, String nazwisko){
        System.out.println("Dzień dobry panie " + imie + " " + nazwisko);
    }

    static String przygotujPowitanie(String imie){
        String powitanie = "Witamy serdecznie "+ imie + " na przyjęciu.";
       return powitanie;
    }




    static void przywitajOsobe(Osoba osobaDoPrzywitania){
        System.out.println("witaj " + osobaDoPrzywitania.imie);
    }


}
