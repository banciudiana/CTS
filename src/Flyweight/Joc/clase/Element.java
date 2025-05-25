package Flyweight.Joc.clase;

import Adapter.LogiTrans.clase.TipLivrare;

public class Element implements IElement{
    private TipElement tipElement;
    private String bitmapElement;

    public Element(TipElement tipElement, String bitmapElement) {
        this.tipElement = tipElement;
        this.bitmapElement = bitmapElement;
    }

    public TipElement getTipElement() {
        return tipElement;
    }

    public void setTipElement(TipElement tipElement) {
        this.tipElement = tipElement;
    }

    public String getBitmapElement() {
        return bitmapElement;
    }

    public void setBitmapElement(String bitmapElement) {
        this.bitmapElement = bitmapElement;
    }

    @Override
    public void desenare(int x, int y) {
        System.out.println("Elementul "+ tipElement+" a fost desenat la coordonatele " + x +" si " + y);
    }
}
