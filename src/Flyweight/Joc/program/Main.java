package Flyweight.Joc.program;

import Flyweight.Joc.clase.FlyweightFactory;
import Flyweight.Joc.clase.Joc;
import Flyweight.Joc.clase.TipElement;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory.getElement(TipElement.BARCA).desenare(10,10);

        Joc joc=new Joc();
        joc.adaugaElement(TipElement.BARCA,10,20);
        joc.adaugaElement(TipElement.NAVA, 10, 20);
        joc.adaugaElement(TipElement.NAVA, 10, 15);
        joc.adaugaElement(TipElement.SUBMARIN, 20, 10);
        joc.adaugaElement(TipElement.BARCA, 20, 40);

        joc.afiseazaCanvas();
        joc.lanseazaBullet(10);
        System.out.println("\nNumar punte castigate: "+ joc.getNrPuncte());
    }
}
