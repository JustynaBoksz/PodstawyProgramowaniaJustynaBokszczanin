// 3) Wyświetl, czy dana liczba jest parzysta czy nieparzysta.
import java.util.Scanner;
public class lab1zad3{
    public static void main(String[] args){
        Scanner wczytaj= new Scanner(System.in);
        

System.out.println("Podaj liczbe");
   int liczba = wczytaj.nextInt();
   if (liczba%2==0) {
    System.out.print("Parzysta");
   }
   else {
    System.out.print("Nieparzysta");
   }
}

}