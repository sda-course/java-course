package java_course._1_basics.chapter02;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Operatory arytmetyczne
 */
public class _02_1_ArithmeticOperators {
    public static void main(String[] args) {
        /*
         Wyrażenia z operatorami arytmetycznymi
         */
        //dodawanie
        System.out.println(40 - 30);

        //odejmowanie
        System.out.println(40 + 30);

        //mnożenie
        System.out.println(20 * 30);

        //dzielenie
        System.out.println(40 / 30);

        //modulo, reszta z dzielenia
        System.out.println( 40 % 30);
        /*
          Budowa wyrażenia:
          -, +, *, /, % :   to operatory binarne, tzn. że wymagają podania dokładnie dwóch liczb
          40, 30        :   to operandy
         */

        /*
         Tworzenie złożonych wyrażeń
         */

        //Każde wyrażenie zwraca wartość, którą możemy wykorzystać w innym wyrażeniu.
        System.out.println(2 + 9 / 3 * 7);

        //Jeśli nie jesteśmy pewni kolejności obliczeń, możemy zastosować nawiasy, które grupują wyrażenia obliczane jako pierwsze
        System.out.println((2 + 9) / 3 * 7);

        //liczby dziesiętne zapisujemy z użyciem kropki jako separatora.
        System.out.println(40.0/30);

        //dzielenie dwóch liczb całkowitych, czyli zapisanych bez kropki, daje wynik całkowity.
        System.out.println(40 / 30);

        //dzielenie dwóch liczb, z których choć jedna jest dziesiętna, czyli z kropką, daje wynik dziesiętny.
        System.out.println(40.0 / 30);

        //dzielenie przez zero liczby całkowitej generuje błąd, który zatrzymuje dalsze wykonywanie programu.
        System.out.println(40 / 0);

        //wstaw znak komentarza przed instrukcją powodującą błąd!!!
        //dzielenie przez zero, gdy jedna z liczb jest dziesiętna, nie powoduje błędu, ale zwraca wartość Infinity.
        System.out.println(40 / 0.0);

        //Dokładny wynik dzielenia całkowitego można podać jako dwie liczby: wynik dzielenie i reszta.
        System.out.print("Wynik dzielenia 40 / 30 = ");
        System.out.print(40 /30);
        System.out.print(" i reszta ");
        System.out.println(40 % 30);

        //UWAGA!!!
        //działania na liczbach dziesiętnych w rzeczywistości nie są prowadzone na takich liczbach,
        // a wyświetlany wynik jest też zaokrąglany do liczby dziesiętnej

        System.out.println(0.1 * 0.1 * 1245 - 12.45); //WYNIK POWINIEN BY ZERO, ALE JEST INNY
        //Dlaczego tak jest dowiemy się później.
    }
}
