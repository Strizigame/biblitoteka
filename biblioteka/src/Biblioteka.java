import java.util.ArrayList;
import java.util.List;

class Biblioteka {
    private List<Czytelnik> czytelnicy;
    private List<Bibliotekarz> bibliotekarze;
    private List<Ksiazka> ksiazki;

    public Biblioteka() {
        this.czytelnicy = new ArrayList<>();
        this.bibliotekarze = new ArrayList<>();
        this.ksiazki = new ArrayList<>();
    }

    public List<Czytelnik> getCzytelnicy() {
        return czytelnicy;
    }

    public List<Bibliotekarz> getBibliotekarze() {
        return bibliotekarze;
    }

    public List<Ksiazka> getKsiazki() {
        return ksiazki;
    }

    public void dodajCzytelnika(Czytelnik czytelnik) {
        czytelnicy.add(czytelnik);
    }

    public void dodajBibliotekarza(Bibliotekarz bibliotekarz) {
        bibliotekarze.add(bibliotekarz);
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        ksiazki.add(ksiazka);
    }

    @Override
    public String toString() {
        return "Biblioteka: " +
                "\nCzytelnicy: " + czytelnicy +
                "\nBibliotekarze: " + bibliotekarze +
                "\nKsiążki: " + ksiazki;
    }
}