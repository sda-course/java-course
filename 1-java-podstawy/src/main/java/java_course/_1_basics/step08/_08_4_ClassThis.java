package java_course._1_basics.step08;

/**
 * Zmienna this
 * <p>
 * Obiekt tworzony jest dopiero, gdy utworzy się go operatorem new na konstruktorze klasy.
 * W trakcie definiowania klasy nie jesteśmy w stanie określić jaka będzie referencja tworzonego obiektu.
 * Jeśli w klasie jest potrzeba odwołania się do obiektu, który zostanie dopiero utworzony to
 * stosuje się zmienną this, która zastępuje referencję utworzonego obiektu.
 * <p>
 * Sama zmienna this jest też odwołaniem do konstruktora bieżącej klasy.
 */

class Tank {
    private double capacity;
    private double level;

    /**
     * Zwyczajowo parametry konstruktora mają taką samą nazwę jak pola. W sytuacji gdy nazwa pola jest identyczna z nazwą
     * parametru obie są nierozróżnialne, dlatego dodanie this.nazwa-pola oznacza, że odwołujemy się pola obiektu klasy.
     *
     * @param capacity objętość zbiornika
     * @param level    poziom cieczy w zbiorniku
     */
    public Tank(double capacity, double level) {
        this.capacity = capacity;
        this.level = level;
    }

    /**
     * Drugi konstruktor ma jeden parametr do tworzenia pustego zbiornika. Zamiast pisać ciało w postaci:
     * <p>
     * this.capacity = capacity;
     * this.level = 0;
     * <p>
     * można wykorzystać istniejący konstruktor z dwoma parametrami:
     * <p>
     * this(capacity, 0);
     *
     * @param capacity objętość zbiornika
     */
    public Tank(double capacity) {
        this(capacity, 0);
    }

    /**
     * Metoda zmienia poziom cieczy w zbiorniku o podaną wartość i zwraca obiekt zbiornika, w który zmieniono poziom.
     * Zmienna this reprezentuje referencję obiektu, który w przyszłości wywoła tę metodę.
     *
     * @param delta
     * @return
     */
    public Tank levelUp(double delta) {
        level += delta;
        return this;
    }

    public Tank print() {
        System.out.println("Tank(level: " + level + ")");
        return this;
    }

}

public class _08_4_ClassThis {
    public static void main(String[] args) {
        Tank tank = new Tank(100, 34);
        tank
                .print()
                .levelUp(14)
                .print()
                .levelUp(-4)
                .print();
    }
}
