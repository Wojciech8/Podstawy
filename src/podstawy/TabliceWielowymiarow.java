package podstawy;

public class TabliceWielowymiarow {
    public static void main(String[] args) {

        int tablice[][] = new int[5][5];


        tablice[0][0] =1;
        tablice[0][1] =1;
        tablice[0][2] =1;
        tablice[0][3] =1;
        tablice[0][4] =1;
        tablice[1][0] =2;
        tablice[1][1] =2;
        tablice[1][2] =2;
        tablice[1][3] =2;
        tablice[1][4] =2;
        tablice[2][0] =3;
        tablice[2][1] =3;
        tablice[2][2] =3;
        tablice[2][3] =3;
        tablice[2][4] =3;
        tablice[3][0] =4;
        tablice[3][1] =4;
        tablice[3][2] =4;
        tablice[3][3] =4;
        tablice[3][4] =4;
        tablice[4][0] =5;
        tablice[4][1] =5;
        tablice[4][2] =5;
        tablice[4][3] =5;
        tablice[4][4] =5;



        for (int i = 0; i <tablice.length ; i++) {
            System.out.println();
            for (int j = 0; j < tablice[i].length; j++) {
                System.out.print(tablice[i][j]);


            }

        }
    }
}
