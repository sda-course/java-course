package java_course.basics.step03;

import java.util.Scanner;

public class _03_RectangleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program oblicza pole powierzchni prostokąta");
        System.out.print("Wpisz długość pierwszego boku: ");
        double sideA = scanner.nextDouble();
        System.out.print("Wpisz długość drugiego boku: ");
        double sideB = scanner.nextDouble();
        System.out.print("Pole powierzchni: ");
        double area = sideA * sideB;
        System.out.println(area);
    }
}
