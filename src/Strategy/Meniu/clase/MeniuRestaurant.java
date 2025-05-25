package Strategy.Meniu.clase;

import java.util.ArrayList;

public class MeniuRestaurant {
    private ArrayList<OfertaMeniu> lista=new ArrayList<>();
    private IProcesabil strategieAlegere;

    public void addOfertaMeniu(OfertaMeniu ofertaMeniu){
        lista.add(ofertaMeniu);
    }

    public void setStrategieAlegere(IProcesabil strategieAlegere) {
        this.strategieAlegere = strategieAlegere;
    }

    public void setLista(ArrayList<OfertaMeniu> lista) {
        this.lista = lista;
    }

    public OfertaMeniu alegereOferta(){
        if(strategieAlegere!=null){
            return strategieAlegere.alegeMeniuOptim(lista);
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
