package TreningObiekt;

public class Array3dszybko {
    public static void main(String[] args) {

        int[][] liczby = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1}};

        for (int i = 0; i < liczby.length; i++) {
            System.out.println();
            for (int j = 0; j < liczby[i].length; j++) {
                System.out.print(liczby[i][j]);

            }

        }
    }
}
