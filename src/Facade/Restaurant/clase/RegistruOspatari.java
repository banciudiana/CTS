package Facade.Restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class RegistruOspatari {
    private List<Ospatar> listaOspatari=new ArrayList<>();

    public void addOspatar(Ospatar ospatar){
        listaOspatari.add(ospatar);
    }

    public int getNrOspatariDisponibili(String data){
        int k=0;
        for(Ospatar o :listaOspatari){
            if(!o.isOcupat())
            {
                k++;
            }
        }
        return k;
    }

}
