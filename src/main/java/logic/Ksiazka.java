package logic;
/**
 *
 * default konstruktor - Ksiazka
* publiczny konstruktor wykorzystywany przez klasy Komiks Gazeta Encyklopedia
 * publiczne gettery
 * publiczne settery
 */
public class Ksiazka {

    public String tytul;
    public int ilosc_stron;
    public int rok_wydania;

    Ksiazka(){}
    public Ksiazka(String tytul, int ilosc_stron, int rok_wydania) {
        this.tytul = tytul;
        this.ilosc_stron = ilosc_stron;
        this.rok_wydania = rok_wydania;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getIlosc_stron() {
        return ilosc_stron;
    }

    public void setIlosc_stron(int ilosc_stron) {
        this.ilosc_stron = ilosc_stron;
    }

    public int getRok_wydania() {
        return rok_wydania;
    }

    public void setRok_wydania(int rok_wydania) {
        this.rok_wydania = rok_wydania;
    }
}
