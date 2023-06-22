package logic;
/**
 *
 *publiczny konstruktor z super z klasy Ksiazka - public Encyklopedia
 * publiczny getter - public String getRodzaj
 * publiczny setter - pulbluc voud setRodzaj
 */
public class Encyklopedia extends Ksiazka  {
    /**
     *
     */
    String rodzaj;
    public Encyklopedia (String tytul,int ilosc_stron,int rok_wydania, String rodzaj){

        super(tytul,ilosc_stron,rok_wydania);
        this.rodzaj = rodzaj;

    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }
}
