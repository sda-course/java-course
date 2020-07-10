package part1.exercises;

public class Exercises6 {
    public static void main(String[] args) {
        /*
            1. Poniżej zadeklaruj zmienną typu double length (bez przypisywania jej wartości) i wyświetl ją funkcją println.
               Uruchom program.
        */
        double length = 0.0;
        System.out.println(length);

        /*
            2. Na podstawie komunikatu o błędzie napraw program, aby wyświetlała się liczba 0.0.
            3. Poniżej tego polecenia (tuż za komentarzem) utwórz blok i w nim ponownie zadeklaruj zmienną length ale typu int
               z wartością 10. Dodaj też instrukcję wyświetlająca lenght.
         */
        {
            int lenght = 10;
            System.out.println(lenght);
        }
        /*
            4. Za utworzonym blokiem wyświetl ponownie zmienną lenght i uruchom cały program. Spróbuj wytłumaczyć co się stało.
            5. Czy możesz w zagnieżdżonym bloku dostać się do zmiennej lenght zadeklarowanej w bloku nadrzędnym?
         */
        System.out.println(length);
    }
}
