import java.util.List;

public class Biblioteka {

  /**
   * Klasa posiada następujące właściwości:
   *  - String nazwaBiblioteki
   *  - List<Czytelnik> czytelnicy
   *  - List<Ksiazka> dostepneKsiazki
   *
   *  NOTE: Pamiętaj, że wszystkie powyższe pola będą prywatne, więc klasy muszą
   * zapewnić odpowiednie metody dostępu do tych pól.
   */

  /**
   *
   * @param autor - autor, którego dostępne książki szukamy
   * @return - Metoda ma zwrócić wszystkie książki danego autora spośród
   *           dostępnych do wypożyczenia książek. Jeśli nie ma dostępnych
   *           książek danego autora, funkcja ma zwrócić pustą listę.
   */
  public List<Ksiazka> podajDostepneKsiazkiAutora(String autor) {
    return null;
  }

  /**
   *
   * @param c - czytelnik, którego wypożyczone książki przeglądamy
   * @param k - książka, której tytułu szukamy
   * @return -  Metoda ma zwrócić 'true', jeśli czytelnik ('c') posiada książkę ('k')
   *            o danym tytule, lub 'false' jeśli nie posiada danej książki.
   *            Jeśli nie ma czytelnika 'c' wśród czytelników Biblioteki,
   *            funkcja ma zwrócić wyjątek IllegalArgumentException.
   */
  public boolean czyCzytelnikPosiadaDanaKsiazke(Czytelnik c, Ksiazka k) {
    return true;
  }

  /**
   *
   * @param c - czytelnik biblioteki, którego książek szukamy
   * @return - Metoda ma znalezc czytelnika wsród czytelników zarejestrowanych
   *           w Bibliotece (lista 'Biblioteka#czytelnicy') i wylistować książki,
   *           które wypożyczył. Jeśli czytelnik 'c' nie posiada żadnej wypożyczonej
   *           książki, to funkcja ma zwrócić pustą listę. Jeśli nie ma czytelnika
   *           'c' w liście czytelników (Biblioteka#czytelnicy), to funkcja
   *           ma zwrócić wyjątek IllegalArgumentException.
   */
  public List<Ksiazka> podajKsiazkiCzytelnika(Czytelnik c) {
    return null;
  }
}