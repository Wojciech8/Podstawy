package obiektowe.gietarki;

public class Gietarka {
    double srednica;
    double promien;

    public void wyswietl() {
        System.out.println("średnica = " + srednica);
        System.out.println("promień = " + promien);
        System.out.println("długość gięcia łuku = " + policzDlugoscGieciaLuku());
    }
    public double policzDlugoscGieciaLuku() {
        double luk = promien * 360 / 4;
        return luk;

    }
}
