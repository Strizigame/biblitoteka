import java.util.ArrayList;
import java.util.List;

class Czytelnik extends Osoba {
    private int nrCzytelnika;
    private List<Ksiazka> wypozyczoneKsiazki;

    public Czytelnik(String imie, String nazwisko, String dataUr, int nrCzytelnika) {
        super(imie, nazwisko, dataUr);
        this.nrCzytelnika = nrCzytelnika;
        this.wypozyczoneKsiazki = new ArrayList<>();
    }

    public int getNrCzytelnika() {
        return nrCzytelnika;
    }

    public List<Ksiazka> getWypozyczoneKsiazki() {
        return wypozyczoneKsiazki;
    }

    public void wypozyczKsiazke(Ksiazka ksiazka) {
        if (!ksiazka.isCzyWypozyczona()) {
            ksiazka.setCzyWypozyczona(true);
            wypozyczoneKsiazki.add(ksiazka);
        }
    }

    public boolean sprawdzCzyKsiazkaJestDostepna(Ksiazka ksiazka) {
        return !ksiazka.isCzyWypozyczona();
    }

    public int ileKsiazekWypozyczylCzytelnik() {
        return wypozyczoneKsiazki.size();
    }

    @Override
    public String toString() {
        return super.toString() + ", Nr czytelnika: " + nrCzytelnika + ", Wypożyczone książki: " + wypozyczoneKsiazki.size();
    }
}