1. Utworz cztery klasy:
 - Ksiazka.java
 - Uzytkownik.java
 - Biblioteka.java
 - BibliotekaWalidator.java

 Klasa 'Ksiazka.java' posiada nastepujace pola:
 - BigDecimal id
 - String tytul
 - String autor

 Klasa 'Uzytkownik.java' posiada nastepujace pola:
 - BigDecimal id
 - String name
 - List<Ksiazka> wypozyczoneKsiazki


 Klasa Biblioteka posiada nastepujace pola:
 - String nazwaBiblioteki
 - List<Uzytkownik> czytelnicy
 - List<Ksiazka> dostepneKsiazki

 Klasa 'BibliotekaWalidator.java' będzie klasą narzędziową,
 to znaczy, że w niej będą tylko metody statyczne.
**********************************************************


2. Wszystkie powyzsze pola będą prywatne, więc klasy muszą
zapewnić odpowiednie metody dostepu do tych pol.
**********************************************************


3. W klasie 'Biblioteka' utworz metody, które będą realizowały
   podane funkcjonalności:

a. public List<Ksiazka> podajDostepneKsiazkiAutora(String autor)
   Metoda ma zwrócić wszystkie książki danego autora spośród
   dostępnych do wypożyczenia książek. Jeśli nie ma dostępnych
   książek danego autora, funkcja ma zwrócić pustą listę.

b. public boolean czyCzytelnikPosiadaDanaKsiazke(Uzytkownik u, Ksiazka k)
   Metoda ma zwrócić 'true', jeśli czytelnik ('u') posiada książkę ('k')
   o danym tytule, lub 'false' jeśli nie posiada danej książki.
   Jeśli nie ma użytkownika 'u' wśród czytelników Biblioteki,
   funkcja ma zwrócić wyjątek IllegalArgumentException.

c. public List<Ksiazka> podajKsiazkiUzytkownika(Uzytkownik u)
   Metoda ma znalezc uzytkownika wsród czytelników zarejestrowanych
   w Bibliotece (lista 'Biblioteka#czytelnicy') i wylistować książki,
   które wypożyczył. Jeśli użytkownik 'u' nie posiada żadnej wypożyczonej
   książki, to funkcja ma zwrócić pustą listę. Jeśli nie ma użytkownika
   'u' w liście czytelników (Biblioteka#czytelnicy), to funkcja
   ma zwrócić wyjątek IllegalArgumentException.
**********************************************************

4. Napisz dwie funkcje walidujące w klasie 'BibliotekaWalidator.java',
   które będą realizowały podane funkcjonalności:

a. public static boolean sprawdzCzyBibliotekaPosiadaKsiazke(Biblioteka b, Ksiazka k)
   Metoda ma zwrócić 'true', jeśli ksiązka 'k' należy do zbiorów biblioteki 'b'.
   Książka należy do zbiorów biblioteki zarówno, gdy znajduje się na liście
   dostępnych książek, jak i gdy jest wypożyczona przez jakiegoś czytelnika.
b. public static boolean czyBibliotekaJestWiejska(Biblioteka b)
   Metoda ma zwrócić 'true', jeśli nazwa biblioteki zawiera w sobie
   słowo 'wiejska' oraz gdy pełna nazwa biblioteki nie jest krótsza niż 10 znakóœ
   ani dłuższa niż 20 znaków.