package java_course._1_basics.chapter11;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.*;
import java.util.Locale;
import java.util.Scanner;

/**
 * Klasy związane z czasem:
 *  - LocalDate     - tylko data
 *  - LocalTime     - tylko czas od 0:00:00 do 24:00:00
 *  - LocalDateTime - data z czasem
 *  - Period        - długi odcinek czasu liczony w latach, miesiącach i dniach
 *  - Duration      - odcinek czasu liczony w godzinach, minutach i sekundach
 *  Klasa tworzy obiekty wyłącznie metodami statycznymi, które zgłaszają błąd, jeśli nie można
 *  utworzyć poprawnego obiektu n.p daty 30.02
 *  Obiekty tych klas są niemodyfikowalne, to znaczny, że nie można zmienić ich zmienić
 *  Metody statyczne jak i instancyjne zawsze zwracają nowe obiekty np.
 *  date.plusDays(10) nie zmodyfikuje obiektu date tylko zwróci nowy obiekt, który zwiera datę
 *  o 10 dni późniejszą.
 */
public class _11_1_DateAndTimeClasses {
    public static void main(String[] args) {
        //Metody tworzenia daty
        Scanner scanner = new Scanner(System.in);
        LocalDate today = LocalDate.now();
        LocalDate birthDay = LocalDate.of(2000, 10, 1);
        LocalDate lastDayOfYear = LocalDate.of(2000,12,31);
        LocalDate dateFromString = LocalDate.parse("2020-10-10");
        LocalDate oneMillionthDaysAfterEpoch = LocalDate.ofEpochDay(1_000_000);
        LocalDate oneHundredthDayOfYear = LocalDate.ofYearDay(200, 100);
        //Wyświetlenie daty
        System.out.println("Domyślny format: " + today);
        System.out.println("Pełny format zgodny z ustawieniami lokalnymi: " + today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        //Metody
        System.out.println("Nazwa miesiąca: " + today.getMonth());
        System.out.println("Nazwa miesiąca zgodna z ustawieniami lokalnymi: " + today.getMonth().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("PL")));
        System.out.println("Numer miesiąca: " + today.getMonthValue());
        System.out.println("Rok: " + today.getYear());
        System.out.println("Dzień miesiąca: " + today.getDayOfMonth());
        System.out.println("Dzień tygodnia: " + today.getDayOfWeek());
        System.out.println("Dzień tygodnia zgodny z ustawieniami lokalnymi: " + today.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("PL")));
        System.out.println("Dzień roku: " + today.getDayOfYear());
        //metody tworzenia nowych dat na podstawie istniejącej
        LocalDate nextDay = today.plusDays(1);
        LocalDate previousDay = today.minusDays(1);
        System.out.println("Dzień następny: " + nextDay);
        System.out.println("Dzień poprzedni: " + previousDay);
        //Data o miesiąc późniejsza
        LocalDate nextMonth = lastDayOfYear.plusMonths(1);
        System.out.println("Dzisiejsza data ze zmienionym miesiącem na następny: " + nextMonth);
        //Własne formatowanie
        //d - dzień
        //M - miesiąc
        //y - rok
        //E - dzień tygodnia
        System.out.println("Własny format daty: " + birthDay.format(DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy")));
        //porównywanie
        System.out.println("Czy dzisiaj jest po dniu poprzednim? " + today.isAfter(previousDay));
        System.out.println("Czy dzisiaj jest przed jutrem?: " + today.isBefore(nextDay));
        System.out.println("Czy rok przestępny? " + today.isLeapYear());

        System.out.println("Liczba dni bieżącego miesiąca: " + today.lengthOfMonth());
        System.out.println("Liczba dni bieżącego roku: " + today.lengthOfYear());

        //Tworzenie obiektu LocalTime
        LocalTime timeNow = LocalTime.now();
        System.out.println("LocalTime.now() => " + timeNow);
        LocalTime noon = LocalTime.of(12, 0);
        System.out.println("LocalTime.of(12,0) => " + noon);
        LocalTime start = LocalTime.parse("08:15");
        System.out.println("LocalTime.parse(\"08:15\") => " + start);
        System.out.println("LocalTime.ofSecondOfDay(300) => " + LocalTime.ofSecondOfDay(300));
        //Metody
        System.out.println("Godziny: " + timeNow.getHour());
        System.out.println("Minuty: " + timeNow.getMinute());
        System.out.println("Sekundy: " + timeNow.getSecond());
        System.out.println("Nanosekundy: " + timeNow.getNano());
        //Uzyskiwanie czasu na postawie istniejącego obiektu LocalDate
        System.out.println("Czas za godzinę: " + timeNow.plusHours(1));
        System.out.println("Czas za minutę: " + timeNow.plusMinutes(1));
        System.out.println("Czas za sekundę: " + timeNow.plusSeconds(1));
        System.out.println("Czas przed 10 minutami: " + timeNow.minus(10, ChronoUnit.MINUTES));
        System.out.println("Własny format czasu: " + timeNow.format(DateTimeFormatter.ofPattern("hh mm ss")));
        System.out.println("Czas w sekundach: " + timeNow.toSecondOfDay());
        System.out.println("Czy teraz jest przed południem: " + timeNow.isBefore(noon));
        System.out.println("Czy teraz jest po północy: " + timeNow.isAfter(LocalTime.of(0,0,0)));
        System.out.println("Ile minut pozostało do północy: " + timeNow.until(LocalTime.of(23,59,59), ChronoUnit.MINUTES));
        //Tworzenie obiektów LocalDateTime
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Dzisiejsza data z czasem: " + now);
        System.out.println("Własny format daty i czasu: " + now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss")));
        //Period
        Period period = Period.between(LocalDate.of(2000,10,01), today);
        System.out.println("Czas między dniem dzisiejszym a 2000-10-10: " + period);
        System.out.println("Liczba lat: " + period.getYears());
        System.out.println("Liczba miesięcy: " + period.getMonths());
        System.out.println("Liczba dni: " + period.getDays());
        Period nextPeriod = period.plusMonths(12);
        System.out.println("Okres plus 12 miesięcy: " + nextPeriod);
        System.out.println("Normalizacja poprzedniego okresu " + nextPeriod.normalized());

        //Duration
        Duration duration = Duration.between(LocalTime.of(10,15), LocalTime.now());
        System.out.println("Czas między bieżącym a 10:15 " + duration);
        System.out.println("Liczba godzin: " + duration.toHoursPart());
        System.out.println("Liczba minut: " + duration.toMinutesPart());
        System.out.println("Liczba sekund: " + duration.toSecondsPart());
        System.out.println("Liczba nanosekund: " + duration.toNanosPart());
        System.out.println("Czas w godzinach: " + duration.toHours());
        System.out.println("Czas w minutach: " + duration.toMinutes());
        System.out.println("Czas w sekundach: " + duration.getSeconds());

    }
}
