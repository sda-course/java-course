package java_course.basics.step04;

import java.util.Scanner;

public class _04_AgeIfApp {
    public static void main(String[] args) {
        /*
            1. Uruchom program wpisując kolejno liczby 10, 18, 25 i obserwuj wyniki
         */
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 18){
            System.out.println("Jesteś dorosły");
        } else {
            System.out.println("Jesteś nieletni");
        }
        /*
            2. Zastąp wyświetlanie komunikatu "Jesteś nieletni" następnym warunkiem, aby dla wieku powyżej 10,
               ale mniejszego od 18 wyświetlony został komunikat "Jesteś nastolatkiem", a dla wieku 10 lub mniejszego - "Jesteś dzieckiem".
            3. Dodaj następny warunek, aby dla wieku powyżej 65 został wyświetlony dodatkowy komunikat "Jesteś emerytem".
         */

    }
}
