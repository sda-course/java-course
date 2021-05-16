package java_course.basics.step09;

/**
 * <h1>Wywoływanie programu z argumentami</h1>
 *
 * <p>Program Java uruchomiony w konsoli systemu operacyjnego może odczytywać
 * argumenty przekazane prze użytkownika. Argumenty te są przekazywane do
 * naszego programu jako tablica łańcuchów, która jest parametrem metody {@code main}  </p>
 *
 * <p>Znaczenie tych parametrów zależy od twórcy, który określa ich znaczenie i format. Poniższy przykład
 * zakłada, że użytkownik przekazuje listę imion, a program wyświetla komunikat powitalny Hello [imię].
 * </p>
 *
 * <h2>Dodanie argumentów wywołania</h2>
 * <p>Z poziomu IntelliJ możesz określić jakie argumenty zostaną podane w trakcie uruchomienia programu</p>
 * <ol>
 * <li>Wybierz kolejno z menu Run-->Edit configurations...-->Program arguments</li>
 * <li>w polu wpisz kolejne imiona np. ALA OLA ADAM</li>
 * </ol>
 */
public class _09_StringAndMainParameters {
    //W trakcie definiowania metody możesz zmienić nazwę parametru, tak aby określić jakie jest jego znaczeni w metodzie
    public static void main(String[] names) {
        //Sprawdzamy czy są jakiekolwiek argumenty i jeśli ich brak to wyświetlamy użytkownikowi komunikat z instrukcjami.
        if (names.length == 0){
            System.out.println("Brak argumentów! Podaj listę imion np. ADAM OLA KAROL");
            //ten return powoduje, że kończymy program i nie zostaną wykonane instrukcje za if
            return;
        }
        for(String name: names){
            System.out.println("Hello " + name);
        }
    }
}
