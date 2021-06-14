package java_course._1_basics.step10;
import java.util.Arrays;

/**
 * Tablice
 */
public class _10_1_Arrays {
    public static void main(String[] args) {
        //Deklaracja tablicy z inicjacją wartościami, rozmiar określa liczba elementów pomiędzy {}.
        int[] array = {1, 2, 3, 4, 5};

        //Deklaracja z utworzeniem tablicy o podanym rozmiarze.
        int sequence[] = new int[10];

        //Deklaracja zmiennej tablicowej, ale tablica nie została utworzona.
        double[] temperatures;

        //Utworzenie tablicy z inicjacją wartościami i przypisanie jej do zmiennej.
        temperatures = new double[]{10.1, 13.3, 21.4, 3.5};
        System.out.println("Przykładowa tablica temperatures:");
        System.out.println(Arrays.toString(temperatures));
        System.out.println();

        //Odwołanie do komórki odbywa się poprzez indeks - numer komórki tablicy.
        //Pierwsza komórka jest pod indeksem 0.
        System.out.println("Przykład 1");
        temperatures[0] = 10.5;
        System.out.println("Element o indeksie 0: " + temperatures[0]);
        System.out.println();

        //Długość tablicy.
        System.out.println("Przykład 2");
        System.out.println("Liczba elementów tablicy: " + temperatures.length);
        System.out.println();

        //Tablice są traktowane jak obiekty, czyli zmienna tablicowa jest referencją.
        //Obie referencje wskazują na tę samą tablicę.
        System.out.println("Przypisanie referencji tablicy do nowej zmiennej: \ndouble[] temp = temperatures;");
        double[] temp = temperatures;
        System.out.println("Wpisanie pierwszej komórki tablicy temp liczby 14.5\ntemp[0] = 14.5");
        temp[0] = 14.5;
        System.out.println();

        //Odwołanie do tej samej komórki może odbywać przy pomocy obu referencji.
        System.out.println("Przykład 3");
        System.out.println("temp[0] => " + temp[0]);
        System.out.println("temperatures[0] => " + temperatures[0]);
        System.out.println();

        //Przetwarzanie tablicy odbywa się zazwyczaj przy pomocy pętli for.
        System.out.println("Przykład 4");
        System.out.println("Iterowanie po elementach tablicy temp przy pomocy for:");
        for(int i = 0; i < temp.length; i++){
            System.out.print(temp[i] + "\t");
        }
        System.out.println();

        //Obliczenie sumy elementów tablicy.
        System.out.println("Przykład 5");
        System.out.println("Sumowanie elementów tablicy przy pomocy for:");
        double sum = 0;
        for(int i = 0; i < temp.length; i++){
            sum += temperatures[i];
        }
        System.out.println("Suma temperatur: " + sum);
        System.out.println();

        //wyszukanie największego elementu tablicy.
        System.out.println("Przykład 6");
        System.out.println("Wyszukiwanie największego elementu tablicy przy pomocy for:");
        double max = 0;
        for(int i = 0; i < temp.length; i++){
            if (i == 0){
                max = temperatures[0];
                continue;
            }
            if (temperatures[i] > max){
                max = temperatures[i];
            }
        }
        System.out.println("Największa temperatura: " + max);
        System.out.println();

        //klasa Array udostępnia metody do działań na tablicach
        //Kopiowanie elementów do nowej tablicy o nowym rozmiarze, komórki dodatkowe wypełnione sa zerami
        System.out.println("Przykład 7");
        System.out.println("Kopiowanie przy pomocy klasy Arrays, kopia w zmiennej copyOfTemperatures:");
        double[] copyOfTemperatures = Arrays.copyOf(temperatures, 10);
        //wyświetlenie elementów tablicy,
        System.out.println(Arrays.toString(copyOfTemperatures));
        System.out.println();

        //sortowanie tablic typów prostych, metoda modyfikuje swój argument!
        System.out.println("Przykład 8");
        System.out.println("Sortowanie tablicy:\nArrays.sort(copyOfTemperatures)");
        Arrays.sort(copyOfTemperatures);
        System.out.println(Arrays.toString(copyOfTemperatures));
        System.out.println();

        //wyszukiwanie indeksu komórki o podanej wartości. Metoda ziała tylko dla tablic posortowanych!!!
        System.out.println("Przykład 9");
        System.out.println("Wyszukiwanie w posortowanej tablicy wartości 3.5:\nArrays.binarySearch(copyOfTemperatures, 3.5)");
        System.out.println("Indeks wartości 3.5 => " + Arrays.binarySearch(copyOfTemperatures, 3.5));
        System.out.println();

        //wypełnienie tablicy jedną wartością
        System.out.println("Przykład 10");
        System.out.println("Wypełnianie tablicy wartością:\nArrays.fill(copyOfTemperatures, 5.5)");
        Arrays.fill(copyOfTemperatures, 5.5);
        System.out.println(Arrays.toString(copyOfTemperatures));
        System.out.println();

        //Znalezienie pierwszego indeksu komórki, którą różnią się tablice. Jeśli tablice są identyczne to zwracany jest indeks -1
        System.out.println("Przykład 11");
        System.out.println("Znalezienie pierwszego indeksu komórki, którą różnią się dwie tablice.\nint mismatch = Arrays.mismatch(copyOfTemperatures, newArray);");
        double[] newArray = {5.5, 5.5, 3.0};
        System.out.println("Tablica 1");
        System.out.println(Arrays.toString(newArray));
        System.out.println("Tablica 2");
        System.out.println(Arrays.toString(copyOfTemperatures));
        int mismatch = Arrays.mismatch(copyOfTemperatures, newArray);
        System.out.println("Indeks niepasującej komórki przy porównaniu tablicy 1 i 2 => " + mismatch);
        System.out.println();

        //Porównywanie dwóch tablic
        System.out.println("Przykład 12");
        System.out.println("Porównywanie dwóch tablic\nArrays.equals(newArray, copyOfTemperatures);");
        System.out.println("Tablica 1: ");
        System.out.println(Arrays.toString(newArray));
        System.out.println("Tablica 2: ");
        System.out.println(Arrays.toString(copyOfTemperatures));
        System.out.println("Czy tablice 1 i 2 są równe? " + Arrays.equals(newArray, copyOfTemperatures));
        System.out.println();

        //Elementami tablicy mogą być też obiekty
        System.out.println("Przykład 13");
        String[] names = {"ADAM", "ADA", "KAROL"};
        System.out.println("Tablica łańcuchów names: " + Arrays.toString(names));
        System.out.println();

        //Dla tablic własnych typów nie będzie działać część poprzednio podanych metod np. sort, mismatch.
        //Wyjaśnienie znajdzie sie w dalszej części kursu.

        //Tablica dwuwymiarowa - to po prostu tablica jednowymiarowe, której elementami są tablice jednowymiarowe
        //Liczbę wymiarów można zwiększać dodać kolejne nawiasy kwadratowe
        System.out.println("Przykład 13");
        System.out.println("Tablice dwuwymiarowe");
        int[][] matrix = new int[3][3];
        matrix[2][1] = 5;
        System.out.println("Element [2][1] => " + matrix[2][1]);

        matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //Każdy wiersz to tablica jednowymiarowa
        int[] firstRow = matrix[0];
        int[] secondRow = matrix[1];
        int[] thirdRow = matrix[2];
        System.out.println("Tablice jednowymiarowe będące wierszami macierzy: ");
        System.out.println(Arrays.toString(firstRow));
        System.out.println(Arrays.toString(secondRow));
        System.out.println(Arrays.toString(thirdRow));

        System.out.println("Przeglądanie elementów macierzy:");
        //przeglądanie tablicy dwuwymiarowej
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                System.out.print("\t" + matrix[row][column]);
            }
            System.out.println();
        }

        //Można tworzyć tablice o nieregularnych wierszach
        int[][] arr2D = new int[][]{
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };
        System.out.println("Przeglądanie nieregularnej tablicy dwuwymiarowej:");
        for(int row = 0; row < arr2D.length; row++){
            for(int column = 0; column < arr2D[row].length; column++){
                System.out.print("\t" + arr2D[row][column]);
            }
            System.out.println();
        }
    }
}
