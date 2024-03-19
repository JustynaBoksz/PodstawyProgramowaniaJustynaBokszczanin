//6) Napisz program, który sprawdza, czy dane słowo jest palindromem.
import java.util.Scanner;
public class lab1zad6 {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Wpisz słowo, aby sprawdzić czy jest palindromem:");
    String input = scanner.nextLine();
    scanner.close();


    if (palindrom(input)) {
        System.out.println("Wprowadzone słowo jest palindromem.");
    } else {
        System.out.println("Wprowadzone słowo nie jest palindromem.");
    }
}

    public static boolean palindrom(String text) {
    String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int length = cleanText.length();
    for (int i = 0; i < length / 2; i++) {
        if (cleanText.charAt(i) != cleanText.charAt(length - i - 1)) {
            return false;
        }
    }
    return true;
}

}