package org.example;

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

    

}
