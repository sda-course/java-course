package java_course._1_basics.chapter04;

/**
 * Biblioteka Math
 */
public class _04_3_Math {
    public static void main(String[] args) {
        /*
            Biblioteka Math zawiera funkcje matematyczne niezbędne do wykonywania obliczeń.
         */
        int abs = Math.abs(-10);                        //wartość bezwględna
        double x = 2.5d;
        double y = 4;
        double power = Math.pow(x, y);                  //potęga x do y
        double square = Math.sqrt(5);                   //pierwiastek
        double sin90Degree = Math.sin(Math.PI / 2);     //funkcja trygonometryczna sin
        double cos90Degree = Math.cos(Math.PI / 2);     //funkcja trygonometryczna cos
        double tan90Degrees = Math.tan(Math.PI / 2);    //funkcja trygonometryczna tangens
        double atan1 = Math.atan(1.0d);                 //arcus tangens
        double arcInRadians = Math.toRadians(90);       //przeliczenie stopni na radiany
        double arcInDegrees = Math.toDegrees(Math.PI / 2); //przeliczenie radianów na stopnie
        long round = Math.round(2.56d);                 //zaokrąglenie do wartości całkowitej
        double ceil = Math.ceil(2.56d);                 //zwraca najmniejszą wartość całkowitą, która jest większa lub równa od argumentu - 3
        double floor = Math.floor(2.56d);               //zwraca największą wartość całkowitą, która jest mniejsza lub równa od argumentu - 2
        double rint = Math.rint(3.5d);                  //zwraca najbliższą wartość całkowitą do argumentu
        double random = Math.random();                  //zwraca liczbę pseudolosową z zakresu od 0.0 do 1.0
        //... i wiele innych

        /*
            Różnica między round a rint nie dotyczy tylko zwracanych typów!!!
         */
        //Działanie obu funkcji dla wartości 3.5
        System.out.println(Math.rint(3.5));
        System.out.println(Math.round(3.5));
        //Działanie obu funkcji dla wartości 2.5
        System.out.println(Math.rint(2.5));
        System.out.println(Math.round(2.5));

        /*
            Generowanie liczb pseudolosowych w innym zakresie polega na dodaniu stałej i pomnożeniu wartości zwracanej
         */
        double randomOne = Math.random() * 10;                  //generuje liczby zmiennoprzecinkowe od 0.0 do 10.0
        long randomLong = Math.round(1 + Math.random() * 5);    //generuje liczby całkowite od 1 do 6

    }
}
