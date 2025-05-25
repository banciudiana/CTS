package Proxy.Pestera.clase;

public class Pestera implements IPestera{

    private int nrVizitatori;

    public int getNrVizitatori() {
        return nrVizitatori;
    }

    @Override
    public void vizitare(String nume) {
        this.nrVizitatori++;
        System.out.println("Pestera a fost vizitata de " + nume);
    }
}
