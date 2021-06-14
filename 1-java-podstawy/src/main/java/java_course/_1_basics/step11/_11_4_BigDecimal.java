package java_course._1_basics.step11;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Klasa służy do reprezentować liczb dziesiętnych o dowolnej liczbie cyfr przed i po przecinku.
 * Klasa operuje na obiektach niemodyfikowalnych, a każda z metod zwraca nowy obiekt - podobnie jak klasa String, LocalDate itd.
 */
public class _11_4_BigDecimal {
    public static void main(String[] args) {
        BigDecimal price = new BigDecimal("0010.00700");
        System.out.println("Cena = " + price);
        BigDecimal percent = BigDecimal.valueOf(5).divide(BigDecimal.TEN).divide(BigDecimal.TEN);
        System.out.println("Podatek (5%) = " + percent);
        System.out.println("Podatek z ceny = " + price.multiply(percent));
        System.out.println("Podatek z ceny po zaokrągleniu do dwóch cyfr = " + price.multiply(percent).round(new MathContext(2)));
        System.out.println("Liczba cyfr po przecinku ceny: " + price.scale());
        System.out.println("Cena po usunięciu zbędnych zer: " + price.stripTrailingZeros());
        System.out.println("Liczba cyfr po przecinku ceny po usunięciu zbędnych zer: " + price.stripTrailingZeros().scale());
        System.out.println("Cena brutto = " + price.add(price.multiply(percent)));
        //Dzielenie wymaga określenia precyzji lub trybu zaokrąglania, inaczej wystąpi błąd
        //np. wynik dzielenia 1/3 nie da się zapisać jako liczby dziesiętnej o ograniczonej liczbie cyfr, co powodowałoby
        //przepełnienie stosu. 1.3333333333333 i tak w nieskończoność
        //Wynik zostanie zapisany z liczbą cyfr w price z zaokrąglaniem uwzględniającym parzystość lub nieparzystość przedostatniej
        //zaokrąglanej cyfry.
        System.out.println("Dzielenie ceny przez 3 = " + price.divide(BigDecimal.valueOf(3), RoundingMode.HALF_EVEN));
    }
}
