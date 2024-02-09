package podstawy;

public class For {
    public static void main(String[] args) {
        int count;
        //(inicjalizacja; warunek; interacja) instrukcja FOR

        for(count = 0; count < 5; count = count + 1)//ta pętla wykonuje 5 literacji
             System.out.println("Wartość zmiennej sterującej count:  " + count);

        System.out.println("Pętla wykonana");
        for (int i = 0;  i < 10; i++) {
            System.out.println(" Ile wynosi i - " + i);

        }

    }
}
