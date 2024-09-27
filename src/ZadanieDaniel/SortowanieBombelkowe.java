package ZadanieDaniel;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortowanieBombelkowe {
    public static void main(String[] args) {
        int numery[] = {1, 9, 2, 8, 3, 7, 4, 5, -2, 999};

        for (int j = 0; j < numery.length; j++) {
            for (int i = 0; i < numery.length - 1; i++) {
                System.out.println("Porownanie: " + numery[i] + " z " + numery[i + 1]);
                if (numery[i] > numery[i + 1]) {
                    System.out.println(numery[i] + " okazało sie wieksze");
                    int zmiennaPomocnicza = numery[i];
                    numery[i] = numery[i + 1];
                    numery[i + 1] = zmiennaPomocnicza;
                }
            }
            System.out.println("Zrobione sortowanie bąbelkowe " + Arrays.toString(numery));

        }
    }
}

