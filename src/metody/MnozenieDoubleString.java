package metody;

public class MnozenieDoubleString {
       public static void main(String[] args) {
           String inputString = "$";
           double multiplier = 10;
           StringBuilder result = new StringBuilder();
           for (int i = 0; i < multiplier; i++) {
               result.append(inputString);
           }
           String outputString = result.toString();
           System.out.println(outputString);
       }
}

