package part1;

/**
 * Znaki specjalne
 */
public class Program2 {
    public static void main(String[] args) {
        System.out.println("  123");
        System.out.println("+ 456");
        System.out.println("-----");
        System.out.println("  579");
        /*
        znaki specjalne:
        \n  - wstawienie znaku nowego wiersza -  powoduje przejscie do nastęonego wiersza
        \t  - wstawienie znaku tabulatora - powoduje przejście tabulatora do nastepnej kolumny
        \"  - wyświetlenie znaku "
        \\  - wyświetlenie znaku \
         */
        //Przykład dla \n - pierwszy tekst wyświetlony jednym wywołaniem println
        System.out.println("  123\n+ 456\n-----\n  579");
        //Przykład dla \t - przesunięcie do drugiej kolumny
        System.out.println("\t123");
        System.out.println("+\t456");
        System.out.println("\t---");
        System.out.println(" \t579");
        //Przykład dla \" i \\
        System.out.println("Ścieżka do pliku: \"C:\\Program Files\\Java\"");
        //Długie napisy można też rozbić na wiele wierszy dodając na końcu wiersza znak plus '+' (obrócz wiersza ostatniego)
        System.out.println(
                "pierwszy wiersz\n" +
                "drugi wiersz\n" +
                "trzeco wiersz\n"
        );
    }
}
