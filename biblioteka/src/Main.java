// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Przykładowe użycie
        Czytelnik czytelnik = new Czytelnik("Jan", "Kowalski", "1990-01-01", 1234);
        Bibliotekarz bibliotekarz = new Bibliotekarz("Anna", "Nowak", "1985-05-10", "2020-02-15");
        Ksiazka ksiazka = new Ksiazka("Wzgórze psów", "Stieg Larsson");

        System.out.println(czytelnik);
        System.out.println(bibliotekarz);
        System.out.println(ksiazka);

        czytelnik.wypozyczKsiazke(ksiazka);
        System.out.println(ksiazka);

        czytelnik.sprawdzCzyKsiazkaJestDostepna(ksiazka);

        System.out.println("Liczba wypożyczonych książek: " + czytelnik.ileKsiazekWypozyczylCzytelnik());
    }
}