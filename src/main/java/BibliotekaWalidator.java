public class BibliotekaWalidator {


  /**
   * @param b - książka, której obecność w zbiorach biblioteki 'k' sprawdzamy
   * @param k - biblioteka, której zasoby przeglądamy (zasoby to książki dostępne
   *            a także te wypożyczone przez jej czytelników)
   * @return - Metoda ma zwrócić 'true', jeśli ksiązka 'k' należy do zbiorów biblioteki 'b'.
   *           Książka należy do zbiorów biblioteki zarówno, gdy znajduje się na liście
   *           dostępnych książek, jak i gdy jest wypożyczona przez jakiegoś czytelnika.
   */
  public static boolean sprawdzCzyBibliotekaPosiadaKsiazke(Biblioteka b, Ksiazka k) {
    return true;
  }

  /**
   * @param b - walidowana biblioteka
   * @return - Metoda ma zwrócić 'true', jeśli nazwa biblioteki zawiera w sobie
   *           słowo 'wiejska' oraz gdy pełna nazwa biblioteki nie jest krótsza niż 10 znaków
   *           ani dłuższa niż 20 znaków.
   */
  public static boolean czyBibliotekaJestWiejska(Biblioteka b) {
    return true;
  }
}
