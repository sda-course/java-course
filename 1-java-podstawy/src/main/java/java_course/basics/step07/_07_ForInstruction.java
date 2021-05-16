package java_course.basics.step07;

/**
 * Instrukcja for
 * Jest to instrukcja iteracyjna, bardziej rozbudowana od instrukcji while i do..while
 *
 * for (wyrażenie-deklaracji-i-przypisania; wyrażenie-logiczne; wyrażenie-modyfikujące){
 *     instrukcje-iteracji;
 * }
 * Kolejność wykonywania:
 *  instrukcja-deklaracji-i-przypisania
 *  wyrażenie-logiczne
 *      ==> jeśli zwróci prawdę to wykonywane są:
 *          instrukcje-iteracji
 *          wyrażenie-modyfikujące
 *          powrót do wyrażenia-logicznego
 *      ==> jeśli zwróci fałsz to kończy się wykonywanie instrukcji for i wykonywana jest następna instrukcja
 * Uwagi:
 * 1. W wyrażeniu deklaracji deklaruje się zmienną lub zmienne jednego typu, które są dostępne tylko w bloku instrukcji for
 *    więc są niedostępne poza tym blokiem
 * 2. Wyrażenie logiczne określa warunek wykonania powtórzenia, a jeśli go brak to przyjmowana jest wartość true.
 * 3. wyrażenie modyfikujące może zawierać wiele wyrażeń oddzielonych przecinkiem
 *
 * Zazwyczaj pętla for służy do generowania kolejnych wartości całkowitych
 * wyrażenie-przypisania: int i = 0
 * warunek: i < granica np. i < 10
 * wyrażenie-modyfikujące: i++
 *
 * for(int i=0; i < 10; i++){
 * }
 *
 * co odpowiada pętli while
 * int i = 0;
 * while(i<10){
 *      i++;
 * }
 */
public class _07_ForInstruction {
    public static void main(String[] args) {
        int n = 10;

        System.out.println("Przykład typowej pętli for wykonującej n = " + n + " powtórzeń.");
        for(int i = 0; i < n; i++){
            System.out.println("Iteracja i = " + i);
        }

        System.out.println("Nie są wymagane wszystkie wyrażenie w for");
        int k = 0;
        for(; k < n;){
            System.out.println("Iteracja k = " + k);
            k++;
        }

        System.out.println("Możliwe jest deklarowanie wielu zmiennych w instrukcji for");
        for(int i = 0, l = 9; i < n; i++, l--){
            System.out.println("i = " + i + ", j = " + l);
        }

        System.out.println("Przykład pętli generującej liczby z krokiem 3.");
        for(int i = 18; i > 0; i-=3){
            System.out.println(i);
        }

        System.out.println("Przykład zagnieżdżeń instrukcji for: tabliczka mnożenia od 1 do 4");
        for(int row = 1; row < 5; row++){
            for(int column = 1; column < 5; column++){
                System.out.print(row * column);
                System.out.print("\t");
            }
            System.out.println();
        }

        System.out.println("Przykład pętli for bez bloku instrukcji powtarzanych w iteracji");
        System.out.println("Nie należy jednak tak robić!!!");
        for(int i = 0; i < n; System.out.println(i++));

        System.out.println("Typowym błędem jest kończenie instrukcji for średnikiem (sam średnik oznacz instrukcję pustą), tak jak poniżej:");
        for(int i = 0; i < n; i++);
            System.out.print("*");
        System.out.println("Zamiast ciągu gwiazdek zostanie wyświetlona jedna.");
        System.out.println("Pętla wykona się n razy ale w każdym powtórzeniu wykonywana jest pusta instrukcja.");



    }
}
