package java_course._1_basics.step09;

/**
 * Konwersja wartości z lub do łańcucha
 *
 * Łańcuch jest uniwersalną formą prezentacji danych różnych typów.
 * "123" to nie to samo co liczba 123. W pierwszym przypadku w pamięci każda z cyfr zapisywana jest
 * jako liczba z kodem ASCII (lub UTF-8), czyli łańcuch "123" to ciąg bitów: 00110001 00110010 00110011,
 * Każda z liczb binarnych jest kodem ASCII znaku drukowanego na ekranie.
 * Natomiast liczba 123 zapisywana jest bezpośrednio w kodzie binarnym czyli w ciągu bitów : 01111011
 *
 * Aby wczytać liczbę do programu musimy z klawiatury wpisać ciąg kodów ASCII cyfr składających się na naszą liczbę.
 * Otrzymany łańcuch należy sparsować do typu numerycznego i na nim wykonać obliczenia.
 * Żeby zobaczyć wynik obliczeń na ekranie liczbę należy zamieć na łańcuch, czyli ciąg kodów ASCII .
 * Duża część programów składa się wiec z takiego ciągu operacji:
 *
 *              łańcuch -> liczba -> obliczenia -> łańcuch
 *
 * Źródłem danych oprócz klawiatury mogą być pliki, sieć, baza danych, inne urządzenia wejściowe itd.
 * Poniżej zapoznasz się z metodami parsowania jak i formatowania różnych typów prostych
 *
 * Konwersja łańcuchów na wartości typów prostych - parsowanie
 *
 * Każdy z typów prostych posiada odpowiadająca mu klasę.
 * int      - Integer
 * byte     - Byte
 * short    - Short
 * long     - Long
 * boolean  - Boolean
 * float    - Float
 * double   - Double
 * Każda z klas dostarcza szereg metod i pól. Do naszych celów użyteczne są:
 * - valueOf(łańcuch)
 * - valueOf(łańcuch, podstawa)     - oprócz Boolean, Double i Float
 * - parseXXX(łańcuch)              - np. klasa Integer ma metodę parseInt()
 * - parseXXX(łańcuch, podstawa)    - oprócz Boolean, Double i Float
 * Każda z wymienionych metod zwraca wartość zgodną z typem klasy.
 * Działanie metod uzależnione jest od zawartości łańcucha, jeśli w łańcuchu nie ma znaków
 * pasujących do wartości, liczby to zgłoszony zostanie błąd i program zostanie przerwany.
 * Korzystniej jest wywoływać valueOf, jeśli parsowanie jest wykonywane wielokrotnie (tysiące i więcej razy), gdyż
 * obliczane wartości są zapamiętywane i jeśli parsowany jest ponownie ten sam łańcuch, to zwracana jest zapamiętywana
 * wcześniej wartość bez konieczności wykonywania obliczeń.
 * Metoda valueOf korzysta z parsXXX i w przypadku sporadycznego parsowania w aplikacji lepiej korzystać z tego typu metod.
 *
 * Konwersja typów prostych na łańcuch
 * Metody print i println dokonują automatycznej konwersji typów prostych na łańcuch. W wielu przypadkach
 * konwersja nie jest wystarczająca, szczególnie jeśli liczb ma zostać wyświetlona w innym systemie liczbowym.
 * Można skorzystać z klas opakowujących typy proste numeryczne i ich metod:
 * - toString(wartość)
 * - toString(wartość, podstawa)        oprócz Double i Float
 * - toBinaryString(wartość)            oprócz Double i Float
 * - toHexString(wartość)
 * - toOctalString(wartość)             oprócz Double i Float
 * Także klasa String ma metody valueOf dla każdego typu prostego co pozwala na konwersję typu prostego na łańcuch.
 * Znajduję się też metoda format, która bardzo duże możliwości formatowania:
 * format(łańcuch-formatujący, argument1, argument2, ...);
 * Pierwszy argument to łańcuch formatujący, który zwiera tekst i sekwencje specjalne, w miejsce których wstawiane są odpowiednio
 * skonwertowane do łańcucha argumenty podane za łańcuchem.
 * Sekwencja specjalna rozpoczyna:
 * %[argument_index$][flags][width]conversion
 * conversion - znak oznaczający typ argumentu i format konwersji
 *      d       - liczba całkowita w zapisie dziesiętnym
 *      o       - liczba całkowita w zapisie ósemkowym
 *      x, X    - liczba całkowita w zapisie szesnastkowym
 *      f       - liczba zmiennoprzecinkowa w zapisie dziesiętnym
 *      e, E    - liczba zmiennoprzecinkowa w zapisie naukowym
 *      g, G    - liczba zmiennoprzecinkowa w zapisie naukowym lub dziesiętnym w zależności od wartości
 *      c, C    - znak
 *      s, S    - łańcuch
 *      b, B    - wartość logiczna lub null
 *      n       - znak następnego wiersza
 *      %       - znaku procenta
 * flag - znak służący do określania wypełniania pustych miejsc w polu wyświetlania
 *      '0' - wypełnianie pustych miejsc przed liczbą zerami
 *      '-' - wyrównanie do lewej wyświetlanej wartości
 *      '+' - dodaje zawsze znak przed liczbą
 *      '(' - liczby ujemne zostaną umieszczone w nawiasach
 *      ',' - zastosowanie separatora grup cyfr zgodnie z ustawieniami lokalnymi
 *      '#' - zastosowanie alternatywnej formy konwersji
 * width - szerokość pola, na którym jest drukowana wartość, dla liczb zmiennoprzecinkowych take liczb cyfr po przecinku
 *      8   - drukowanie na polu 8-miu znaków
 *      8.2 - liczb drukowana na polu 8 znaków z dwoma miejscami po przecinku
 * argument_index - indeks argumentu formatowanego prze tę sekwencję, stosowany gdy kolejność argumentów nie odpowiada kolejności sekwencji
 */
public class _09_4_StringParsingAndFormatting {
    public static void main(String[] args) {
        String integerValueInString = "123";
        int integerValue = Integer.parseInt(integerValueInString);
        System.out.println("123 * 10 = " + integerValue * 100);

        //Łańcuch z liczbą całkowitą dziesiętną
        System.out.println("Konwersja łańcucha 47 jako liczby dziesiętnej: ");
        byte decByte = Byte.valueOf("47", 10);
        System.out.println("4 * 10 + 7 = " +decByte);

        //Ten sam łańcuch, ale traktujemy tę liczbę jako ósemkową
        System.out.println("Konwersja łańcucha 47 jako liczby ósemkowej (cyfry tylko od 0 do 7): ");
        byte octByte = Byte.valueOf("47", 8);
        System.out.println("4 * 8 + 7 = " + octByte);

        //łańcuch z liczbą w kodzie szesnastkowym
        System.out.println("Konwersja łańcucha 2F jako liczby szesnastkowej (cyfry od 0 do F): ");
        byte hexByte = Byte.valueOf("2F", 16);
        System.out.println("2 * 16 + 15 = " + hexByte);

        //Parsowanie liczb typu long
        long longValue = Long.parseLong("120");
        System.out.println("Liczba 120 jako long = " + longValue);

        //parsowanie wartości logicznych
        boolean isSunny = Boolean.parseBoolean("true");
        System.out.println("Zmienna isSunny = " + isSunny);

        //parsowanie wartości rzeczywistych do double
        double doubleValue = Double.valueOf("1234.3");
        System.out.println("double 1234.3 = " + doubleValue);

        //parsowanie wartości rzeczywistych do float
        float floatValue = Float.valueOf("1234.3");
        System.out.println("float 1234.3 = " + floatValue);
        System.out.println("Różne metody konwersja wartości " + integerValue + " do łańcucha ");
        System.out.println("Liczba w kodzie binarnym = " + Integer.toBinaryString(integerValue));
        System.out.println("Liczba w kodzie ósemkowym = " + Integer.toOctalString(integerValue));
        System.out.println("Liczba w kodzie szesnastkowym = " + Integer.toHexString(integerValue));

        System.out.println(String.format("Liczba całkowita zapisana na polu o ośmiu znakach (sekwencja %% 8d):  % 8d", -integerValue*1000));
        System.out.println(String.format("Liczba całkowita zapisana na polu o ośmiu znakach ze znakiem (sekwencja %%+8d):  %+8d", integerValue*1000));
        System.out.println(String.format("Liczba całkowita zapisana na polu o ośmiu znakach z wartościami ujemnymi w nawiasach i znakami nowego wiersza (sekwencja %%n %%(8d %%n %%(8d) : %n %(8d %n %(8d", -integerValue, integerValue));
        System.out.println(String.format("Liczba całkowita zapisana na polu o ośmiu znakach z separatorem grup (sekwencja %%,8d): %,8d", integerValue*1000));
        System.out.println(String.format("Liczba ósemkowa na polu 8-znakowym i wiodącymi zerami (sekwencja %%08o):  %08o", integerValue));
        System.out.println(String.format("Liczba szesnastkowa na polu w zapisie alternatywnym (sekwencja %%#d:  %#x", integerValue));
        System.out.println(String.format("Liczba szesnastkowa na polu w zapisie alternatywnym i liczbami A-F (sekwencja %%#X):  %#X", integerValue));
        System.out.println(String.format("Liczba double o dwóch cyfrach po przecinku (sekwencja %%8.2f):  %8.2f", 1234.56789));
        System.out.println(String.format("Liczba double o dwóch cyfrach po przecinku i notacji naukowej (sekwencja %%8.2E):  %8.2E", 1234.56789));
        System.out.println(String.format("Łańcuch wielkimi literami wyrównany do prawej na polu o szerokości 30 znaków (sekwencja %%30S): %30S", "Tekst do prawej"));
        System.out.println(String.format("Złożony przykład (a i b są wyrównane do lewej, c do prawej na polu o szerokości 20 znaków): a = %,-8.2f b = %-4d c = %20s",
                12345634.6786,
                67,
                "Hello"
                ));
        int value = 4;
        System.out.println(String.format("Indeksowanie argumentów formatowania (sekwencja %%3$s %%2$d < 10 ? => %%1$B): %3$s %2$d < 10 ? => %1$B", value < 10, value, "Czy "));
    }
}
