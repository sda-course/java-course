package java_course._1_basics.chapter01;

/**
 *  Funkcje println i print. Komentarze
 */
public class _01_1_CommentsAndPrint {
    public static void main(String[] args) {
        System.out.print("Programowanie");
        System.out.println("w Javie!");
        /**
         * Komentarz wielowierszowy dokumentacyjny służy do tworzenia opisów tworzonego kodu.
         */

        //komentarz jednowierszowy

        /*
        komentarz wielowierszowy
         */

        System.out.print("tekst");      //drukuje tekst i pozostawia kursor w bieżącym wierszu
        System.out.println("tekst");    //drukuje tekst i przenosi kursor do następnego wiersza
        System.out.println();           //drukuje pusty wiersz i przenosi kursor do następnej linii
    }
}
