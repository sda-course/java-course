package java_course._1_basics.step06;

import java.util.Scanner;

/**
 * Instrukcja (zwana popularnie pętlą)
 * while(warunek) {
 *   instrukcja;
 *   ...
 * }
 * powtarza wykonywanie instrukcji wewnątrz bloku, jeśli warunek jest prawdą. Każde powtórzenie to iteracja.
 * Gdy warunek jest fałszem nie jest wykonywane powtórzenie tylko wykonywana jest następna instrukcja za while.
 * Wywołanie break wewnątrz bloku instrukcji while powoduje przerwanie i zakończenie powtórzeń.
 * Wewnątrz instrukcji while można umieszczać dowolne instrukcje, w tym także while, co
 * powoduje zagnieżdżanie pętli.
 */
public class _06_1_WhileInstruction {
    public static void main(String[] args) {
        System.out.println("Przykład 1");
        System.out.println("Wykonanie pięciu iteracji.");
        int counter = 5;
        while (counter-- > 0){
            System.out.println("Wartość licznika: " + counter);
        }

        System.out.println("Przykład 2");
        System.out.println("Wykonywanie powtórzeń do momentu wpisania liczby 5");
        Scanner scanner = new Scanner(System.in);
        while(scanner.nextInt() != 5){
            System.out.println("Wpisz liczbę 5, aby przerwać iteracje!");
        }

        System.out.println("Przykład 3");
        System.out.println("Przerwanie wykonywania powtórzeń instrukcją break.");
        while(true){
            if (scanner.nextInt() == 5){
                break;
            } else {
                System.out.println("Wpisz 5, aby przerwać iteracje!");
            }
        }

        System.out.println("Przykład 4");
        System.out.println("Zagnieżdżanie instrukcji while.");
        while(true){
            int localCounter = scanner.nextInt();
            if (localCounter == 5){
                break;
            } else {
                System.out.print("Wykonuję zagnieżdżoną instrukcję while! ");
                System.out.print("\033[0m");
                while (localCounter-- > 0 ){
                    System.out.print("#");
                }
                System.out.println("\nKoniec zagnieżdżonej pętli!");
                System.out.println("\n\u001B[41m"+"Wpisz 5 aby zakończyć pętlę zewnętrzną!"+"\033[0m");
            }
        }
    }
}
