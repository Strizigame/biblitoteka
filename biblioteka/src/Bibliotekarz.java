
class Bibliotekarz extends Osoba {
    private String dataZatrudnienia;

    public Bibliotekarz(String imie, String nazwisko, String dataUr, String dataZatrudnienia) {
        super(imie, nazwisko, dataUr);
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public String getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    @Override
    public String toString() {
        return super.toString() + ", Data zatrudnienia: " + dataZatrudnienia;
    }
}