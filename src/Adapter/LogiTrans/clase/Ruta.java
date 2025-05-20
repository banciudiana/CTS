package Adapter.LogiTrans.clase;

public class Ruta {
    private double distanta;
    private int durata;
    private double cost;

    public Ruta(double distanta, int durata, double cost) {
        this.distanta = distanta;
        this.durata = durata;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "distanta=" + distanta +
                ", durata=" + durata +
                ", cost=" + cost +
                '}';
    }

    public double getDistanta() {
        return distanta;
    }

    public int getDurata() {
        return durata;
    }

    public double getCost() {
        return cost;
    }
}
