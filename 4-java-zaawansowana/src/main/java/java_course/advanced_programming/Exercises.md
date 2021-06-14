# Zadanie 1
Napisz klasę `IntegerFormatter`, która udostępnia metody statyczne:
 - `String hexToBin(String input)` - zamiana dowolnego łańcucha zawierającego liczby szesnastkowe na łańcuch z liczbą binarną,
 - `String binToHex(Stirng input)`  - zamiana dowolnego łańcucha zawierającego cyfry binarne na łańcuch z liczbą szesnastkową.
W obu metodach wykorzystaj strumień zwracany metodą `chars()` w klasie `String`.
### Przykład 
Dla łańcucha wejściowego metoda `hexToBin`:
```
A1D34EFB123456
```
zwróci łańcuch:
```
10100001110100110100111011111011000100100011010001010110
``` 
Dla łańcucha wejściowego metoda `binToHex`:
```
10100001110100110100111011111011000100100011010001010110
```
zwróci łańcuch:
```
A1D34EFB123456
```
