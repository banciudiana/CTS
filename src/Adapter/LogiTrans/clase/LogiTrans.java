package Adapter.LogiTrans.clase;

public class LogiTrans implements IRutaStandard{

    @Override
    public Ruta getRutaStandard(Client client) {
        int durata= 0;
        int cost=0;
        double distanta=0;
        if(client.getTipLivrare()== TipLivrare.CURIER)
        {
            durata=2;
            cost=5;
            distanta=20;
        } else {
            durata= 1;
            cost=2;
            distanta=10;
        }
        return new Ruta(distanta,durata,cost);
    }
}
