package java_course.basics.step01;

/**
 * Znaki specjalne
 */
public class _01_EscapeCharacters {
    public static void main(String[] args) {
        System.out.println("Wyświetlenie za pomocą trzech wywołań println");
        System.out.println("  123");
        System.out.println("+ 456");
        System.out.println("-----");
        System.out.println("  579");

        System.out.println("Znaki specjalne:");
        System.out.println("\\b  - usunięcie ostatniego znaku i przesunięcie kursora w prawo.");
        System.out.println("\\n  - wstawienie znaku nowego wiersza -  powoduje przejście do następnego wiersza.");
        System.out.println("\\t  - wstawienie znaku tabulatora - powoduje przejście kursora do następnej kolumny.");
        System.out.println("\\\"  - wyświetlenie znaku \".");
        System.out.println("\\\\  - wyświetlenie znaku \\.");

        System.out.println("Przykład dla \\n - poprzedni tekst wyświetlony jednym wywołaniem println");
        System.out.println("  123\n+ 456\n-----\n  579");

        System.out.println("Przykład dla \\t - przesunięcie do drugiej kolumny");
        System.out.println("\t123");
        System.out.println("+\t456");
        System.out.println("\t---");
        System.out.println(" \t579");

        System.out.println("Przykład wykorzystania \\\\ i \\\"");
        System.out.println("Ścieżka do pliku: \"C:\\Program Files\\Java\"");

        System.out.println("Długie napisy można też rozbić na wiele wierszy dodając na końcu znak plus '+' (oprócz wiersza ostatniego)");
        System.out.println(
                "pierwszy wiersz\n" +
                "drugi wiersz\n" +
                "trzeci wiersz\n"
        );
        /*
         * Istnieją też sekwencje specjalne do sterowania kolorem wyświetlanego tekstu. Działanie tych sekwencji zleży od typu konsoli i systemu operacyjnego,
         * na którym uruchomiony jest program. Wyświetlenie tej sekwencji powoduje tylko zmianę bieżącego koloru czcionki lub tła.
         */
        System.out.println("Zmiana koloru czcionki");
        System.out.print("\033[0;90m");     System.out.println("BLACK");
        System.out.print("\033[0;91m");     System.out.println("RED");
        System.out.print("\033[0;92m");     System.out.println("GREEN");
        System.out.print("\033[0;93m");     System.out.println("YELLOW");
        System.out.print("\033[0;94m");     System.out.println("BLUE");
        System.out.print("\033[0;95m");     System.out.println("PURPLE");
        System.out.print("\033[0;96m");     System.out.println("CYAN");
        System.out.print("\033[0;97m");     System.out.println("WHITE");

        System.out.println("Reset powoduje przywrócenie ustawień domyślnych");
        System.out.print("\033[0m");      System.out.println("RESET");
        System.out.println("Zmiany koloru tła" + "\033[0;97m");
        System.out.print("\033[1;100m");       System.out.println("BLACK");
        System.out.print("\033[1;101m");       System.out.println("RED");
        System.out.print("\033[1;102m");       System.out.println("GREEN");
        System.out.print("\033[1;103m");       System.out.println("YELLOW");
        System.out.print("\033[1;104m");       System.out.println("BLUE");
        System.out.print("\033[1;105m");       System.out.println("PURPLE");
        System.out.print("\033[1;106m");       System.out.println("CYAN");
        System.out.print("\033[0;90m" + "\033[1;107m");       System.out.println("WHITE");

        System.out.print("\033[0m");
        System.out.println("Jednoczesne ustawienie obu kolorów: najpierw należy podać kolor czcionki a potem tła");
        System.out.print("\033[0;93m" + "\033[1;104m");       System.out.println("YELLOW ON BLUE BACKGROUND");
    }
}
