#Zadanie 1
Napisz program, który wyświetli liczby od 1 do 100 przy pomocy instrukcji `for`. 
#Zadanie 2
Napisz program, który wyświetli liczby parzyste od 1 do 100 przy pomocy instrukcji `for`.
#Zadanie 3
Napisz program, który wczytuje dwie liczby zakresu: `n` i `m` i wyświetli liczby w tym zakresie (łącznie z `n` i `m`).
Przyjmuj, że zawsze `n` < `m`.
#Zadanie 4
Napisz program, który wczytuje liczbę całkowitą `n` i przy pomocy pętli `for` wyświetli trójkąt ze znaków `#`
###Przykład
Dla n = 5
```text
#
##
###
####
#####
```
#Zadanie 5
Napisz program, który wczytuje liczbę całkowitą `n` i przy pomocy pętli `for` wyświetli trójkąt ze znaków `#`
###Przykład
Dla n = 5
```text
    #
   ##
  ###
 ####
#####
```
#Zadanie 6
Napisz program, który wczytuje liczbę całkowitą `n` i przy pomocy pętli `for` wyświetli kwadrat ze znaków `#`
###Przykład
Dla n = 5
```text
#####
#####
#####
#####
#####
```
#Zadanie 7
Napisz program, który wczytuje dwie dowolne liczby `n` < `m` a następnie wyświetla pasek
określający, ile procent stanowi liczba `n` w stosunku do `m`. Długość paska wynosi od 0 do 50 znaków `#` plus uzupełnienie do 50 znaków spacjami. Na początku
i końcu znaki `|`, w wierszu poniżej `0%` na początku, `100%` na końcu i wartość paska w procentach po środku.
###Przykład
Dla `n` = 36,6 i `m` = 50
program powinien wyświetlić:
```
|################################                  |
0 %                      75%                    100%            
```
#Zadanie 8
Napisz program, który dla pięciu liczb całkowitych o wartościach w zakresie od 0 do 10, wyświetli poziomy wykres kolumnowy.
###Przykład
Dla wejścia:
2 6 1 7 4
```text
x1 ##
x2 ######
x3 #
x4 #######
x5 ####
```
#Zdanie 9
Napisz, program, który dla pięciu liczb całkowitych o wartościach w zakresie od 0 do 10, wyświetli pionowy wykres kolumnowy.
###Przykład
Dla wejścia:
2 6 1 7 4
```text
            #
    #       #
    #       #  
    #       #   #
    #       #   #
#   #       #   #
#   #   #   #   #
x1  x2  x3  x4  x5
```
#Zadanie 10
Napisz program, podobny do poprzedniego z tą różnicą, że:
- wczytane dane do wykresu są dowolnymi liczbami rzeczywistym dodatnimi,
- wykres powinien posiadać oś Y z dziesięcioma poziomami od 1L do 10L, a wartość L zależy od wczytanych wartości np. jeśli największa jest mniejsza od 10, to 
L = 1 a na osi powinny być liczby od 1 do 10, jeśli największa z liczb jest mniejsza w zakresie od 100 do 1000, to L = 100 a poziomy mają wartości od 100 do 1000 itd., 
- wysokość słupków na wykresie należy zaokrąglić na podstawie danych.     
###Przykład
Dla wejścia:
22.5 61 38 73 2.7
```text
   100 |
    90 |
    80 |
    70 |             #
    60 |     #       #
    50 |     #       #  
    40 |     #   #   #   
    30 |     #   #   #   
    20 | #   #   #   #   
    10 | #   #   #   #   
    ----------------------
        x1  x2  x3  x4  x5
```
#Zdanie 11
Napisz program, który wyświetli spiralę o wczytanym z klawiatury rozmiarze `n` wynoszącym od 5 do 20.
###Przykład
Dla danych wejściowych `n` = 7 program powinien wyświetlić:
```
#######
      #
 #### #
 #  # #
 # ## #
 #    #
 ######
```