package podstawy;

public class IF {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 3;

        if(a < b) System.out.println("a jest mniejsze od b");
        System.out.println();

        c = a - b; // c zawiera -1

        System.out.println("c zawiera -1");
        if(c >= 0) System.out.println("c nie jest ujemne");
        if(c < 0) System.out.println("c jest ujemne");

        System.out.println();

        c = b -a; // c zawiera 1

        System.out.println("c zawiera 1");
        if(c >= 0) System.out.println(" c jest nie ujemne");
        if(c < 0) System.out.println("c jest ujemne3");
    }
}
