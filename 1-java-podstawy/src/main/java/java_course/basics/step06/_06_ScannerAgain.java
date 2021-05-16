package java_course.basics.step06;


import java.util.Scanner;

public class _06_ScannerAgain {
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
