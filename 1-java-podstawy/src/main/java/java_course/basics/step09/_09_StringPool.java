package java_course.basics.step09;

/**
 * Pula łańcuchów
 * Jest jeszcze jeden element odróżniający klasę String od pozostałych klas. Wszystkie obiekty tworzone literałami
 * są umieszczane w specjalnym obszarze zwanym pulą łańcuchów. Jeśli w programie pojawi się następny łańcuch utworzony literałem z tą
 * samą sekwencją znaków to wykorzystywany jest już istniejący łańcuch.
 * Należy jednak pamiętać, że do puli nie dodawane są:
 * - łańcuchy zwracane przez metody klasy String np. "Hello".substring(2)
 * - łańcuchy tworzone operatorem new
 */
public class _09_StringPool {
    public static void main(String[] args) {
        String message = "Hello";
        //Porównanie referencji message z literałem o ty samym napisie zwróci prawdę,
        //bo do zapamiętania literału wykorzystywany jest ten sam łańcuch wskazywany przez message
        System.out.println("Hello" == message);
        //Utworzenie nowego literału konkatenacją też powoduje wykorzystanie istniejącego już łańcucha
        System.out.println("He" +"llo" == message);
        System.out.println(message.substring(2));
        //Nowy łańcuch otrzymany z dowolnej metody klasy String nie jest dodawany do puli i dlatego to porównanie jest już równe false
        System.out.println(message.substring(2) == "llo");
        //Aby nie pamiętać o tych niuansach ZAWSZE porównuj łańcuchy metodą equals lub equalsIgnoreCase
        System.out.println(message.substring(2).equalsIgnoreCase("llo"));
    }
}
