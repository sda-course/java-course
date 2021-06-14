package java_course._1_basics.chapter03;

import java.util.Scanner;

/**
 * Klasa Scanner i pobieranie danych z klawiatury
 */
public class _03_3_Scanner {
    public static void main(String[] args) {
        /*
            Aby program nie obliczał ciągle tej samej wartości,
            powinniśmy dać możliwość wprowadzania danych przez użytkownika.
            Wykorzystamy klasę Scanner
         */

        /*
            Deklaracja zmiennej scanner, oczywiście możemy ją nazwać dowolnie jak inne zmienne.
         */
        Scanner scanner = new Scanner(System.in);

        /*
            Wczytanie liczby całkowitej typu int. Program będzie czekał na wpisanie danych.
            Gdy użytkownik wciśnie ENTER i wpisane dane będą zgodne z typem to zakończy się ta instrukcja.
            Jeśli użytkownik wpisze dane niepasujące, zostanie zgłoszony błąd i program zostanie przerwany.
        */
        System.out.println("Wpisz liczbę całkowitą:");
        int n = scanner.nextInt();

        /*
            Wczytanie liczby zmiennoprzecinkowej typu double
         */
        System.out.println("Wpisz liczbę dziesiętną:");
        double radius = scanner.nextDouble();

        /*
        Każde wywołanie scanner.nextXXX() powoduje zatrzymanie programu i oczekiwanie na wpisanie danych z klawiatury
        Koniec wpisywania każdej danej należy zatwierdzić klawiszem ENTER
         */
        System.out.println("Wpisana liczba całkowita = " + n);
        System.out.println("Wpisana liczba dziesiętna = " + radius);

        /*
            Uruchom ten program i wpisz kolejno trzy liczby. Uruchom ponownie program kilka razy, wpisując różne wartości np. same całkowite
            dziesiętne z kropką, dziesiętne z przecinkiem i obserwuj działanie programu.
         */


    }
}
