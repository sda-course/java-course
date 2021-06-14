package java_course._1_basics.step09;

import java.util.Arrays;

/**
 * Klasa String
 *
 * Klasa String reprezentuje wszystkie napisy w programach Java. Ma ona uprzywilejowaną pozycję bo:
 * - do tworzenia obiektów tej klasy nie musimy wywoływać konstruktora i operatora new,
 * - łączenie łańcuchów wykonujemy operatorem +, który można stosować tylko dla typów prostych liczbowych, a klasa String
 *   jest jedyny wyjątkiem.
 * Łańcuch jest obiektem, który udostępnia bogatą listę metod.
 */
public class _09_1_String {
    public static void main(String[] args) {
        //Zalecana forma tworzenia łańcuchów
        String title = "Hello World! Cześć świecie!  ";

        //Można też tworzyć łańcuchy konstruktorem, ale nie jest to wskazane
        String article = new String("Programming in Java");

        //Obiekty klasy String są niemutowalne, co oznacza, że nie można nic w nich zmienić
        //Metody, które wykonują działanie na łańcuchu zwracają nowe łańcuchy

        //liczba znaków
        int length = title.length();
        System.out.println("\"Hello World! Cześć świecie!  \".length() => " + length);

        //utworzenie nowego łańcucha z wielkimi literami
        String capitalizedTitle = title.toUpperCase();
        System.out.println("\"Hello World! Cześć świecie!  \".toUpperCase() => " + capitalizedTitle);

        //łańcuch z małymi literami
        System.out.println("\"Hello World! Cześć świecie!  \".toLowerCase() => " + title.toLowerCase());

        //czwarty znak napisu, bo znaki są indeksowane od 0
        System.out.println("\"Hello World! Cześć świecie!  \".charAt(7) => " + title.charAt(7));

        //usunięcie zbędnych białych znaków z początku i końca łańcucha
        System.out.println("\"    Hello    World!          \".trim() => " + "    Hello    World!    ".trim());

        //wycięcie fragmentu łańcucha od znaku o podany indeksie do końca
        System.out.println("\"Hello World! Cześć świecie!  \".substring(4) => " + title.substring(4));

        //wycięcie fragmentu łańcucha pomiędzy podanymi indeksami
        System.out.println("\"Hello World! Cześć świecie!  \".substring(4, 8) => " + title.substring(4, 8));

        //Zamiana znaków w łańcuchu
        System.out.println("\"Hello World! Cześć świecie!  \".replace(\"Hello\", \"Hi\") => " + title.replace("Hello", "Hi"));

        //Określenie indeksu pierwszego wystąpienia znaku lub łańcucha
        System.out.println("\"Hello World! Cześć świecie!  \".indexOf(\'l\') => " + title.indexOf('l'));
        System.out.println("\"Hello World! Cześć świecie!  \".indexOf(\"Wo\") => " + title.indexOf("Wo"));

        //Określenie indeksu ostatniego wystąpienia znaku lub łańcucha
        System.out.println("\"Hello World! Cześć świecie!  \".lastIndexOf(\'l\') => " + title.lastIndexOf('l'));
        System.out.println("\"Hello World! Cześć świecie!  \".lastIndexOf(\"Wo\") => " + title.lastIndexOf("Wo"));

        //Tworzenie łańcucha jako powtórzenia innego
        System.out.println("\"Hello \".repeat(4) => " + "Hello ".repeat(4));

        //Test czy łańcuch zaczyna się od prefiksu
        System.out.println("\"Hello World! Cześć świecie!  \".startsWith(\"Hello\") => " + title.startsWith("Hello"));

        //Test czy łańcuch kończy się postfiksem
        System.out.println("\"Hello World! Cześć świecie!  \".endsWith(\"Hello\") => " + title.endsWith("Hello"));

        //Porównywanie łańcuchów
        System.out.println("\"Hello World! Cześć świecie!  \".equals(\"Hello\") => " + title.equals("Hello"));

        //Porównywanie łańcuchów bez uwzględniania wielkości liter
        System.out.println("\"HeLLo\".equalsIgnoreCase(\"hello\") => " + "HeLLo".equalsIgnoreCase("hello"));

        //Podział łańcucha na tablicę łańcuchów - tokenów. Argumentem metody jest łańcuch, który służy do rozdzielania
        String str = "123 890 789 789 9 890 78";
        String[] tokens = str.split(" ");
        System.out.println("str = \"123 890 789 789 9 890 78\"");
        System.out.println("Tablica łańcuchów po wykonaniu str.split(\" \"): => " +Arrays.toString(tokens));
        str = "Adam\tEwa\tKarol";
        String[] names = str.split("\t");
        System.out.println("str = \"Adam\\tEwa\\tKarol\"");
        System.out.println("Tablica łańcuchów po wykonaniu str.split(\"\\t\") => " + Arrays.toString(names));
    }
}
