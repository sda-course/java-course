package part1;
/*
    Blok
 */
public class Program6 {
    public static void main(String[] args) {
        /*
            Blok
            Blok to wyróżniony parą nawiasów klamrowych fragment kodu, który może zawierać dowolną liczbę instrukcji.'
            Blok może wystąć w miejscu, w którym może wystąć instrukcja. Blok jest też jedynym miejscem, w którym mogą
            wystąpić instrukcje.
            Bloki można zagnieżdżać.
            {
                {

                }
                {
                    {
                    }
                }
            }
         */
        //Blok możesz utworzyć w dowolnym miejscu i w nim możesz wstawiać instrukcje, w tym też deklaracje zmiennych.
        System.out.println("Blok główny - nadrzędny dla wszystkich");
        {
            int a = 10;                     //zmienna w bloku zagnieżdzonym 1
            System.out.println("Blok zagnieżdżony 1: blok nadrzędny dla bloków 1-1 i 1-2");
            System.out.println(a);
            {
                int b = 10;                 //zmienna w bloku zgnieżdżonym 1-1
                System.out.println("Blok zagnieżdżony 1-1");
                System.out.println(a);      //dostęp do zmiennej bloku nadrzędnego
                System.out.println(b);      //dostęp do zmiennej w bloku bieżącym
            }
            {
                System.out.println("Blok zagnieżdżony 1-2");
                System.out.println(a);      //dostęp do zmiennej bloku nadrzędnego
                //System.out.println(b);    //nie mamy dostepu do zmiennej z bloku 1-1
            }
            //System.out.println(b);        //tutaj też nie mamy dostepu do zmiennej z bloku 1-1
        }
        /*
        Każda zmienna jest widoczna i dostepna tylko w swoim bloku jak  i w  blokach w nim zagnieżdżonych.
        Zmienna zadeklarowana w najgłębiej zagnieżdżonym bloku jest dostepna tylko w nim.
        Blok wyznacza także cykl życia swoich zmiennych, istnieją tak długo jak wykonywany jest kod bloku, w którym są
        zadeklarowane. Później poznamy pewne wyjątki od tej zasady.
        */
    }
}
