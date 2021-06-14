package java_course._1_basics.step03;

/**
 * Zmienne i podstawowe typy
 */
public class _03_1_VariablesAndTypes {
    public static void main(String[] args) {
        //Zmienna to nazwa, do której możemy przypisać wartość
        //Zamiast obliczać pole i obwód dla konkretnych długości boków
        System.out.println(40 * 30);
        System.out.println((40 +30) * 2);
        //Możemy zastąpić konkretne wartości zmiennymi, które przechowują długości boków
        int sideA = 40;
        int sideB = 30;
        System.out.println(sideA * sideB);
        System.out.println((sideA + sideB) * 2);
        //Żeby wykonać obliczenia dla prostokąta o innych bokach wystarczy w jednym miejscu zmienić przypisane długości
        //tworzenie zmiennej to deklaracja, w której podajemy nazwę i typ oraz określamy wartość zmiennej
        /*
        Typy
        zmienne muszą posiadać typ, który określa np. rodzaj liczby w niej przechowywanej
        Rodzaje typów w Java:
        całkowite:
        byte
        char
        short
        int
        long
        zmiennoprzecinkowe:
        float
        double
        logiczne:
        boolean
         */

        /*
        Deklaracja
        typ nazwa = wartość;
        Nazwa zmiennej może zawierać litery, cyfry oraz znaki _ i &, można używać znaków narodowych, ale nie ROBIMY TEGO!!!
        Zmienne nazywamy po angielsku, w wyjątkowych sytuacjach po polsku, jeśli specyfika zmiennej jest związana np.
        z prawem polskim, przepisami, regulacjami lub gdy brak adekwatnej nazwy angielskiej np. pesel, nip, regon itd.
        Nazwy nie zaczynamy cyfrą!!! Nazwę zmiennej piszemy małymi literami - taka jest konwencja, której należy się trzymać.
        Nazwa zmiennej to identyfikator. Jeśli identyfikator składa się z kilku słów to stosujemy camelCase - każde następne słowo
        zaczynamy z dużej litery
        */

        //zmienna całkowita
        int variableA = 10;
        //duże liczby możemy zapisać z grupowaniem
        int population = 12_345_256;
        //możemy też wartości zmiennej wyrażać w innych systemach liczbowych
        int binary = 0b1100101;     //0b to prefiks za którym podajemy cyfry binarne
        int octal = 010;            //0 jest prefiksem, za którym podajemy cyfry ósemkowe - od 0 do 7
        int hexadecimal = 0xFF13;   //0x to prefiks, za którym podajemy cyfry kodu szesnastkowego
        //zmienna zmiennoprzecinkowa - litera 'd' po liczbie sygnalizuje, że '10.4' zostanie zapisane w typie double zanim
        //nastąpi przypisanie tej wartości do zmiennej radius
        double radius = 10.4d;
        //typy zmiennoprzecinkowe są zapisywane w kodzie binarnym, ale my podajemy ich wartości w kodzie dziesiętnym
        float percent = 0.01f;
        //to powoduje, że kompilator musi zapisać wartość w kodzie dwójkowym, co dla niektórych liczb powoduje zaokrąglenie
        //np. 0.1 czyli 1/10 nie da się zapisać bez zaokrąglenia w kodzie dwójkowym bo nie ma takiego ułamka, który miałby w mianowniku
        //potęgę 2 i byłby równy ułamkowi 1/10
        System.out.println(0.1f * 0.1f);
        //ale liczbę 0.5 da się zapisać w kodzie binarnym (to 1/2) więc i wynik będzie bezbłędny.
        System.out.println(0.5f * 0.5f);
        /*
        Operator przypisania '=' służy do:
        1. Inicjacji zmiennej,
        2. Przypisania do zmiennej nowej wartości.
        */
        int area = 8;
        area = 56 * 9;
        /*
        Instrukcja - to taki fragment kodu zakończony średnikiem, który jest wykonywany.
        Wszystkie poznane przez nas programy zawierały co najmniej jedną instrukcję:
        */
        System.out.println("Hello");    //instrukcja wywołania metody drukującej na ekran
        int a = 10;                     //instrukcja deklaracji i inicjacji zmiennej
        a = 4 * 5;                      //instrukcja obliczenia wyrażenia z operatorem mnożenia i przypisanie
        /*
        W Java instrukcja zawierająca wyłącznie wyrażenie musi zawierać operator przypisania!
        UWAGA!!!
        operatora '=' nie należy rozumieć jako równości, ale jako przeniesienie wartości z prawej strony do lewej strony.
        Po lewej stronie zawsze musi znaleźć się rodzaj zmiennej (modyfikowalna wartość).
         */
        System.out.print("Wartość area przed: ");
        System.out.println(area);
        area = area / 2; //należy rozumieć jako area <- area / 2 czyli po obliczeniu area / 2 zmienna area ma dwa razy mniejszą wartość
        System.out.print("Wartość area po: ");
        System.out.println(area);
    }
}
