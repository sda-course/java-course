# Zadanie 1

Napisz program, który wczytuje kolejno:

- liczbę całkowitą `n` określającą liczbę następnych danych,
- kolejnych `n` liczby całkowitych.

Wczytane liczby należy umieścić w tablicy, a następnie obliczyć i wyświetlić:

- sumę liczba,
- największą liczbę,
- najmniejszą liczbę,
- średnią ze wszystkich liczb.

### Przykład

Dla danych wejściowych:

```
4
12
45
5
7
```

program powinien wyświetlić:

```
69
45
5
17
```

# Zadanie 2

Napisz program, który dla wczytanych dwóch liczb całkowitych utworzy tablicę ze wszystkimi liczbami większymi od
mniejszej i mniejszymi od większej spośród obu wczytanych liczb. Elementy tablicy wyświetl na ekranie.

### Przykład

Dla wejścia

```
13 9
```

program powinien wyświetlić:

```
10
11
12
```

# Zadanie 3

Napisz program, który wczytuje liczbę całkowitą `n` a następnie utworzy tablicę liczb typu `double` o takiej długości i
wypełni ją wartościami losowymi w zakresie od 0 do 1 (klasa `Random`, metoda `nextDouble()`). Dla każdej z liczb z
tablicy oblicz jej kwadrat a otrzymanym wynikiem zastąp aktualną wartość komórki. Wyświetl tablicę.

# Zadanie 4

Napisz program, który wczytuje dwa ciągi liczb całkowitych, każdy o długości pięciu elementów, a następnie wyświetli
komunikat: "RÓWNE" jeśli są równe, "RÓŻNE" jeśli są różne.

### Przykład

Dla danych wejściowych

```
2 4 1 3 6
1 2 3 6 4
```

program wyświetli
`RÓWNE`
Dla danych wejściowych

```
2 4 1 3 6
2 4 3 3 6
```

`RÓŻNE`

# Zadanie 5

Napisz program, który wczytuje ciąg 5 łańcuchów, a następnie oczekuje na wczytanie jednego znaku. W zależności od znaku
program powinien wykonać:

- dla znaku 'L' podać sumę długości wszystkich łańcuchów,
- dla znaku 'U' wyświetlić drugi łańcuch wielkimi literami,
- dla znaku 'Z' wyświetlić trzeci łańcuch małymi literami,
- dla znaku 'A' wyświetlić informację czy czwarty łańcuch kończy się literą 'a' lub 'A',
- dla znaku 'K' wyświetlić pierwsze litery każdego łańcucha.

# Zadanie 6

Napisz program, który wczytuje z klawiatury ciąg imion, a następnie wyświetli:

- imiona posortowane rosnąco,
- najkrótsze imię,
- najdłuższe imię,
- znak lub znaki, które najczęściej powtarzają się w imionach,<sup>*)</sup>
- imię o największej wartości, liczonej jako suma kodów ASCII liter wchodzących w skład imienia np. imię `ADA` ma
  wartość = 65 + 68 + 65 = 198

<sup>*)</sup> Wskazówka: potraktuj litery, a dokładniej ich kody ascii jako indeksy tablicy `repetition`, której komórki
zawierają informację, ile znak-indeks się powtarza, np. jeśli w komórce `repetition[65]` znajduje się 3, to oznacza, że
litera 'A' o kodzie 65 powtarza się 3 razy.

# Zadanie 7

Napisz program, który wczytuje jeden ze znaków: `L`, `A`, `T`, `E`, `F`, `O`, `C`, `I`, `P` i drukuje go w postaci
jednego z poniższych napisów:

```
#       #####   #####   #####   #####   #####   #####   ###   #####
#       #   #     #     #       #       #   #   #   #    #    #   #
#       #####     #     #####   #####   #   #   #        #    #####
#       #   #     #     #       #       #   #   #   #    #    #
#####   #   #     #     #####   #       #####   #####   ###   #
```

# Zadanie 8

Napisz program podobny do poprzedniego, z tą różnicą, że wpisywany jest łańcuch zawierający wymienione w poprzednim
zadaniu litery i drukujący całe słowo z ciągów.

# Przykład

Dla słowa na wejściu:

`TOP`

na wyjściu się pojawi:

```
#####   #####   #####
  #     #   #   #   #
  #     #   #   #####
  #     #   #   #
  #     #####   #
```

## Wskazówki do zadań 7 i 8

- Stwórz tablicę dwuwymiarową dla każdego ciągu tworzącego powiększoną literę, a do tablicy wpisz w odpowiednie komórki
  znaki
  `#` i ` ` danego znaku. Np. tablica zapisująca wzór:

```
###
# #
###
```

ma postać:

```java
    char[][]frame={
        {'#','#','#'},
        {'#',' ','#'},
        {'#','#','#'}
        };
```

- Postaraj się uniknąć konstrukcji switch, wszystkie tablice opisujące każdy ze znaków, możesz umieścić też w tablicy.
- indeksami tablicy mogą być dowolne liczby całkowite, a typ `char` jest typem całkowitym.





