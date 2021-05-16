package java_course.basics.step11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Wyrażenia regularne - przykłady
 */
public class _11_RegularExpressions {
    public static void main(String[] args) {
        var str = "5";
        System.out.println("Czy łańcuch '" + str + "' jest liczbą: " + str.matches("\\d"));
        System.out.println("Czy łańcuch '" + str + "' zawiera jeden dowolny znak: " + str.matches("."));
        str = "123";
        System.out.println("Czy łańcuch '" + str + "' zawiera 3 liczby? " + str.matches("\\d\\d\\d"));
        str = "1ab";
        System.out.println("Czy łańcuch '" + str + "' składa się z trzech dowolnych znaków? " + str.matches(".{3}"));
        System.out.println("Czy łańcuch '" + str + "' ma długość co najmniej 3 znaków? " + str.matches("...*"));
        str = "12345";
        System.out.println("Czy łańcuch '" + str + "' zawiera 3 lub więcej liczb? " + str.matches("\\d{3,}"));
        str = "123abc";
        System.out.println("Czy łańcuch '" + str + "' zawiera 1 lub więcej znaków? " + str.matches("\\w+"));
        System.out.println("Czy łańcuch '" + str + "' zaczyna się od 3 cyfr? " + "123abc".matches("\\d{3}.*"));
        System.out.println("Czy łańcuch '" + str + "' zawiera 3 cyfry i trzy dowolne znaki? " + "123abc".matches("\\d{3}\\w{3}"));
        System.out.println("Czy łańcuch '" + str + "' nie zawiera żadnej cyfry? " + str.matches("\\D*"));
        str = "abc def";
        System.out.println("Czy łańcuch '" + str + "' składa się z dwóch słów? " + str.matches("\\w*\\s\\w*"));
        System.out.println("Czy łańcuch '" + str + "' składa się z dwóch słów zbudowanych ze znaków od a do f ? " + str.matches("[a-f]*\\s[a-f]*"));
        str = "12";
        System.out.println("Czy łańcuch '" + str + "' zawiera liczbę dwucyfrową do 1 do 15? " + str.matches("[1\\s][0-5]|[1-9]"));

        //Wyszukiwanie grup w łańcuchu; dwie kolejne cyfry-
        Pattern pattern;
        pattern = Pattern.compile("(\\d{2})");

        str = "W roku 2018 powstała wersja 11 języka Java! W następnym roku opublikowano wersje 12 i 13.";
        System.out.println("Przeszukiwany łańcuch: " + str);
        System.out.println("Pattern: " + pattern.toString());
        System.out.println("Niestety do niego pasują także liczby złożone z większej liczby cyfr!");
        Matcher matcher = pattern.matcher(str);
        int count = 1;
        while (matcher.find()) {
            System.out.println("Znaleziono  wystąpienie nr " + count++ + ": " + matcher.group(1));
        }
        //(?:\\s+) - grupa, która będzie ignorowana, co najmniej jeden znak biały
        //(?:[\\D\\s] - druga pomijana grupa, jeden znak nie będący cyfrą lub znak biały
        pattern = Pattern.compile("(?:\\s+)(\\d{2})(?:[\\D\\s])");
        System.out.println("Przeszukiwany łańcuch: " + str);
        System.out.println("Pattern: " + pattern.toString());
        matcher = pattern.matcher(str);
        count = 1;
        while (matcher.find()) {
            System.out.println("Znaleziono  wystąpienie nr " + count++ + ": " + matcher.group(1));
        }
    }
}
