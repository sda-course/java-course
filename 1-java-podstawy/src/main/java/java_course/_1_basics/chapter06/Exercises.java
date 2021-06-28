package java_course._1_basics.chapter06;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbę od 1 do 10: ");
        int count = scanner.nextInt();
        if (count > 10 || count < 0){
            count = 10;
        }
        /*
        1. Przy pomocy instrukcji while wyświetl wartość zmiennej count tyle razy, ile ona wynosi.
        Np. dla count = 3 wyświetli
        3
        3
        3
         */

        /*
        2. Przy pomocy instrukcji while wyświetl kolejne liczby od 5 do 5 + count.
        Np. dla count = 3
        5
        6
        7
        8
         */

        /*
        3. Przy pomocy do..while wyświetl liczby od count do count * 2
        Np. dla count = 5
        5
        6
        7
        8
        9
        10
         */

        /*
        4. Przy pomocy instrukcji while napisz strukturę, która tak długo będzie próbowała odczytać wartość typu double, aż
        użytkownik wpisze ją poprawnie (przykład w programie _6_3_ScannerAgain)
         */
    }
}
