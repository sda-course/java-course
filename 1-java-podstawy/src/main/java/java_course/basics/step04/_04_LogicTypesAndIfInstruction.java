package java_course.basics.step04;
/*
  Typ logiczny, wyrażenia logiczne i instrukcja warunkowa if
 */
public class _04_LogicTypesAndIfInstruction {
    public static void main(String[] args) {
        /**
         * Typ logiczny boolean definiuje tylko dwie wartości
         */

        boolean isMature = true;
        boolean isRetired = false;
        /**
         * Bardzo często musimy porównywać wartości liczbowe, a wynikiem porównania jest właśnie wartość logiczna
         */
        int n = 26;
        boolean isGreaterThan18 = n > 18;
        /**
         * Do tworzenie tego typu wartości logicznych stosujemy operatory porównania
         */
        //większe >
        System.out.println(n > 18);
        //mniejsze
        System.out.println(n < 18);
        //równe
        System.out.println( n == 18);
        //większe równe i mniejsze równe
        System.out.println(n >= 18);
        System.out.println( n <= 18);
        //różne
        System.out.println( n != 18);
        /**
         *
         * Aby sprawdzić, czy liczba znajduje się w zakresie np. miedzy 18 a 65, musimy zastosować operator logiczny &&
         */
        System.out.println(n >= 18 && n < 65); //operator koniunkcji - oba operandy muszą być prawdą, aby wynik był prawdą
        /**
         * Pozostałe operatory
         * alternatywa ||, poniżej równoważnik operatora relacji większe równe
         */
        System.out.println(n == 18 || n > 18); //wartość jest prawdą jeśli choć jeden z operandów jest też prawdą
        /*
            Instrukcja warunkowa
            W zależności od wartości logicznej możemy wykonać jedną z dwóch instrukcji
         */
        if (n >= 18){                           //w nawiasie podajemy warunek, czyli wartość logiczną lub wyrażenie logiczne
            System.out.println("Dorosły");      //ta instrukcja zostanie wykonana jeśli warunek jest prawdą
        } else {
            System.out.println("Nieletni");     //ta instrukcja zostanie wykonana jeśli warunek jest fałszem
        }
        System.out.println("KONIEC IF");        //ta instrukcja zostanie wykonana po zakończeniu if
        /*
           Powyższy przykład można też zapisać jak poniżej, jeśli wykonujemy tylko jedną instrukcję
         */
        if (n >= 18)
            System.out.println("Dorosły");
        else
            System.out.println("Nieletni");
        /*
           Ale zawsze stosuj w instrukcji if blok!!! Unikniesz wielu błedów!!!
         */

        /*
            Słowo 'else' nie jest obowiązkowe, gdy jego brak to dla wyrażenia równego 'false' nic się nie stanie
         */
        if(n == 18){
            System.out.println("n jest równe 18");
        }
        System.out.println("NASTĘPNA INSTRUKCJA");  //dla każdego n rożnego od 18 wykonana zostaie do razu następna instrukcja
        /*
            Zagnieżdżanie instrukcji
            Czasem trzeba w gałęzi instrukcji if umieścić kolejną instrukcję if co prowadzi
            do zagnieżdżania. W ten sposób kod staje się coraz bardzie nieczytelny, konieczne jest
            analizowanie kilku warunków, żeby stwierdzić, która gałąź zostanie wykonana.
         */
        n=20;
        if (n == 18){
            System.out.println("100 lat!");
        } else{
            if ( n > 18 && n < 65) {
                System.out.println("Wiek produkcyjny");
            } else
            if (n < 18) {
                System.out.println("Nieletni");
            } else{
                System.out.println("Emeryt?");
            }
        }
        /*
            W wielu przypadkach można uniknąć zagnieżdżeń stosując inne konstrukcje
         */
    }

}
