package java_course._1_basics.chapter11;

import java.math.BigInteger;

/**
 * Klasa służy do przechowywania liczb całkowitych o dowolnej liczbie cyfr i wykonywania
 * na nich operacji arytmetycznych.
 */
public class _11_3_BigInteger {
    public static void main(String[] args) {
        BigInteger e12 = new BigInteger("1000000000000");
        BigInteger e10 = new BigInteger("10000000000");
        System.out.println("e12 = " + e12);
        System.out.println("e10 = " + e10);
        System.out.println("Większa z pary e12 i e10: " + e12.max(e10));
        System.out.println("Mniejsza z pary e12 i e10: " + e12.min(e10));
        //Można też tworzyć obiekty BigInteger na podstawie typu long
        BigInteger thousand = BigInteger.valueOf(1000L);
        System.out.println("e12 + 1000 = " + e12.add(thousand));
        System.out.println("e12 / 1000 = " + e12.divide(thousand));
        System.out.println("e12 modulo 3000 (reszta z dzielenia) = " + e12.mod(BigInteger.valueOf(3000)));
        System.out.println("e12 do potęgi 10 " + e12.pow(10));
        System.out.println("Liczba bitów potrzebna do zapisania e12: " + e12.bitLength());
        System.out.println("Liczba zero: " + BigInteger.ZERO);
    }
}
