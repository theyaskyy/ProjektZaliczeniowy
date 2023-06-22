package logic;

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
