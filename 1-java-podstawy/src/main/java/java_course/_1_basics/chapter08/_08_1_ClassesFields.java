package java_course._1_basics.chapter08;

/**
 * Klasy - pola
 *
 * Klasa jestem typem złożony ze składowych.
 * Składowe przechowujące dane to pola.
 * Deklarowanie pól jest bardzo podobne do deklaracji zmiennych.
 * Deklaracja klasy jest rodzajem opisu budowy zmiennych klasy i służy do wspólnego opisu wszystkich zmiennych
 */

/**
 * Klasa składająca się z dwóch pól typu double służy do opisu prostokąta
 */
class Rectangle{
    double width;
    double height;
}

public class _08_1_ClassesFields {
    public static void main(String[] args) {
        //deklarowanie zmiennych klasowych odbywa się podobnie jak poznanych wcześniej typów prostych
        //<typ>   <identyfikator>   = new <typ>();
        Rectangle rectangle         = new Rectangle();
        //po prawej stronie pojawia się słowo kluczowe new, które służy do tworzenia obiektów na podstawie klasy

        //Operator new powoduje utworzenie w pamięci obiektu z polami width i height
        //Każde wywołanie new na klasie powoduje utworzenie kolejnego obiektu z własnymi polami
        Rectangle square = new Rectangle();

        //W odróżnieniu od zmiennych pola są inicjowane wartościami domyślnymi, dla typów liczbowych są 0 lub 0.0
        //dla typu boolean jest to false
        System.out.println("rectangle: " + rectangle.width + " " + rectangle.height);
        System.out.println("square: " + square.width + " " + square.height);

        //Dostęp do pól obiektu odbywa się za pomocą operatora kropki
        rectangle.height = 10;
        rectangle.width = 5;

        square.width = 6;
        square.height = 6;
        System.out.println("rectangle: " + rectangle.width + " " + rectangle.height);
        System.out.println("square: " + square.width + " " + square.height);

        //Zmienne obiektowe rectangle i square są referencjami, które nie zawierają wartości pól tylko wskazują,
        //gdzie w pamięci znajduje się obiekt.
        //Przypisanie do zmiennej rectangle referencji square, powoduje, że rectangle wskazuje na ten
        //sam obiekt co square
        //To odróżnia obiekty i referencje od typów prostych i ich zmiennych. Nie można utworzyć referencji do zmiennej typu prostego!!!
        rectangle = square;
        System.out.println("rectangle: " + rectangle.width + " " + rectangle.height);
        System.out.println("square: " + square.width + " " + square.height);
        //Po przypisaniu utraciliśmy dostęp do obiektu wskazywanego wcześniej przez zmienną rectangle
        //Obiekty, które nie mają referencji są usuwane z pamięci przez garbage collector

        //Zadeklarowana zmienna obiektowa bez przypisanego obiektu może być zainicjowana wartością null
        //Wartość null oznacza brak obiektu, a wartość ta może być przypisana do referencji każdego typu!!!
        Rectangle nullRectangle = null;
        System.out.println(nullRectangle);

        //Odwołanie się do pola zmiennej z wartością null powoduje zgłoszenie błędu
        System.out.println(nullRectangle.width);

        //Jeśli nie mamy pewności co do istnienia obiektu wskazywanego przez referencję, to należy to sprawdzić instrukcją if
        //Jest to tzw. null check
        if (nullRectangle != null){
            System.out.println(nullRectangle.width);
        } else {
            System.out.println("brak obiektu");
        }


    }
}
