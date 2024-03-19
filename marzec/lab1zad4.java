// 4) Napisz program obliczający wskaźnik masy ciała (BMI). BMI masa/wzrost
import java.util.Scanner;
public class lab1zad4 {
    
    public static void main(String[] args) {

    Scanner wczytaj = new Scanner (System.in);
    System.out.println("Podaj swoja wage w kg");
    double waga = wczytaj.nextDouble();
    System.out.println("Podaj swoj wzrost w m");
    double wzrost = wczytaj.nextDouble();

    double bmi = waga/wzrost;

    System.out.println("Twoje BMI wynosi:" + bmi );
    }
}