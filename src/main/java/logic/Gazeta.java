package logic;
/**
 *
 *publiczny konstruktor z super z klasy Ksiazka - public Encyklopedia
 * publiczny getter - public String getRodzaj
 * publiczny setter - pulbluc voud setRodzaj
 */
public class Gazeta extends Ksiazka{
    boolean czyObrazki;

    public Gazeta(String tytul,int ilosc_stron,int rok_wydania,boolean czyObrazki){
        super(tytul,ilosc_stron,rok_wydania);
        this.czyObrazki = czyObrazki;
    }

    public boolean isCzyObrazki() {
        return czyObrazki;
    }

    public void setCzyObrazki(boolean czyObrazki) {
        this.czyObrazki = czyObrazki;
    }
}
