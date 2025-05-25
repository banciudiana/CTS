package Proxy.Pestera.clase;

import java.util.ArrayList;
import java.util.List;

public class ProxyPrestera implements IPestera{

    private List<String> listaVizitatori;
    private Pestera pestera;

    public ProxyPrestera(Pestera pestera) {
        this.pestera = pestera;
        listaVizitatori=new ArrayList<>();
    }


    @Override
    public void vizitare(String nume) {
        listaVizitatori.add(nume);
        if(listaVizitatori.size()==5){
            for (String vizitator:listaVizitatori) {
                pestera.vizitare(vizitator);
            }
            listaVizitatori.clear();

        }
    }

    public int getNrVizitatori(){
        return pestera.getNrVizitatori();
    }


}
