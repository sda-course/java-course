package java_course._1_basics.chapter07;

/**
 * Instrukcje break, continue i etykiety.
 * Instrukcja break służy do przerywania wykonywania bieżącej instrukcji iteracyjnej.
 * Instrukcja continue służy do pominięcia wykonywania bieżącej iteracji i powrót do wyrażenia logicznego
 * Etykiety mogą pojawić się tylko przed instrukcjami iteracyjnymi i instrukcją for.
 * Instrukcja break może wystąpić w instrukcjach:
 *  - while
 *  - do ... while
 *  - for
 *  - switch
 *  Instrukcja continue może wystąpić tylko wewnątrz instrukcji iteracyjnych:
 *  - while
 *  - do ... while
 *  - for
 */
public class _07_3_BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("Przykład 1");
        System.out.println("Wyświetlenie liczb od 0 do 9.");
        System.out.println("Zamiast warunku kończącego, wewnątrz iteracji wywoływana jest instrukcja break.");
        for(int i = 0; ; i++){
            if (i > 9){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Przykład 2");
        System.out.println("Wyświetlenie liczb od 0 do 99 z pominięciem podzielnych przez 3 i 2");
        System.out.println("Warunek wewnątrz iteracji wywołuje continue, które pomija wyświetlenie liczby i przejście do sprawdzenie warunku w for.");
        for(int i = 0; i < 100; i++){
            if (i % 3 == 0 || i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Przykład 3");
        System.out.println("Etykieta przed instrukcjami iteracyjnymi jest konieczny tylko wtedy, gdy w zagnieżdżonej pętli należy wywołać break przerywające instrukcję iteracyjna za etykietą, czyli zewnętrzną.");
        System.out.println("Brak etykiety za break zatrzymałoby wykonywanie tylko pętli wewnętrznej!!!");
        END:
        for (int row = 1; ; row++){
            for(int column = 1; column < 10; column++){
                System.out.print("\t" + row*column);
                if(row == 5){
                    break END;
                }
            }
            System.out.println();
        }
    }
}
