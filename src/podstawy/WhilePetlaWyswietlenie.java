package podstawy;

public class WhilePetlaWyswietlenie {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        int j = 99;
        while (j >= 66) {
            System.out.println(j);
            j--;
        }
        int k = 20;
        while (k <= 40) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
            k++;
        }
        int count = 0;
        while (count < 5) {
            System.out.println("Wojciech");
            count++;
        }

    }
}






