package java_course._1_basics.chapter05;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        /*
        1. Napisz instrukcję switch, która wyświetli liczbę rzymską odpowiadającą wartości w 'value' w zakresie od 1 do 5. np. dla 2 wyświetli 'II' itd.
        Dla liczb większych od 5 lub mniejszych od 1 wyświetl 'Liczba spoza zakresu!'
         */

        double a = 12.45;
        double b = 3.4;
        /*
        2. Napisz instrukcję switch, która dla jednej z wartości w 'value' wykona:
            - dla 1 wyświetli wynik dodawania zmiennych a i b.
            - dla 2 wyświetli wynik mnożenia zmiennych a i b.
            - dla 3 wyświetli wynik dzielenie a przez b.
            - dla pozostałych liczb wyświetli obie liczby w postaci 'a = xxx, b = yyy'.
         */

        /*
        3. Uzupełnij instrukcję switch, aby dla wczytanej z klawiatury nazwy układu w pokerze wyświetlała objaśnienie:
            dla 'POKER' - pięć kolejnych kart w tym samym kolorze
            dla 'KARETA' - cztery karty o tej samej wartości
            dla 'FULL' - trójka i para
            dla 'PARA' - dwie karty o tej samej wartości
            dla 'TROJKA' - trzy karty o tej samej wartości
         */
        System.out.println("Podaj nazwę ukłądu w pokerze:");
        switch (scanner.nextLine()){

        }
    }
}
