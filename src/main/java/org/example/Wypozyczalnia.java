package org.example;

/*
*publiczne klasy pobierajace z "magazynow" (tablic) które przetrzymują wczesniej utworzone obiekty i wyswietlające dane soutem

 */

import logic.Encyklopedia;
import logic.Gazeta;
import logic.Komiks;

public class Wypozyczalnia {

    Encyklopedia en1 = new Encyklopedia("Nauki przyrodniczne",342,1992,"przyrodnicze");
    Encyklopedia en2 = new Encyklopedia("Nauki przyrodniczne",342,1992,"przyrodnicze");
    Komiks kom1 = new Komiks("Powrot zła",34,1923,"Johny Bravo");
    Komiks kom2 = new Komiks("Powrot zła",42,1923,"Johny Bravo");
    Gazeta g1 = new Gazeta("Wyborcza",323,1923,false);
    Gazeta g2 = new Gazeta("Wyborcza",323,1923,false);


    Komiks[] komiks_magazyn = {kom1,kom2};
    Encyklopedia[] encyklopedia_magazyn = {en1,en2};
    Gazeta[] gazeta_magazyn = {g1,g2};

    public void pokazGazety(){
        for (int i = 0; i < gazeta_magazyn.length; i++) {
            System.out.println("tytul: " + gazeta_magazyn[i].tytul + " ilosc stron: " +gazeta_magazyn[i].ilosc_stron +" rok wydania: "+ gazeta_magazyn[i].rok_wydania + " czy ma obrazki: " + gazeta_magazyn[i].isCzyObrazki());
        }
    }
    public void pokazEncykolpedie(){
        for (int i = 0; i < encyklopedia_magazyn.length; i++) {
            System.out.println("tytul: " + encyklopedia_magazyn[i].tytul + " ilosc stron: " +encyklopedia_magazyn[i].ilosc_stron +" rok wydania: "+ encyklopedia_magazyn[i].rok_wydania + " czy ma obrazki: " + encyklopedia_magazyn[i].getRodzaj());
        }
    }
    public void pokazKomiksy(){
        for (int i = 0; i < komiks_magazyn.length; i++) {
            System.out.println("tytul: " + gazeta_magazyn[i].tytul + " ilosc stron: " +komiks_magazyn[i].ilosc_stron +" rok wydania: "+ komiks_magazyn[i].rok_wydania + " czy ma obrazki: " + komiks_magazyn[i].getGlowny_bohater());
        }
    }

}
