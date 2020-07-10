package part1;

import java.util.Scanner;

/*
    Klasa Scanner i pobieranie danych z klawiatury. Blok instrukcji
 */
public class Program5 {
    public static void main(String[] args) {
        /*
            Aby program nie obliczał ciągle tej samej wartości
            powinniśmy dac mozliwość wprowadzania danych przez użytkownika.
            Wykorzystamy klasę Scanner
         */
        //Deklaracja zmiennej scanner, oczywiście możemy ją nazwać dowolnie jak inne zmienne
        Scanner scanner = new Scanner(System.in); //na razie traktujmy to jako zaklęcie, magię
        //Wczytanie liczby całkowitej tyu int
        int n = scanner.nextInt();
        //Wczytanie liczby zmiennoprzecinkowej typu double
        double radius = scanner.nextDouble();
        //Możemy oczywiście przypisać do utworzonej wcześniej zmiennej
        radius = scanner.nextDouble();
        //każde wywołanie scanner.nextXXX() pwoduje zatrzymanie programu i oczekiwanie na wpisanie danych z klawiatury
        //koniec wpisywania każdej danej należy zatwierdzić klawiszem ENTER
        System.out.println(n);
        System.out.println(radius);
        //uruchom ten program i wpisz kolejno trzy liczby. Uruchom program kilka razy wpisując różne wartości np. same całkowite
        //dziesiętne z kropką, dziesiętne z przecinkiem i obserwuj działanie programu.
    }
}
