package java_course.basics.step06;

import java.util.Scanner;

/**
 * Instrukcja do {
 *     instrukcje;
 * } while(warunek);
 * Działa podobnie do instrukcji while, z tą różnicą, że zawsze wykonywana jest co najmniej jedna iteracja.
 * Warunek powtórzeń jest sprawdzany po wykonaniu iteracji.
 */
public class _06_DoWhileInstruction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pętla wymusza na użytkowniku wpisanie poprawnej wartości");
        int counter = 0;
        int end = 5;
        do{
            System.out.println("Wartość counter: " + counter);
            counter++;
        } while(counter < end);
        System.out.println("Wpisałeś: " + counter);
    }
}
