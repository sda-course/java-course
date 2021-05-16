#Zadanie 1
Zdefiniuj klasę `Picture`:

Pola:
- `year`: rok powstania,
- `width`, `height`: wymiary obrazu w cm,
- `isPortrait` - czy obraz jest portretem.

Konstruktor:
- z argumentami dla wszystkich pól

Metody:
- gettery dla wszystkich pól.

Samodzielnie wybierz odpowiednie typy pól.
  
#Zadanie 2
Zdefiniuj klasę `Box` reprezentującą skrzynkę. Klasa przechowuje informacje o wymiarach skrzynki i jej wadze. Samodzielnie
nazwij pola, dobierz ich typ (wg uznania), zdefiniuj konstruktor oraz getery do pól.
  
#Zadanie 3
Zdefiniuj klasę `Bottle` z polami przechowującymi pojemność butelki oraz pojemność płynu w butelce. Zdefiniuj konstruktor
jednoargumentowy do inicjowania objętości butelki oraz dwuargumentowy do obu pól. 
Zdefiniuj gettery oraz jeden setter (określ, które pole może być modyfikowane).

#Zadanie 4
Dodaj do klasy z poprzedniego zadania metody:
- `boolean isEmpty()`: zwracaj prawdę, jeśli w butelce nic nie ma,
- `void drink()`: powoduje wypicie całej zawartości butelki,
- `void refill()`: napełnienie butelki do pełna,
- `boolean canDrink(int howMuch)`: zwraca prawdę, jeśli w butelce jest wystarczająca ilość płynu,
  by wypić podaną objętość w `howMuch`.
Napisz program, wykorzystujący klasę i jej metody.

#Zadanie 5
Zdefiniuj klasę Beam, która opisuje belę materiału o szerokości 1 metra.

Konstruktory:
- bezargumentowy, inicjuje belę o długości 0 metrów,
- jednoargumentowy z długością początkową beli.

Pola:
- length: długość beli w metrach typu int inicjowana w konstruktorach.

Metody:
- int cut (int meters): realizuje próbę odcięcia kawałka o długości w meters i zwraca długość odciętego kawałka,
- int length (): zwraca aktualną długość beli.
###Przykład
Po wykonaniu poniższego kodu:
```java
Beam beam = new Beam(10);
int cutted = beam.cut(2);
System.out.println("Zlecono odcięcie 2 metrów:");
System.out.println("Odcięto: " + cutted);
System.out.println("Pozostało " + beam.length());
cutted = beam.cut(9);
System.out.println("Zlecono odcięcie 9 metrów:");
System.out.println("Odcięto: " + cutted);
System.out.println("Pozostało: " + beam.length());
System.out.println("Zlecono odcięcie 3 metrów:");
System.out.println("Odcięto: " + cutted);
System.out.println("Pozostało: " + beam.length());
```
program powinien wyświetlić:
```
Zlecono odcięcie 2 metrów.
Odcięto: 2
Pozostało: 8
Zlecono odcięcie 9 metrów.
Odcięto: 8
Pozostało: 0
Zlecono odcięcie 3 metrów.
Odcięto: 0
Pozostało: 0 
```
#Zadanie 6
Zdefiniuj klasę z poprzedniego zadania, dodając nowe pola i metody:

Pola
- `width`: szerokość beli

Konstruktory
- dwuargumentowy z szerokością i długością

Metody:
- `int area()`: zwraca aktualne pole beli
- `boolean isAvaible(int area)` - zwraca prawdę, jeśli jest możliwe odcięcie kawałka o powierzchni w argumencie `area`
#Zadanie 7
Zdefiniuj klasę `Bankomat`, która przechowuje informację o liczbie monet:
- 5 zł
- 2 zł
- 1 zł
Zdefiniuj konstruktor do inicjowania pól oraz metody:
- `boolean isEnought(int amount)`: która zwraca prawdę, jeśli jest możliwe wypłacenie kwoty `amount`,
- `String payOut(int amount)`: która zwraca łańcuch w postaci `5 zł: x, 2 zł: y, 1 zł: z`, gdzie `x`, `y` i `z` to liczba wypłaconych
monet o odpowiednich nominałach, a każda z sekcji może być pominięta dla zerowej liczby monet. Jeśli wypłata
nie jest możliwa to metoda zwraca komunikat `Brak środków!`. 
###Przykład
Dla przykładowych wywołań
```
Bankomat bankomat = new Bankomat(2, 1, 2);  //2 piątki, 1 dwójka i 2 jednozłotówki
System.out.println(bankomat.isEnought(13);  //true bo 2 x 5 zł + 1 x 2 zł + 1 x 1 zł
System.out.println(bankomat.payOut(13);
System.out.println(bankomat.payOut(6);
System.out.println(bankomat.payOut(1);         
```
program powinien wyświetlić:
```
true
5 zł: 2, 2 zł: 1, 1 zł: 1
Brak środków!
1 zł: 1
```