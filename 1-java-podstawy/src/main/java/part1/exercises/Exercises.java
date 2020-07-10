package part1.exercises;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        /*
            1. Uruchom program wpisując koljeno liczby 10, 18, 25 i obserwuj wyniki
         */
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 18){
            System.out.println("Jesteś dorosły");
        } else {
            System.out.println("Jesteś nieletni");
        }
        /*

         */

    }
}
