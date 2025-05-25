package Chain.Restaurant;

public class Comanda {
    private int dificultateComanda;
    private String produs;
    private int cantitate;

    public Comanda(int dificultateComanda, String produs, int cantitate) {
        this.dificultateComanda = dificultateComanda;
        this.produs = produs;
        this.cantitate = cantitate;
    }

    public int getDificultateComanda() {
        return dificultateComanda;
    }

    public String getProdus() {
        return produs;
    }

    public int getCantitate() {
        return cantitate;
    }
}
