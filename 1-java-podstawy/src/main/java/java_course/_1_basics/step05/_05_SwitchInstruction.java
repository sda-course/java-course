package java_course._1_basics.step05;

import java.util.Scanner;

/**
 * Instrukcja switch(wyrażenie) wykonuje skok do wiersza z etykietą, której wartość jest równa wyrażeniu.
 * Po wykonaniu instrukcji z wybraną etykietą, wykonywane są pozostałe instrukcje z etykietami.
 * Instrukcja z etykietą default wykonywana jest, jeśli nie żadnej pasującej etykiety.
 * Wyrażenie może zwracać tylko typ całkowity int lub String. W etykietach można umieszczać tylko stałe!!!
 * instrukcja break powoduje przerwanie wykonywania kodu wewnątrz instrukcji switch i przejście do wykonywania pierwszej instrukcji
 * za switch.
 * Wyrażenie instrukcji switch musi być zwracać liczbę całkowita, lub być napisem.
 *  Schemat działania przedstawia poniższy diagram. Zakładając, że wyrażenie w tym przypadku ma wartość 4 to zostanie wykonany ciąg instrukcji
 *  switch(wyrażeniem){
 *          |       case 1: System.out.println("1");//wyrażenie != 1, przejdź do następnego case
 *          |       case 2: System.out.println("2");//wyrażenie != 2, przejdź do następnego case
 *          |       case 3: System.out.println("3");//wyrażenie != 3, przejdź do następnego case
 *          | ->    case 4: System.out.println("4");//wyrażenie == 4 wykonaj kod za case4: i przejdź niżej
 *                  case 5: System.out.println("5");
 *                  default: System.out.println("Inna liczba");
 *  }
 *  Powyższy kod wygeneruje komunikaty:
 *  4
 *  5
 *  Inna liczba
 *
 *  Dodanie instrukcji break zmienia działanie powyższego przykładu:
 *  switch(wyrażeniem){
 *          |       case 1: System.out.println("1"); break;//wyrażenie != 1, przejdź do następnego case  i sprawdź
 *          |       case 2: System.out.println("2"); break;//wyrażenie != 2, przejdź do następnego case
 *          |       case 3: System.out.println("3"); break;//wyrażenie != 3, przejdź do następnego case
 *          | ->    case 4: System.out.println("4"); break;//wyrażenie == 4 wykonaj kod za case4: a potem przerwij
 *                  case 5: System.out.println("5"); break;
 *                  default: System.out.println("Inna liczba");//tutaj break nie ma już znaczenie, bo tu kończy się instrukcja switch
 *  }
 *  W rezultacie dostaniemy na ekranie tylko jeden komunikat:
 *  4
 *
 *  Etykieta default nie musi znajdować się na końcu.
 */
public class _05_SwitchInstruction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[0m");
        System.out.println("Wpisz liczbę całkowitą:");
        int value = scanner.nextInt();
        System.out.print("\033[0;33m");
        System.out.println("Przykład 1");
        System.out.println("Instrukcja switch bez break.");
        switch (value){
            case 1:
                System.out.println("JEDEN");
            case 2:
                System.out.println("DWA");
            case 3:
                System.out.println("TRZY");
            default:
                System.out.println("INNA LICZBA");
        }
        System.out.print("\033[0;34m");
        System.out.println("Przykład 2");
        System.out.println("Instrukcja switch z break.");
        switch (value){
            case 1:
                System.out.println("JEDEN");
                break;
            case 2:
                System.out.println("DWA");
                break;
            case 3:
                System.out.println("TRZY");
                break;
            default:
                System.out.println("INNA LICZBA");
        }
        System.out.print("\033[0m");
        System.out.println("Wpisz jeden z miesięcy:  LUTY, MARZEC, MAJ");
        System.out.print("\033[0;36m");
        System.out.println("Przykład 3");
        System.out.println("Instrukcja switch z napisem.");
        switch (scanner.next()){
            default:
                System.out.println("Nieznane miesiąc!");
                break;
            case "LUTY":
                System.out.println("Drugi miesiąc roku.");
                break;
            case "MAJ":
                System.out.println("Piąty miesiąc roku.");
                break;
            case "MARZEC":
                System.out.println("Trzeci miesiąc roku.");
        }
    }
}
