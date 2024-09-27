package sthrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        try {
            printBooks();
        }catch (FileNotFoundException e){
            System.out.println("Nie udało sie otworzyć");
        }
    }

    static void printBooks() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("books.txt")); //unhandled - nie obsłuzony wyjatek
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            System.out.println(line.charAt(100));
        }
    }
}
