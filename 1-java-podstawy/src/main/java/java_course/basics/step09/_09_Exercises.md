# Zadanie 1
Napisz program, który podany z klawiatury łańcuch o długości powyżej 20 znaków wyświetla w dwu wierszach, tak aby 
pierwszym wierszu nie było więcej niż 20 znaków, a w drugim pozostałe znaki. 
###Przykład
Dla łańcucha wejściowego:

`Lorem ipsum dolor sit amet, consectetur adipiscing elit`

tekst zostanie wyświetlony w dwu wierszach:
```
Lorem ipsum dolor si
t amet, consectetur adipiscing elit
```
# Zadanie 2   
Napisz program, który z łańcucha z numerem telefonu w postaci `+00000000000` wyświetla numer kierunkowy. 
###Przykład
Dla łańucha

`+48333666777`

wyświetlony zostanie prefiks:

`48`
# Zadanie 3
Napisz program, który dla łańcucha podanego z klawiatury w postaci:

`(liczba, liczba) (liczba, liczba)`

wyświetli tylko same liczby.

###Przykład
Dla łańcucha:

`(-2788, 89) (2989, -89)`

wyświetli:

`-2788 89 2989 -98`
# Zadanie 4
Napisz program, który dla adresu email wczytanego z klawiatury wyświeli:
- nazwę użytkownika,
- top domenę.
### Przykład
Dla łańcucha:

`adam@sda.pl`

wyświetli:

`adam`

`pl`

# Zadanie 5
Napisz program, który wczytuje łańcuch i znak oraz wyświetla liczbę wystąpień znaku w tym łańcuchu.
### Przykład
Dla danych wejściowych:

`Hello World!!!`

`l`

wyświetli:

3
# Zadanie 6
Napisz program, który wczytany łańcuch (jeden wiersz) z klawiatury otoczy ramką złożoną ze znaków '#'.
### Przykład
Dla łańcucha wejściowego:

`Hello World!`

wyświetli:
```
##############
#Hello World!#
##############
```
# Zadanie 7
Korzystając z sekwencji ucieczki do zmiany koloru wyświetlanego tekstu, napisz program, który dla tekstu w formacie:
`kolor: tekst`, wyświetli sam tekst w podanym kolorze. Możliwe kolory: `RED`, `BLUE`, `GREEN`, przy czym kolory mogą być zapisane
z użycie różnej wielkości liter np. `Red`, `red`, `rED`.
### Przykład
Dla wejścia
```
red: Hello World!
```
wyświetli
<span style="color:red">Hello World!</span>
# Zadanie 8
Napisz program, który wyświetli wpisany z klawiatury tekst źródłowy Javy, kolorując jego wybrane słowa kluczowe: 
`switch`, `case`, `continue`, `break`, `for`, `while`, `do`, `if`, `else`.
# Zadanie 9
Napisz program, który każdą sekwencję znaków `*łańcuch*` zamieni na sekwencję `<b>łańcuch</b>`. Sekwencje mogą powtarzać się wielokrotnie w tekście,
ale się nie zagnieżdżają.
### Przykład
Dla tekstu:
```
Loem *ipsum* dolor sit amet, *consectetur* adipiscing elit
```
program wyświetli:
```
Loem <b>ipsum</b> dolor sit amet, <b>consectetur</b> adipiscing elit
```
# Zadanie 10
Napisz program, który wczytuje ciąg liczb rzeczywistych, aż do momentu wpisania pustego wiersza, a następnie
obliczy ich sumę i wyświetli liczby z wynikiem w postaci sformatowanej:
- szerokość pola dla każdej z liczb: 20 znaków
- znak przed każdą liczbą
- dwie cyfry po przecinku
- wiersz przed sumą złożony ze znaków podkreślenia.
### Przykład
Dla wejścia:
```
123.4678
-3456.789
12345.821

```
Program wyświetli:
```
            + 123,47
           -3 456,79
          +12 345,82
____________________
            9 012,50                       
```
# Zadanie 11
Napisz program, który wczytuje ciąg wierszy do momentu wystąpienia wiersza pustego. Każdy z wierszy zawiera złożoną
z ciągu wyrazów nazwę wyrobu np. `Konwekcyjny ogrzewacz miejscowy POWER SUN 10`. Zadaniem programu jest wyświetlenie
w osobnych wierszach nazw produktów w postaci skróconej:
- wszystkie słowa niebędące kapitalikami są skracane do pierwszej sylaby (przyjmij, że to początkowy fragment tekstu kończący
  się pierwszą spółgłoską, która znajduje się za pierwszą samogłoską lub zbitką samogłosek np. `Konwekcyjny` -> `kon`, `ogrzewacz` -> `og`,
  `miejscowy` -> `miej`)
- wszystkie słowa pisane kapitalikami i liczby nie są skracane,
- wszystkie słowa w skrócie są oddzielane  znakiem dywizu (-).
- cały skrót pisany kapitalikami.
Dla przykładowego ciągu program powinien wyświetlić:
```
KON-OG-MIEJ-POWER-SUN-10
```
  
