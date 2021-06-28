package java_course._1_basics.chapter03;
/*
    Casting to rzutowanie, czyli zmiana zapisania wartości z jednego typu do innego.
    Dodanie dwóch liczb typu int może spowodować, że wynik nie zmieści się w typie int, więc nalezy go zapisać w typie long.
    Kompilator automatycznie dokonuje rzutowania do typu najbardziej pojemnego występującego w wyrażeniu (implicite).
    Jeśli rzutujemy do typu mniej pojemnego, to należy wykonać jawne rzutowania (explicite).
 */
public class _03_5_Casting {
    public static void main(String[] args) {
        byte a = 126;
        byte b = 124;
        //Kompilator automatycznie rzutuje wynik wyrażenia do typu odpowiedniego: dla typów całkowitych to int a zmiennoprzecinkowych do typu double.
        System.out.println(a + b);  //typ int
        System.out.println(3.14 * a * a);    //typ double
        //Tutaj kompilator zaprotestuje, bo suma dwóch bajtów nie zmieści się w bajcie!
        //byte result = a + b;
        //Tutaj także, bo 3.14 jest typu double, a wynik chcemy zapamiętać w typie float.
        //float q = 3.14 * a * a;
        //Poprawnie zapamiętanie wyniku dodawania wymaga rzutowania do typu int. Wystarczy przypisać do zmiennej typu int
        int sum = a + b;
        //Jawne rzutowanie jest wymagane tylko, gdy wartość typu bardziej pojemnego chcemy zapisać w typie mniejszym.
        byte twoBytes = (byte) (a + b);
        //Można także rzutować wynik zmiennoprzecinkowy do typu całkowitego, ale nie mamy kontroli nad zaokrąglaniem.
        //Odrzucana jest część ułamkowa.
        int roundedArea = (int) (3.14 * a * a);
        double t = 3.99;
        System.out.println(t);
        System.out.println((int) t);
    }
}
