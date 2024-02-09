package TreningObiekt;

public class Arrays3d {
    public static void main(String[] args) {
        int[][] liczby = new int[4][4];
        liczby[0][0]=1;
        liczby[0][1]=1;
        liczby[0][2]=1;
        liczby[0][3]=1;
        liczby[1][0]=1;
        liczby[1][1]=1;
        liczby[1][2]=1;
        liczby[1][3]=1;
        liczby[2][0]=1;
        liczby[2][1]=1;
        liczby[2][2]=1;
        liczby[2][3]=1;
        liczby[3][0]=1;
        liczby[3][1]=1;
        liczby[3][2]=1;
        liczby[3][3]=1;

        for (int i = 0; i < liczby.length; i++) {
            System.out.println();
            for (int j = 0; j < liczby[i].length; j++) {
                System.out.print(liczby[i][j]);

            }

        }
    }
}
