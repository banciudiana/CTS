package Flyweight.Bon.clase;

public class Bon {
    private int nrMasa;
    private float totalCost;

    public Bon(int nrMasa, float totalCost) {
        this.nrMasa = nrMasa;
        this.totalCost = totalCost;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public float getTotalCost() {
        return totalCost;
    }
}
