package java_course._1_basics.step07;

/**
 * Inkrementacja i dekrementacja.
 * Specjalne znaczenie mają dwa operatory, które modyfikują zmienne typu liczbowego:
 * ++ - zwiększa o jeden operand
 * -- - zmniejsza o jeden operand
 * Mogą wystąpić przed jak po operandzie np.
 * int a = 10;
 * a++;
 * ++b;
 *
 * Przypisanie z operatorem.
 * Operatory arytmetyczne można połączyć z operatorem przypisania do skróconego zapisu konstrukcji typu
 * a = a + 3;
 * Stosując nowe operatory przypisania można skrócić do wyrażenia:
 * a += 3;
 * W ten sposób działają przypisania z pozostałymi operatorami arytmetycznymi:
 * a -= 3;
 * a *= 3;
 * a /= 3;
 * a %= 3;
 * Dla operatorów logicznych także istnieją przypisania:
 * boolean isValid = false;
 * isValid &= true;
 * isValid |= true;
 * isValid ^= true;
 */
public class _07_1_IncrementDecrementAndAssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Inkrementacja prefiksowa powoduje najpierw zwiększenie zmiennej a potem pobranie jej wartości");
        System.out.println("Zmienna a ma wartość = " + a);
        System.out.print("++a => " + ++a);
        System.out.println(" Zmienna najpierw została zwiększona o jeden a potem przekazana do wyświetlenia");
        System.out.println("Inkrementacja postfiksowa powoduje najpierw pobranie zmiennej a potem jej zwiększenie.");
        System.out.print("a++ => " + a++);
        System.out.println(" Zmienna została najpierw przekazana do wyświetlenia a potem zwiększona o jeden.");
        System.out.println("a => " + a + " Zmienna po ponownym wyświetleniu ma nową wartość");
        System.out.println("Podobnie działają operatory dekrementacji");
        a = 10;
        System.out.println("Zmienna a ma wartość = " + a);
        System.out.println("--a => " + --a);
        System.out.println("a-- => " + a--);
        System.out.println("a => " + a);
        a = 10;
        System.out.println("Zmienna a ma wartość = " + a);
        a += 5;
        System.out.println("a += 5 => " + a);
        a = 10;
        System.out.println("Zmienna a ma wartość = " + a);
        a -= 5;
        System.out.println("a -= 5 => " + a);
        a = 10;
        System.out.println("Zmienna a ma wartość = " + a);
        a *= 5;
        System.out.println("a *= 5 => " + a);
        a = 10;
        System.out.println("Zmienna a ma wartość = " + a);
        a /= 5;
        System.out.println("a /= 5 => " + a);
        a = 10;
        System.out.println("Zmienna a ma wartość = " + a);
        a %= 5;
        System.out.println("a %= 5 => " + a);

    }
}
