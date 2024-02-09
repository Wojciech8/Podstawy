package podstawy;

import java.util.Random;
public class Losowaniekostki {
    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(4)+1;
        int y = random.nextInt(y = x)+1;

        System.out.println("Kostka do gry ma liczbę ścianek równą - " + x);//jak dać tutaj liczbę ścianek

        System.out.println(x);

        System.out.println("wylosowana ilość oczek to -  " + y);
    }
}
