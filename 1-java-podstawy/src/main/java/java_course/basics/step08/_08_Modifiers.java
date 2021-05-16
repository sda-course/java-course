//deklaracja pakietu
package java_course.basics.step08;

/**
 * Pakiety
 * Pakiet to rodzaj katalogu, w którym znajdują się klasy.
 * Nazwy pakietów mają odwrotną budowę domenową np. pl.firm.app.registration
 * a każdy z elementów oddzielonych kropką jest katalogiem. W nazwie mogą wystąpić tylko litery i cyfry i znak '_'.
 * Każda klasa powinna znaleźć się w pakiecie, a deklaracja przynaleźności klasy do pakietu musi znaleźć się na początku klasy.
 * package <pakiet>;
 *
 * Modyfikatory
 * Do określania czy klasa, pole lub metodą są dostępne dla pozostałych klas służą modyfikatory
 * public       - klasa dostępna dla wszystkich klas
 * private      - składowa niedostępna dla pozostałych klas
 * brak         - klasa lub składowa dostępna tylko dla klas z tego samego pakietu
 * protected    - składowa dostępna tylka dla klas pochodnych, bez względu na pakiet
 */

class Laptop{
    private int ram;
    int cores;
    public double screen;

    //getter, metoda służąca do zwracania wartości pola
    public int getRam(){
        return ram;
    }
    //setter, metoda służąca do ustawiania wartości pola
    public void setCores(int cores){
        this.cores = cores;
    }
}

public class _08_Modifiers {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        //pole pakietowe, więc można do niego odwołać w klasie z tego samego pakietu
        laptop.cores = 8;
        //można jednak ustawić wartość tego pola w pozostałych klasach przy pomocy publicznego settera
        laptop.setCores(16);
        //pole publiczne i dostęp do niego ma każda klasa, można odczytywać i zapisywać
        laptop.screen = 15.6;
        //pole jest prywatne i nie można się do niego odwołać, ale jest getter, który zwraca jego wartość
        int ram = laptop.getRam();
    }
}
