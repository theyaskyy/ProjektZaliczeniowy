package logic;
/**
 *
 *publiczny konstruktor z super z klasy Ksiazka - public Encyklopedia
 * publiczny getter - public String getRodzaj
 * publiczny setter - pulbluc voud setRodzaj
 */
public class Komiks extends Ksiazka{
    String glowny_bohater;
    public Komiks(String tytul,int ilosc_stron,int rok_wydania,String glowny_bohater){
        super(tytul,ilosc_stron,rok_wydania);
        this.glowny_bohater = glowny_bohater;
    }


    public String getGlowny_bohater() {
        return glowny_bohater;
    }

    public void setGlowny_bohater(String glowny_bohater) {
        this.glowny_bohater = glowny_bohater;
    }
}
