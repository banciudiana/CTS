package Facade.Hotel.clase;

import java.util.ArrayList;
import java.util.List;

public class CamereLibere {
    private List<Integer> listaCamereLibere;

    public CamereLibere(){
        listaCamereLibere =new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            listaCamereLibere.add(i);
        }
    }
    public boolean verificareCameraLibera(int nrCamera){
        return listaCamereLibere.contains(nrCamera);
    }
}
