package java_course._1_basics.step08;

class Dummy{
    public Dummy() {
        System.out.println("OBJECT CREATED");
    }

    /**
     * UWAGA!!!
     * Tę metodę zdefiniowaliśmy tylko do celów demonstracyjnych, bo wywoływana jest na każdym obiekcie
     * podczas usuwania z pamięci przez garbage collector
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("OBJECT REMOVED");;
    }
}
public class _08_7_GCDemo {
    public static void main(String[] args) {
        System.out.println("Tworzymy obiekt");
        Dummy dummy = new Dummy();
        System.out.println("dummy => " + dummy);
        System.out.println("Wywołujemy GC, ale nic się nie dzieje bo brak obiektów do usunięcia.");
        System.gc();
        System.out.println("Przypisujemy do referencji wartość null i tracimy dostęp do obiektu");
        dummy = null;
        System.out.println("dummy => " + dummy);
        //metoda wywołuje garbage collector, ale w programach nie ma potrzeby tego robić, bo gc sam się uruchamia co pewien czas
        System.out.println("Ponownie wywołujemy GC po utracie referencji do obiektu.");
        System.gc();
        System.out.println("Komunikat OBJECT REMOVED wskazuje, że został usunięty przez GC!");
        System.out.println("UWAGA!!! Wywołanie gc powoduje, że usuwanie obiektów działa w tle naszego programu, więc komunikat OBJECT REMOVED może się pojawić przed lub za tym komunikatem!!!");
    }
}
