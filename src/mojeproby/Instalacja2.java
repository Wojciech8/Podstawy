package mojeproby;

import instalacja.Czesc;

import java.util.ArrayList;

public class Instalacja2 {
    ArrayList<Czesc1> czesci = new ArrayList<>();


    @Override
    public String toString() {
        return "Instalacja{" +
                "czesci=" + czesci +
                '}';
    }

    public void dodajCzesc(Czesc1 czesc) {
        czesci.add(czesc);

    }

    public void wyswietlInstalacje() {
        for (Czesc1 czesc : czesci) {
            System.out.println(czesc.nazwa);
        }
    }

    public double kosztInstalacji(){
        double kosztInstalacji = 0;


     /* Czesc czesc1 =   czesci.get(0);
     kosztInstalacji += czesc1.cenaCzesci();
     kosztInstalacji += czesci.get(1).cenaCzesci();*/

      /*  for (int i = 0; i < czesci.size(); i++) {
            Czesc czesc = czesci.get(i);
            kosztInstalacji += czesc.cenaCzesci();
        }*/

        for(Czesc1 czesc:czesci){
            kosztInstalacji +=  czesc.cenaCzesci() ;
        }
        return kosztInstalacji;
    }
}
