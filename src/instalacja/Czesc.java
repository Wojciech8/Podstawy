package instalacja;

public class Czesc {
    double dlugosc;
    double srednica;
    double promien;
    String nazwa;
    String typ;


    public Czesc(double dlugosc, double srednica, double promien, String nazwa, String typ) {
        this.dlugosc = dlugosc;
        this.srednica = srednica;
        this.promien = promien;
        this.nazwa = nazwa;
        this.typ = typ;


    }

    @Override
    public String toString() {
        return "Czesc{" +
                "dlugosc=" + dlugosc +
                ", srednica=" + srednica +
                ", promien=" + promien +
                ", nazwa='" + nazwa + '\'' +
                ", typ='" + typ + '\'' +
                ", cena=" + cenaCzesci() +
                '}';
    }

    public  double cenaCzesci(){
        double cenaCzesci = (dlugosc + srednica) / promien;
        if (nazwa.equals("rura")){
            cenaCzesci = dlugosc * 2;
        }


        return cenaCzesci;

    }
}
