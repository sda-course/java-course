# Zadanie 1
Napisz program, który przy pomocy połączenia Jdbc stworzy tabelę `Products` o strukturze:
 - `id` - klucz główny, który jest generowany automatycznie przez bazę,
 - `price` - cena jako liczba dziesiętna,
 - `short_name` - krótka nazwa jako łańcuch np. 15 znaków,
 - `is_available` - czy dostępny jako typ logiczny,
 - `date` - data wprowadzenia do bazy.

#Zadanie 2
Uzupełnij poprzedni program o dodanie wierszy do tabeli `Products`.

#Zadanie 3
Napisz program, który wczytuje id produktu, a następnie umożliwia wykonanie jednej z dwóch opcji dla tego rekordu:
 - usunięcie,
 - zmianę ceny na 75,45.

#Zadanie 4
Napisz program, który wyświetla zawartość tabeli `Products` w postaci:
```
id: 1, cena: 6,50, nazwa: masło, dostępny, dodano: 2021-05-10
id: 2, cena: 16,50, nazwa: makaron, niedostępny, dodano: 2021-05-11
``` 

#Zadanie 5
Zmodyfikuj program 3, aby korzystał wyłącznie z `PreparedStatement` i umożliwiał wpisanie nowej ceny produktu.

#Zadanie 6
Utwórz przy pomocy programu Workbench lub innego (np. HeidiSQL) dwie tabele `Incomes` i `Outcomes`, w której przechowywane są
informacje o przyjęciu produktu i jego sprzedaży. Obie tabele mają taką samą strukturę:
 - `product_id` z id produktu
 - `quantity` z liczbą przyjętych lub sprzedanych sztuk,
 - `date` z datą przyjęcia lub sprzedaży produktu.
Połącz obie tabele więzami integralności z tabelą `Products`
Wprowadź kilka przykładowych wierszy w obu tabelach dla istniejących produktów. 
Napisz program, który wyświetla menu, z trzeba opcjami:
1. Wyświetl dostępne produkty - czyli spis produktów, które mają `true` w polu `available`,  
2. Przyjmij produkt do magazynu - czyli dodaje jeden wpis do tabeli `Incomes` z liczbą sztuk produktu i zmienia pole `isAvailable` w tabeli `Products` na true dla dodanego produktu,
3. Sprzedaj produkt - czyli dodaje jeden wpis do tabeli `Outcomes` z liczbą sprzedanych sztuk i jeśli zostały sprzedane ostatnie
   sztuki to ustawia  `available` na false dla produktu w tabeli `Products`.
Uwaga!
Każda sprzedaż wymaga sprawdzenia, czy różnica między polami `quantity` w tabelach `Incomes` a `Outcomes` dla danego produktu
jest większa lub równa od liczby sztuk właśnie sprzedawanego produktu. Jeśli nie jest możliwe sprzedanie wymaganej liczby sztuk, to 
wyświetl komunikat o niemożliwości sprzedaży i nie zmieniaj stanu bazy.
   

#Zadanie 7
Napisz program, który wyświetla różne zestawienia sprzedaży produktów na podstawie utworzonych tabel z zadania 6:
 - liczbę sprzedanych sztuk wybranego produktu w kolejnych miesiącach bieżącego roku,
 - liczbę sprzedanych sztuk wszystkich produktów w podanym miesiącu i roku,
 - kwotę sprzedaży każdego z produktów w ciągu ostatnich 6 miesięcy.  
 - 


   


