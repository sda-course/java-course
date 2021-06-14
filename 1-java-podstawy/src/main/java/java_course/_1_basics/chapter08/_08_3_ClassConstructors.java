package java_course._1_basics.chapter08;

/**
 * Konstruktory
 *
 * Klasy posiadają specjalne metody służące do budowania obiektu. Sa to konstruktory, które:
 * - mają nazwę identyczną z klasą
 * - w sygnaturze nie mogą określać typu zwracanego
 * - jeśli w klasie nie zadeklaruje się konstruktora to dostępny jest domyślny konstruktor bezparametrowy
 */

class Box{
    private double weight;
    private double capacity;

    /**
     * Konstruktor bezparametrowy może inicjować pola wartościami domyślnymi
     */
    public Box(){
        weight = 0;
        capacity = 1;
    }

    /**
     * Konstruktor z parametrami, który inicjuje pola obiektu ich wartościami
     * @param boxWeight
     * @param boxCapacity
     */
    public Box(double boxWeight, double boxCapacity){
        weight = boxWeight;
        capacity = boxCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public double getCapacity() {
        return capacity;
    }
}

public class _08_3_ClassConstructors {
    public static void main(String[] args) {
        //obiekt tworzony konstruktorem bezparametrowy
        Box defaultBox = new Box();
        //obiekt tworzony konstruktorem o dwu parametrach
        Box bigBox = new Box(10, 100);
    }
}
