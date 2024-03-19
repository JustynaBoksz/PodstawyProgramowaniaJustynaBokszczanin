// 2) Stwórz tablicę liczb całkowitych a następnie oblicz średnią wartość.
public class lab1zad2 {
public static void main(String[] args) {
    int[] integerNumbers = {10, 20, 30, 40, 50};

        System.out.println("L. calkowita 1: " + integerNumbers[0]);
        System.out.println("L. calkowita 2: " + integerNumbers[1]);
        System.out.println("L. calkowita 3: " + integerNumbers[2]);
        System.out.println("L. calkowita 4: " + integerNumbers[3]);
        System.out.println("L. calkowita 5: " + integerNumbers[4]);

        int sum = 0;
        for (int i = 0; i < integerNumbers.length; i++) {
            sum += integerNumbers[i];
        }

        double average = (double) sum / integerNumbers.length;
        System.out.println("Srednia wartosc liczb: " + average);
    }
}