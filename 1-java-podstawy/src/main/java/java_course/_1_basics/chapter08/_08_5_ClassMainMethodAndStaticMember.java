package java_course._1_basics.chapter08;

/**
 *<h1>Klasa i metoda main
 *
 * <p>Program w Java jest językiem obiektowym,  a obiekty sa tworzone na podstawie klasy, więc klasa
 * jest podstawowym elementem programu w Java.
 * Tylko w klasie możliwe jest umieszczanie bloku, który jest jednym dopuszczalnym miejscem na instrukcje.
 * Każdy program w Java musi zawierać co najmniej jedną klasę. Jeśli klasa jest programem to musi też zawierać
 * metodę {@code main}.
 *
 * <h2>Składowe statyczne
 *
 * <p>Zadaniem klasy jest definiowanie pól i metod obiektów, a dostęp do tych składowych jest możliwy dopiero w obiektach.
 * Są jednak sytuacje, gdy pole musi być współdzielone przez wszystkie obiekty klasy, czyli jeśli obiekt A zmieni takie pole,
 * to obiekt B odczyta zmienioną wartość przez A.
 * Pola współdzielone między obiektami są polami statycznymi, które deklaruje się ze słowem static umieszczonym na początku deklaracji.
 *
 * <p>Podobnie do pól możliwe jest też zdefiniowanie metod statycznych. Metoda statyczna jest przypisana do klasy więc, aby ją wywołać,
 * nie musimy tworzyć instancji klasy. Można taką metodę wywołać, podając nazwę klasy.
 * To pociąga za sobą konsekwencję: w takich metoda nie można odwoływać się pól instancyjnych, bo po prostu może nie być obiektu w trakcie
 * jej wywołania!
 *
 * <p>Przykładem takiej metody jest main. Maszyna JVM zakłada, że jeśli klasa posiada metodę o takiej sygnaturze, to bez potrzeby tworzenia obiektu
 * takiej klasy wywołuje metodę main i wykonywane są zawarte w niej instrukcje. W taki sposób działa nasz programu.
 *
 * <p>Można zatem porównać klasę do specyficznego obiektu, który służy do tworzenia innych obiektów. Składowe statyczne to składowe,
 * które nie będą wykorzystywane do tworzenia obiektów tej klasy, ale są przypisane tylko do klasy.
 *
 * <p>Przykładem klasy z metodami statycznymi jest {@code Math}, której wszystkie metody są statyczne, nie można utworzyć obiektu tej klasy. Zadaniem klasy
 * jest tylko dostarczenie funkcji matematycznych
 */
public class _08_5_ClassMainMethodAndStaticMember {
    /**
     * Metoda main ma zawsze poniższą sygnaturę. Parametr args jest listą łańcuchów, które są parametrami wywołania programu.
     * static - oznacza składową statyczną, czyli taką która jest przypisana do klasy, więc nie jest konieczna instancja klasy do wywołania
     * public - metoda jest dostępna dla wszystkich pozostałych klas
     * void   - nie zwraca żadnej wartości
     */

    //Pole instancyjne
    int register = 0;

    //Pole statyczne
    static public int COUNTER = 0;

    //Metoda statyczna
    static public void printMenu(){
        COUNTER++;
        System.out.println("1. Dodaj");
        System.out.println("2, Odejmij");
        System.out.println("3. Pomnóż");
        System.out.println("0. Koniec");
    }
    //Metoda instancyjne klasy
    void printMessage(String message){
        register++;
        System.out.println(message);
    }
    //Metoda statyczna, od której zaczyna się wykonywanie programu
    //args jest tablicą z parametrami wywołania programu
    public static void main(String[] args) {

        //w metodzie statycznej można odwołać się tylko do składowych statycznych klasy do której main należy
        System.out.println("Odwołania do składowych statycznych wewnątrz klasy nie wymaga podania klasy.");

        //wywołanie metody statycznej
        System.out.println("Wywołanie metody statycznej.");
        printMenu();
        //tak należy wywołać tę  metodę w innej klasie
        _08_5_ClassMainMethodAndStaticMember.printMenu();
        //pełne odwołanie do pola statycznego, wewnątrz klasy wystarczy COUNTER
        System.out.println("Pole statyczne COUNTER " + _08_5_ClassMainMethodAndStaticMember.COUNTER);


        //Klasa z metodą main, jest zwykła klasą, więc można tworzyć obiekty tej klasy
        System.out.println("Tworzymy instancję klasy");
        _08_5_ClassMainMethodAndStaticMember app = new _08_5_ClassMainMethodAndStaticMember();
        System.out.println("app => " + app);

        //Teraz możemy dostać się do pola instancyjnego
        System.out.println("Odwołanie do składowych instancyjnych.");
        System.out.println("app.register => " + app.register);
        app.printMessage("Hello");

        //Do pól statycznych też można się wywołać za pomocą obiektów tej klasy
        System.out.println("Odwołanie do składowej statycznej przy pomocy instancji.");
        System.out.println("app.COUNTER = 10 => " + (app.COUNTER = 10));
        //co powoduje zmianę wspólnej wartości
        System.out.println("COUNTER => " + COUNTER);
    }
}
