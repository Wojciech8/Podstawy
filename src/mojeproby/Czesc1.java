package mojeproby;

public class Czesc1 {
    double dlugosc;
    double srednica;
    double promien;
    String nazwa;
    String typ;


    public Czesc1(double dlugosc, double srednica, double promien, String nazwa, String typ) {
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
        return cenaCzesci;

    }
}
