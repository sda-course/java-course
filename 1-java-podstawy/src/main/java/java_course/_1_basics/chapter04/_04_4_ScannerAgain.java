package java_course._1_basics.chapter04;

import java.util.Scanner;

/**
 * <h1>Scanner i testowanie danych wejściowych
 *
 * <p>Scanner posiada metody do testowania wczytywanych danych. Pozwalają stwierdzić czy dane wejściowe
 * są zgodne z żądanym typem. Gdy oczekujemy wczytania liczby całkowitej to wywołując
 * metodę hasNextInt() możemy się upewnić, że istotnie użytkownik wpisał liczbę całkowitą.
 * Dzięki pewności możemy bezpiecznie wywołać odpowiednią metodę wczytującą i uniknąć
 * zgłoszenia błędu.
 *
 * <p>Metody do testowania:
 * <ol>
 *     <li>
 *         {@code hasNextByte()} - czy wartość pasuje do liczby od -127 do 128
 *     </li>
 *     <li>
 *         {@code hasNextShort()} - czy wartość pasuje do liczby typu {@code short}
 *     </li>
 *     <li>
 *         {@code hasNextInt()}  - czy wartość pasuje do liczby typu {@code int}
 *     </li>
 *     <li>
 *         {@code hasNextLong()} - czy wartość pasuje do liczby typu {@code long}
 *     </li>
 *     <li>
 *         {@code hasNextDouble()} - czy wartość jest liczbą typu {@code double}
 *     </li>
 *     <li>
 *         {@code hasNextFloat()} - czy wartość jest liczbą typu {@code float}
 *     </li>
 *     <li>
 *         {@code hasNextBoolean()} - czy wartość jest true lub false
 *     </li>
 *     <li>
 *         {@code hasNextLine()}    - czy jest dostępny wiersz tekstu do wczytania
 *     </li>
 *     <li>
 *         {@code hasNext()}        - czy jest dostępne następne słowo, token
 *     </li>
 * </ol>
 *
 * <p>Należy pamiętać, że jeśli dana nie pasuje do oczekiwanego typu a chcemy ją pominąć i wczytać następną, to
 * należy obecne usunąć wykonując odczyt napisu. Odczyt możemy zrealizować metodą {@code next()} jeśli dana stanowi
 * jedno słowo, token lub {@code nextLine()} jeśli wszystkie dane do końca wiersza</p>
 */
public class _04_4_ScannerAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Przykład 1. Testowanie czy dana jest zgodna z typem całkowitym. Jeśli nie, to wyświetlamy komunikat.");
        System.out.println("Wpisz liczbę całkowitą:");
        //Testujemy, czy użytkownik wpisał liczbę całkowitą
        if (scanner.hasNextByte()) {
            //możemy bezpiecznie wywołać metodę do wczytywania typów całkowitych
            int number = scanner.nextInt();
            System.out.println("Kwadrat " + number + " wynosi " + Math.pow(number, 2));
            scanner.nextLine();
        } else {
            System.out.println("Nie wpisałem poprawnie liczby całkowitej!");
        }

        System.out.println("Przykład 2. Pominięcie danej jeśli została wpisana niepoprawnie.");
        double n = 1, m = 1;
        System.out.println("Wpisz dwie dowolne liczby n i m: ");
        System.out.println("Jeśli któraś z liczb nie zostanie poprawnie wpisana, to przyjęta zostanie dla niej wartość domyślna.");
        System.out.print("n = ");
        if (scanner.hasNextDouble()){
            n = scanner.nextDouble();
        } else {
            System.out.println("Brak poprawnej wartości n. Przyjęto n = 1.");
            //Aby wczytać następne dane, należy pobrać obecne, nawet jeśli nie są zgodne z oczekiwaniami.
            //Jeśli tego nie zrobimy to metody testowe będą ciągle sprawdzać tę samą daną.
            System.out.println(scanner.nextLine());
        }
        System.out.print("m = ");
        if (scanner.hasNextDouble()){
            m = scanner.nextDouble();
        } else {
            System.out.println("Brak poprawnej wartości m. Przyjęto m = 1.");
            scanner.nextLine();
        }
        System.out.println("n * m = " + n * m);
    }
}
