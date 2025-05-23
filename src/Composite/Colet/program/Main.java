package Composite.Colet.program;

import Composite.Colet.clase.Colet;
import Composite.Colet.clase.Composite;
import Composite.Colet.clase.INod;

public class Main {
    public static void main(String[] args) {
        INod container=new Composite(27);
        INod cutie= new Composite(5);
        INod cutie2=new Composite(2);
        INod subcutie=new Composite(6);

        INod colet1 = new Colet(5, false);
        INod colet2 = new Colet(5, false);
        INod colet3 = new Colet(5, false);
        INod colet4 = new Colet(5, false);
        INod colet5 = new Colet(5, false);

        container.adaugaNod(cutie);
        cutie.adaugaNod(cutie2);
        cutie2.adaugaNod(colet1);
        cutie2.adaugaNod(colet2);
        cutie2.adaugaNod(colet3);
        subcutie.adaugaNod(colet3);
        subcutie.adaugaNod(colet4);
        container.adaugaNod(subcutie);

        System.out.println(container.getGreutate());


    }
}
