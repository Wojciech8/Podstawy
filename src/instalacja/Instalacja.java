package instalacja;

import java.util.ArrayList;

public class Instalacja {

    ArrayList<Czesc> czesci = new ArrayList<>();


    @Override
    public String toString() {
        return "Instalacja{" +
                "czesci=" + czesci +
                '}';
    }

    public void dodajCzesc(Czesc czesc) {
        czesci.add(czesc);

    }

    public void wyswietlInstalacje() {
        for (Czesc czesc : czesci) {
            System.out.println(czesc.nazwa);
        }
    }

    public double kosztBazowyInstalacji(){
        double kosztInstalacji = 0;


     /* Czesc czesc1 =   czesci.get(0);
     kosztInstalacji += czesc1.cenaCzesci();
     kosztInstalacji += czesci.get(1).cenaCzesci();*/

      /*  for (int i = 0; i < czesci.size(); i++) {
            Czesc czesc = czesci.get(i);
            kosztInstalacji += czesc.cenaCzesci();
        }*/

        for(Czesc czesc:czesci){
            kosztInstalacji +=  czesc.cenaCzesci() ;
        }
        return kosztInstalacji;
    }

    public  double policzRabat(){
        double koszt = kosztBazowyInstalacji();
        double rabat = 0;
        if (koszt >= 20.0){
            rabat = 5;
        }
        return rabat;

    }
}
