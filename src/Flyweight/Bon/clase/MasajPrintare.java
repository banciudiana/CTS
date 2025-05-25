package Flyweight.Bon.clase;

import Flyweight.Joc.clase.TipElement;

public class MasajPrintare implements IPrintare{
    private ETipPrintare tipPrintare;
    private String mesajPrintare;


    public MasajPrintare(ETipPrintare tipPrintare) {
        this.tipPrintare = tipPrintare;


        System.out.println("S a creat obj cu printare de tipul " + this.tipPrintare);
    }

    public ETipPrintare getTipPrintare() {
        return tipPrintare;
    }

    public String getMesajPrintare() {
        return mesajPrintare;
    }

    @Override
    public void printareBon(Bon bon) {
        System.out.println("s a printat in formatul " + this.tipPrintare);
        System.out.println(" se printeaza bonul ptr masa " + bon.getNrMasa());
    }
}
