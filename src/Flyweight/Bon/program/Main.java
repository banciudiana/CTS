package Flyweight.Bon.program;

import Flyweight.Bon.clase.Bon;
import Flyweight.Bon.clase.ETipPrintare;
import Flyweight.Bon.clase.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory.getMesajPrintare(ETipPrintare.TIP1).printareBon(new Bon(1,500));
        FlyweightFactory.getMesajPrintare(ETipPrintare.TIP2).printareBon(new Bon(2,200));
        FlyweightFactory.getMesajPrintare(ETipPrintare.TIP3);

        System.out.println(FlyweightFactory.getNrBonuri());
        System.out.println(FlyweightFactory.getNrMatriteBonuri());
    }
}
