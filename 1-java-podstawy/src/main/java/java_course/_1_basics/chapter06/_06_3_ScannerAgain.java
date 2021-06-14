package java_course._1_basics.chapter06;


import java.util.Scanner;

public class _06_3_ScannerAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Korzystając z pętli while można wzbogacić programy o wczytywanie  nieokreślonej liczby danych
        System.out.println("Wpisuj liczby całkowite. Zakończ dowolnym znakiem niepasującym do liczby.");
        while(scanner.hasNextInt()){
            int input = scanner.nextInt();
            System.out.println("Wczytano: " + input);
        }
    }
}
