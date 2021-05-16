package java_course.basics.step08;

/**
 * Klasy - metody
 * Metody to podprogramy, które są drugim rodzajem składowych klasy
 *
 */

class Square{
    double size;

    /**
     * Konstruktor służy do tworzenia obiektu klasy. Ten posiada parametr, który określa rozmiar kwadratu.
     * @param squareSize
     */
    Square(double squareSize){
        size = squareSize;
    }

    /**
     * To jest domyślny konstruktor bez parametrów. Tworzy obiekt z polami o wartościach domyślnych.
     */
    Square(){
        size = 1;
    }

    /**
     * Metoda to podprogram, który może wykonać jakiś kod i może odwoływać do pól klasy w taki sam sposób jak zmienne wewnątrz bloku
     * Instrukcja return zwraca obliczoną wartość pola. Instrukcja ta także kończy działanie metody.
     * @return
     */
    double area(){
        return size * size;
    }
    /**
     * Sygnatura metody to pierwszy wiersz deklaracji, który zwiera istotne informacje:
     * <typ-zwracany>:      Metoda może wykonywać obliczenia, które są zwracane, więc należy podać jakiego typu jest wartość.
     * <nazwa-metody>:      Nazwa powinna być najczęściej czasownikiem (lub czasownikami) w języku angielskim,
     *                      który jasno określa co wykonuje metoda.
     *                      Dopuszczalne jest użycie rzeczownika określającego atrybut, jeśli metoda zwraca jego wartość.
     * <lista-parametrów:   oddzielone przecinkami pary <typ> <nazwa>, każda określa ewentualne parametry
     * W skład sygnatury wchodzą jeszcze inne elementy, które omówione zostaną później.
     */
    //<typ-zwracany>    <nazwa-metody>  <lista-parametrów>
    double              perimeter       (){
        return 4 * size;
    }

    /**
     * Jeśli metoda nie zwraca wartości, bo wykonuje tylko jakieś operacje, to należy podać typ void.
     * void oznacza brak zwracanej wartości, więc w metodzie nie można wywołać instrukcji return <wartość>, ale może wystąpić samo return.
     */
    void print(){
        System.out.println("Kwadrat o boku " + size);
    }
}

public class _08_ClassesMethods {
    public static void main(String[] args) {
        Square s1 = new Square(3);
        Square s2 = new Square(5);
        Square s3 = new Square(6);

        //Obliczenie pola kwadratu wymaga tego samego wyrażenia
        System.out.println(s1.size * s1.size);
        System.out.println(s2.size * s2.size);
        System.out.println(s3.size * s3.size);

        //Tego typu obliczenia lepiej raz zapisać w metodzie klasy, aby potem ją wywoływać
        //W ten sposób osiągnęliśmy kilka celów:
        // - nie trzeba pamiętać za każdym razem sposobu obliczania
        // - nie kopiujemy kodu
        // - jeśli sposób obliczania się zmieni, to wystarczy zmienić tylko kod metody
        System.out.println(s1.area());
        System.out.println(s2.area());
        System.out.println(s3.area());

    }
}
