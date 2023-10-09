class Ksiazka {
    private String tytul;
    private String autor;
    private boolean czyWypozyczona;

    public Ksiazka(String tytul, String autor) {
        this.tytul = tytul;
        this.autor = autor;
        this.czyWypozyczona = false;
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isCzyWypozyczona() {
        return czyWypozyczona;
    }

    public void setCzyWypozyczona(boolean czyWypozyczona) {
        this.czyWypozyczona = czyWypozyczona;
    }

    @Override
    public String toString() {
        return "Tytuł: " + tytul + ", Autor: " + autor + ", Czy wypożyczona: " + czyWypozyczona;
    }
}