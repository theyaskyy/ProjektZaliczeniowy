package logic;

public class Encyklopedia extends Ksiazka  {
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
