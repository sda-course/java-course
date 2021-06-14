package java_course._1_basics.step04;

/**
 * Operator trójwartościowy
 *
 * Jest to operator działający podobnie do instrukcji if z klauzulą else
 * ale służy wyłącznie do zwracania wartości, więc nie można w nim umieszczać instrukcji!
 *
 * Postać wyrażenia:
 * wyrażenie-logiczne ? wartość-jeśli-prawda : wartość-jeśli-fałsz
 * przy czym wartość-jeśli-prawda i wartość-jeśli-fałsz muszą być tego samego typu!!!
 *
 * zmienna = if (wyrażenie-logiczne)
 *              wartość-jeśli-prawda
 *           else
 *              wartość-jeśli-fałsz
 * Każde wyrażenie trójwartościowe można zamienić na instrukcję if..else,
 * ale nie każdą instrukcję if..else można zamienic na wyrażenie trójwartościowe !!!
 */
public class _04_2_ElvisOperator {
    public static void main(String[] args) {
        int value = -67;
        //Przykłady
        //Wartość bezwzględna
        int absValue = value < 0  ? - value : value;
        System.out.println(absValue);

        //Zerowanie wartości poza zakresem
        int result = value > 0 && value < 100 ? value : 0;
        System.out.println(result);

        //Zamiana małej litery na dużą.
        char letter = 't';
        char bigLetter = letter >= 'a' && letter <= 'z' ? (char) ('A' + letter - 'a') : letter;
        System.out.println(bigLetter);

        //Operator można zagnieżdżać
        int age  = 45;
        System.out.println(age > 18 ? "dorosły" : age < 10 ? "dziecko" : "nastolatek");

        //odpowiadająca konstrukcja z instrukcją if
        if (age > 18) {
            System.out.println("dorosły");
        } else {
            if (age < 10){
                System.out.println("dziecko");
            } else {
                System.out.println("nastolatek");
            }
        }
    }
}
