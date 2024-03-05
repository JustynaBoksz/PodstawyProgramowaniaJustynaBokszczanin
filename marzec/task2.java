public class task2 {
    public static void main(String[] args) {
        // Definicja zmiennych
        double liczba1 = 20;
        double liczba2 = 3;

        // Dodawanie
        double suma = liczba1 + liczba2;
        System.out.println("Suma: " + suma);

        // Odejmowanie
        double roznica = liczba1 - liczba2;
        System.out.println("Różnica: " + roznica);

        // Mnożenie
        double iloczyn = liczba1 * liczba2;
        System.out.println("Iloczyn: " + iloczyn);

        // Dzielenie
        if (liczba2 != 0) {
            double iloraz = liczba1 / liczba2;
            System.out.println("Iloraz: " + iloraz);
        } else {
            System.out.println("Nie można dzielić przez zero!");
        }
    }
}