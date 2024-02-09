package podstawy;

public class TabliceWielowymiaroweSposob2 {
    public static void main(String[] args) {

        int[][] liczby ={
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5}};

        for (int i = 0; i < liczby.length; i++) {
            System.out.println();
            for (int j = 0; j < liczby[i].length; j++) {
                System.out.print(liczby[i][j]);

            }

        }
    }
}
