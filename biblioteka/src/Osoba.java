
import java.util.ArrayList;
import java.util.List;
class Osoba {
    private String imie;
    private String nazwisko;
    private String dataUr;

    public Osoba(String imie, String nazwisko, String dataUr) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUr = dataUr;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getDataUr() {
        return dataUr;
    }

    @Override
    public String toString() {
        return "Imię: " + imie + ", Nazwisko: " + nazwisko + ", Data urodzenia: " + dataUr;
    }
}

// Klasa Czytelnik dziedzicząca po Osoba
