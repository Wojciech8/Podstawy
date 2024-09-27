package ZadanieDaniel;

import java.util.Arrays;

public class SortowanieBabelkowe2 {
    public static void main(String[] args) {
        int numbers[]={99,70,-2,80,100,1000,-22};

        int pomocniczy;

        for (int j = 0; j < numbers.length - 1; j++)
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println("Porównanie" + numbers[i] + " z " + numbers[i + 1]);
            if (numbers[i] > numbers[i + 1]){
                System.out.println("jest większe");
                pomocniczy = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = pomocniczy;
            }

        }
        System.out.println("Sortowanie bąbelkowe : " + Arrays.toString(numbers));
    }
}
