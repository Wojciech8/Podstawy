package kompozycja;

import java.util.ArrayList;

class Uzytkownik {

    ArrayList<Czesc> ulubioneCzesci = new ArrayList<>();


    void dodajUlubioneCzesci(Czesc czesc){
        ulubioneCzesci.add(czesc);
    }

    void  wyswietlUlubione(){
        for (int i = 0; i < ulubioneCzesci.size(); i++) {

            System.out.println(ulubioneCzesci.get(i).nazwa);
        }
    }
}
