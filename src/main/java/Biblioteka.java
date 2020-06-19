import java.util.List;
import java.util.Optional;

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

  private String nazwaBiblioteki;
  private List<Czytelnik> czytelnicy;
  private List<Ksiazka> dostepneKsiazki;

  public Biblioteka(String nazwaBiblioteki, List<Czytelnik> czytelnicy,
      List<Ksiazka> dostepneKsiazki) {
    this.nazwaBiblioteki = nazwaBiblioteki;
    this.czytelnicy = czytelnicy;
    this.dostepneKsiazki = dostepneKsiazki;
  }

  public String getNazwaBiblioteki() {
    return nazwaBiblioteki;
  }

  public List<Czytelnik> getCzytelnicy() {
    return czytelnicy;
  }

  public List<Ksiazka> getDostepneKsiazki() {
    return dostepneKsiazki;
  }


  /**
   *
   * @param k - książka, której dostępność sprawdzamy
   * @return - Metoda ma zwrócić ksiązkę, jeśli jest dostępna,
   *           lub Optional.empty() jeśli nie jest dostępna.
   *           UWAGA: Ta funkcja może być użyta np. przez funkcję Biblioteka#wypozyczKsiazke,
   *           by sprawdzić, czy czytelnik w ogole może ją wypożyczyć.
   */
  public Optional<Ksiazka> czyKsiazkaJestDostepna(Ksiazka k) {
    return Optional.empty();
  }

  /**
   *
   * @param c - Czytelnik, który wypożycza książkę
   * @param k - ksiązka, którą czytelnik 'c' chce wypożyczyć
   * @return - Metoda zwraca 'true' jeśli czytlnikowi uda się wypożyczyć ksiązkę,
   *           lub 'false' jeśli nie tj. książka nie jest na liście dostępnych książek.
   */
  public boolean wypozyczKsiazke(Czytelnik c, Ksiazka k) {
    return true;
  }

  /**
   *
   * @param c - Czytelnik, który zwraca książkę
   * @param k - ksiązka, którą czytelnik 'c' chce zwrócić
   * @return - Metoda zwraca 'true' jeśli czytlnikowi uda się zwrócić ksiązkę,
   *           lub 'false' jeśli książka, już została zwrócona,
   *           tj. jest już na liście dostępnych książek.
   */
  public boolean zwrocKsiazke(Czytelnik c, Ksiazka k) {
    return true;
  }

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