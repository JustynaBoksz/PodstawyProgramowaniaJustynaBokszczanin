// 5) Napisz program,który dla tablicy wyników z kilkoma
// ocenami obliczy średnią ocen i określi odpowiedni stopień zaliczenia (np. "A", "B", "C" itp.).
public class lab1zad5 {
    public static void main(String[] args) {

        int[] oceny = {3, 4, 6, 2, 5}; // Przykładowe oceny

        double sredniaocena = calculateAverage(oceny);
        char stopien = calculateGradeLetter(sredniaocena);

        System.out.println("Średnia ocen: " + sredniaocena);
        System.out.println("Stopień zaliczenia: " + stopien);
    }

    // Metoda do obliczania średniej ocen
    public static double calculateAverage(int[] oceny) {
        double sum = 0;
        for (int ocena : oceny) {
            sum += ocena;
        }
        return sum / oceny.length;
    }

    // Metoda do określenia odpowiedniego stopnia zaliczenia
    public static char calculateGradeLetter(double average) {
        if (average >= 6) {
            return 'A';
        } else if (average >= 5) {
            return 'B';
        } else if (average >= 4) {
            return 'C';
        } else if (average >= 3) {
            return 'D';
        } else {
            return 'F';
        }
    }

    }